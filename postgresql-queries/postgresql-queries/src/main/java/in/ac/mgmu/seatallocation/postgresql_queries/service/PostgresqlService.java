package in.ac.mgmu.seatallocation.postgresql_queries.service;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

@Service
public class PostgresqlService {

    String cseseats = "twoforty";
    String mechseats = "thirty";
    String ectseats = "sixty";

    @PersistenceContext
    private EntityManager entityManager;

    @Transactional
    public void method1(String sourceTable, String targetTable) {
        String dropQuery = "DROP TABLE IF EXISTS " + targetTable;
        String createQuery = "CREATE TABLE " + targetTable + " AS TABLE " + sourceTable;
    }

    @Transactional
    public void created212candidiates(){
        String q00 = "DROP TABLE IF EXISTS merit_listp12";
        String q0 = "CREATE TABLE merit_listp12 ( Srno INTEGER,Rollno VARCHAR(20), cname VARCHAR(100), Category VARCHAR(20),prefer1 VARCHAR(20),prefer2 VARCHAR(20))";
        entityManager.createNativeQuery(q00).executeUpdate();
        entityManager.createNativeQuery(q0).executeUpdate();

        String q1 = "INSERT INTO merit_listp12 (Srno, Rollno, cname, Category, prefer1, prefer2) VALUES (1, '24133045', '1050SAKORKAR SHARANNYA', 'Open', 'cse', 'aiml')";
        entityManager.createNativeQuery(q1).executeUpdate();
        String q2 = "INSERT INTO merit_listp12 (Srno, Rollno, cname, Category, prefer1, prefer2) VALUES (2, '24234277', 'DIWAN PRERANA SUNIL', 'Open', 'cse', 'ect')";

    }

    @Transactional
    public void create_calculation_table(){
        String q00 = "DROP TABLE IF EXISTS calculation";
        String q0 = "CREATE TABLE calculation ( category VARCHAR(10), thirty INT, sixty INT, twoforty INT )";
        entityManager.createNativeQuery(q00).executeUpdate();
        entityManager.createNativeQuery(q0).executeUpdate();

        String c1 = "INSERT INTO calculation (category, thirty, sixty, twoforty) VALUES ('sc', 1, 3, 12)";
        entityManager.createNativeQuery(c1).executeUpdate();
        String c2 = "INSERT INTO calculation (category, thirty, sixty, twoforty) VALUES ('st', 1, 1, 6)";
        entityManager.createNativeQuery(c2).executeUpdate();

        String c7 = "INSERT INTO calculation (category, thirty, sixty, twoforty) VALUES ('obc', 2, 4, 18)";
        entityManager.createNativeQuery(c7).executeUpdate();
        String c8 = "INSERT INTO calculation (category, thirty, sixty, twoforty) VALUES ('sebc', 1, 2, 9)";
        entityManager.createNativeQuery(c8).executeUpdate();
        String c9 = "INSERT INTO calculation (category, thirty, sixty, twoforty) VALUES ('general', 3, 10, 43)";
        entityManager.createNativeQuery(c9).executeUpdate();
        String c12 = "INSERT INTO calculation (category, thirty, sixty, twoforty) VALUES ('ews', 3, 6, 24)";
        entityManager.createNativeQuery(c12).executeUpdate();

        String c11 = "INSERT INTO calculation (category, thirty, sixty, twoforty) VALUES ('intake', 30, 60, 240)";
        entityManager.createNativeQuery(c11).executeUpdate();
        String c13 = "INSERT INTO calculation (category, thirty, sixty, twoforty) VALUES ('actual', 33, 66, 264)";
        entityManager.createNativeQuery(c13).executeUpdate();
    }

    @Transactional
    public void duplicate_meritlist(){
        String m1 = "DROP TABLE IF EXISTS i1meritlist";
        entityManager.createNativeQuery(m1).executeUpdate();
        String m2 = "CREATE TABLE i1meritlist AS SELECT * FROM finalised_applicant";
        entityManager.createNativeQuery(m2).executeUpdate();
    }

    // more dept needed
    @Transactional
    public void separatebyp1(){
        String r1 = "DROP TABLE IF EXISTS csep1meritlist";
        entityManager.createNativeQuery(r1).executeUpdate();
        String r2 = "CREATE TABLE csep1meritlist AS SELECT * FROM i1meritlist";
        entityManager.createNativeQuery(r2).executeUpdate();
        String r3 = "DELETE FROM csep1meritlist WHERE prefer1 <> 'cse'";
        entityManager.createNativeQuery(r3).executeUpdate();
        String r4 = "DROP TABLE IF EXISTS mechp1meritlist";
        entityManager.createNativeQuery(r4).executeUpdate();
        String r5 = "CREATE TABLE mechp1meritlist AS SELECT * FROM i1meritlist";
        entityManager.createNativeQuery(r5).executeUpdate();
        String r6 = "DELETE FROM mechp1meritlist WHERE prefer1 <> 'mech'";
        entityManager.createNativeQuery(r6).executeUpdate();
    }

    @Transactional
    public void allocated_cse_r1i1_open(){
        //CSE_only OPEN , unallocatedcommonlist
        String w1 = "DROP TABLE IF EXISTS cseallocatedopen";
        entityManager.createNativeQuery(w1).executeUpdate();
        String w2 = "CREATE TABLE cseallocatedopen AS SELECT * FROM csep1meritlist LIMIT (SELECT "
                +cseseats+" FROM calculation WHERE category='general')";
        entityManager.createNativeQuery(w2).executeUpdate();
        String w3a = "DROP TABLE IF EXISTS cseunallocatedcommon";
        entityManager.createNativeQuery(w3a).executeUpdate();
        String w3 = "CREATE TABLE cseunallocatedcommon AS SELECT * FROM csep1meritlist";
        entityManager.createNativeQuery(w3).executeUpdate();
        String w4 = "DELETE FROM cseunallocatedcommon WHERE applicationid IN (SELECT applicationid FROM cseallocatedopen)";
        entityManager.createNativeQuery(w4).executeUpdate();
    }

    @Transactional
    public void allocated_mech_r1i1_open(){
        //CSE_only OPEN , unallocatedcommonlist
        String w1 = "DROP TABLE IF EXISTS mechallocatedopen";
        entityManager.createNativeQuery(w1).executeUpdate();
        String w2 = "CREATE TABLE mechallocatedopen AS SELECT * FROM mechp1meritlist LIMIT (SELECT "+
                mechseats+" FROM calculation WHERE category='open')";
        entityManager.createNativeQuery(w2).executeUpdate();
        String w3 = "DROP TABLE IF EXISTS mechunallocatedcommon";
        entityManager.createNativeQuery(w3).executeUpdate();
        String w4 = "CREATE TABLE mechunallocatedcommon AS SELECT * FROM mechp1meritlist";
        entityManager.createNativeQuery(w4).executeUpdate();
        String w5 = "DELETE FROM mechunallocatedcommon WHERE srno IN (SELECT srno FROM mechallocatedopen)";
        entityManager.createNativeQuery(w5).executeUpdate();
    }

    @Transactional
    public void allocated_cse_r1i1_scstntabcdobc(){
        //CSE_only SC
        String e1 = "DROP TABLE IF EXISTS cseallocatedSC";
        entityManager.createNativeQuery(e1).executeUpdate();
        String e2 = "CREATE TABLE cseallocatedSC AS SELECT * FROM cseunallocatedcommon";
        entityManager.createNativeQuery(e2).executeUpdate();
        String e3 = "DELETE FROM cseallocatedSC WHERE category <> 'SC'";
        entityManager.createNativeQuery(e3).executeUpdate();
        String e4 = "DELETE FROM cseallocatedSC WHERE srno NOT IN (SELECT srno FROM (SELECT srno FROM cseallocatedSC ORDER BY srno LIMIT (SELECT "
                +cseseats+" FROM calculation WHERE category='sc')) )";
        entityManager.createNativeQuery(e4).executeUpdate();
        //CSE_only ST
        String e5 = "DROP TABLE IF EXISTS cseallocatedST";
        entityManager.createNativeQuery(e5).executeUpdate();
        String e6 = "CREATE TABLE cseallocatedST AS SELECT * FROM cseunallocatedcommon";
        entityManager.createNativeQuery(e6).executeUpdate();
        String e7 = "DELETE FROM cseallocatedST WHERE category <> 'ST'";
        entityManager.createNativeQuery(e7).executeUpdate();
        String e8 = "DELETE FROM cseallocatedST WHERE srno NOT IN (SELECT srno FROM (SELECT srno FROM cseallocatedST ORDER BY srno LIMIT (SELECT "
                +cseseats+" FROM calculation WHERE category='st')) )";
        entityManager.createNativeQuery(e8).executeUpdate();
        //CSE_only NT-A
        String e9 = "DROP TABLE IF EXISTS cseallocatedNTC";
        entityManager.createNativeQuery(e9).executeUpdate();
        String e10 = "CREATE TABLE cseallocatedNTC AS SELECT * FROM cseunallocatedcommon";
        entityManager.createNativeQuery(e10).executeUpdate();
        String e11 = "DELETE FROM cseallocatedNTC WHERE category <> 'NTC'";
        entityManager.createNativeQuery(e11).executeUpdate();
        String e12 = "DELETE FROM cseallocatedNTC WHERE srno NOT IN (SELECT srno FROM (SELECT srno FROM cseallocatedNTC ORDER BY srno LIMIT (SELECT "
                +cseseats+" FROM calculation WHERE category='ntc')) )";
        entityManager.createNativeQuery(e12).executeUpdate();
        //CSE_only OBC
        String e13 = "DROP TABLE IF EXISTS cseallocatedOBC";
        entityManager.createNativeQuery(e13).executeUpdate();
        String e14 = "CREATE TABLE cseallocatedOBC AS SELECT * FROM cseunallocatedcommon";
        entityManager.createNativeQuery(e14).executeUpdate();
        String e15 = "DELETE FROM cseallocatedOBC WHERE category <> 'OBC'";
        entityManager.createNativeQuery(e15).executeUpdate();
        String e16 = "DELETE FROM cseallocatedOBC WHERE srno NOT IN (SELECT srno FROM (SELECT srno FROM cseallocatedOBC ORDER BY srno LIMIT (SELECT "
                +cseseats+" FROM calculation WHERE category='obc')) )";
        entityManager.createNativeQuery(e16).executeUpdate();
        //CSE_only SEBC
        String e17 = "DROP TABLE IF EXISTS cseallocatedSEBC";
        entityManager.createNativeQuery(e17).executeUpdate();
        String e18 = "CREATE TABLE cseallocatedSEBC AS SELECT * FROM cseunallocatedcommon";
        entityManager.createNativeQuery(e18).executeUpdate();
        String e19 = "DELETE FROM cseallocatedSEBC WHERE category <> 'SEBC'";
        entityManager.createNativeQuery(e19).executeUpdate();
        String e20 = "DELETE FROM cseallocatedSEBC WHERE srno NOT IN (SELECT srno FROM (SELECT srno FROM cseallocatedSEBC ORDER BY srno LIMIT (SELECT "
                +cseseats+" FROM calculation WHERE category='sebc')) )";
        entityManager.createNativeQuery(e20).executeUpdate();

    }

    @Transactional
    public void allocated_mech_r1i1_scstntabcdobc(){
        //mech_only SC
        String e1 = "DROP TABLE IF EXISTS mechallocatedSC";
        entityManager.createNativeQuery(e1).executeUpdate();
        String e2 = "CREATE TABLE mechallocatedSC AS SELECT * FROM mechunallocatedcommon";
        entityManager.createNativeQuery(e2).executeUpdate();
        String e3 = "DELETE FROM mechallocatedSC WHERE category <> 'SC'";
        entityManager.createNativeQuery(e3).executeUpdate();
        String e4 = "DELETE FROM mechallocatedSC WHERE srno NOT IN (SELECT srno FROM (SELECT srno FROM mechallocatedSC ORDER BY srno LIMIT (SELECT "
                +mechseats+" FROM calculation WHERE category='sc')) )";
        entityManager.createNativeQuery(e4).executeUpdate();
        //_only ST
        String e5 = "DROP TABLE IF EXISTS mechallocatedST";
        entityManager.createNativeQuery(e5).executeUpdate();
        String e6 = "CREATE TABLE mechallocatedST AS SELECT * FROM mechunallocatedcommon";
        entityManager.createNativeQuery(e6).executeUpdate();
        String e7 = "DELETE FROM mechallocatedST WHERE category <> 'ST'";
        entityManager.createNativeQuery(e7).executeUpdate();
        String e8 = "DELETE FROM mechallocatedST WHERE srno NOT IN (SELECT srno FROM (SELECT srno FROM mechallocatedST ORDER BY srno LIMIT (SELECT "
                +mechseats+" FROM calculation WHERE category='st')) )";
        entityManager.createNativeQuery(e8).executeUpdate();
        //_only NT-A
        String e9 = "DROP TABLE IF EXISTS mechallocatedNTC";
        entityManager.createNativeQuery(e9).executeUpdate();
        String e10 = "CREATE TABLE mechallocatedNTC AS SELECT * FROM mechunallocatedcommon";
        entityManager.createNativeQuery(e10).executeUpdate();
        String e11 = "DELETE FROM mechallocatedNTC WHERE category <> 'NTC'";
        entityManager.createNativeQuery(e11).executeUpdate();
        String e12 = "DELETE FROM mechallocatedNTC WHERE srno NOT IN (SELECT srno FROM (SELECT srno FROM mechallocatedNTC ORDER BY srno LIMIT (SELECT "
                +mechseats+" FROM calculation WHERE category='ntc')) )";
        entityManager.createNativeQuery(e12).executeUpdate();
        //_only OBC
        String e13 = "DROP TABLE IF EXISTS mechallocatedOBC";
        entityManager.createNativeQuery(e13).executeUpdate();
        String e14 = "CREATE TABLE mechallocatedOBC AS SELECT * FROM mechunallocatedcommon";
        entityManager.createNativeQuery(e14).executeUpdate();
        String e15 = "DELETE FROM mechallocatedOBC WHERE category <> 'OBC'";
        entityManager.createNativeQuery(e15).executeUpdate();
        String e16 = "DELETE FROM mechallocatedOBC WHERE srno NOT IN (SELECT srno FROM (SELECT srno FROM mechallocatedOBC ORDER BY srno LIMIT (SELECT "
                +mechseats+" FROM calculation WHERE category='obc')) )";
        entityManager.createNativeQuery(e16).executeUpdate();
        //_only SEBC
        String e17 = "DROP TABLE IF EXISTS mechallocatedSEBC";
        entityManager.createNativeQuery(e17).executeUpdate();
        String e18 = "CREATE TABLE mechallocatedSEBC AS SELECT * FROM mechunallocatedcommon";
        entityManager.createNativeQuery(e18).executeUpdate();
        String e19 = "DELETE FROM mechallocatedSEBC WHERE category <> 'SEBC'";
        entityManager.createNativeQuery(e19).executeUpdate();
        String e20 = "DELETE FROM mechallocatedSEBC WHERE srno NOT IN (SELECT srno FROM (SELECT srno FROM mechallocatedSEBC ORDER BY srno LIMIT (SELECT "
                +mechseats+" FROM calculation WHERE category='sebc')) )";
        entityManager.createNativeQuery(e20).executeUpdate();

    }

    @Transactional
    public void r1i2prepare(){
        String t1 = "DROP TABLE IF EXISTS cseallocated_r1i1";
        entityManager.createNativeQuery(t1).executeUpdate();
        String t2 = "CREATE TABLE cseallocated_r1i1 AS SELECT Srno, rollno, cname, category FROM cseallocatedntc UNION ALL SELECT Srno, rollno, cname, category FROM cseallocatedst UNION ALL SELECT Srno, rollno, cname, category FROM cseallocatedsc UNION ALL SELECT Srno, rollno, cname, category FROM cseallocatedopen UNION ALL SELECT Srno, rollno, cname, category FROM cseallocatedobc";
        entityManager.createNativeQuery(t2).executeUpdate();
        String t3 = "DROP TABLE IF EXISTS cseunallocated_r1i1";
        entityManager.createNativeQuery(t3).executeUpdate();
        String t4 = "CREATE TABLE cseunallocated_r1i1 AS SELECT * FROM csep1meritlist;";
        entityManager.createNativeQuery(t4).executeUpdate();
        String t5 = " DELETE FROM cseunallocated_r1i1 WHERE srno IN (SELECT srno FROM cseallocated_r1i1)";
        entityManager.createNativeQuery(t5).executeUpdate();
    }
}
