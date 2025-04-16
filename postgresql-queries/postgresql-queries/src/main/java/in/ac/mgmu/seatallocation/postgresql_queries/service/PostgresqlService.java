package in.ac.mgmu.seatallocation.postgresql_queries.service;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

@Service
public class PostgresqlService {

    String ect = "sixty";

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
        entityManager.createNativeQuery(q2).executeUpdate();
        String q3 = "INSERT INTO merit_listp12 (Srno, Rollno, cname, Category, prefer1, prefer2) VALUES (3, '24182475', 'BYADGI PUSHKAR VINAY', 'SC', 'mech', 'ect')";
        entityManager.createNativeQuery(q3).executeUpdate();
        String q4 = "INSERT INTO merit_listp12 (Srno, Rollno, cname, Category, prefer1, prefer2) VALUES (4, '24148455', 'MOKSH NIMESH PATEL', 'SC', 'cse', 'ect')";
        entityManager.createNativeQuery(q4).executeUpdate();
        String q5 = "INSERT INTO merit_listp12 (Srno, Rollno, cname, Category, prefer1, prefer2) VALUES (5, '24153437', 'SAGAR ANKITA ASHOK', 'SC', 'cse', 'ect')";
        entityManager.createNativeQuery(q5).executeUpdate();
        String q6 = "INSERT INTO merit_listp12 (Srno, Rollno, cname, Category, prefer1, prefer2) VALUES (6, '24109582', 'GUPTA HARSHVARDHAN NAVENDU', 'SC', 'cse', 'cse')";
        entityManager.createNativeQuery(q6).executeUpdate();
        String q7 = "INSERT INTO merit_listp12 (Srno, Rollno, cname, Category, prefer1, prefer2) VALUES (7, '24180444', 'SAMRUDDHI SUDHAKAR OMBASE', 'NTC', 'cse', 'ect')";
        entityManager.createNativeQuery(q7).executeUpdate();
        String q8 = "INSERT INTO merit_listp12 (Srno, Rollno, cname, Category, prefer1, prefer2) VALUES (8, '24232199', 'SHAH VANSHIKA SACHINKUMAR', 'SC', 'cse', 'ect')";
        entityManager.createNativeQuery(q8).executeUpdate();
        String q9 = "INSERT INTO merit_listp12 (Srno, Rollno, cname, Category, prefer1, prefer2) VALUES (9, '24188835', 'PRANAV ARORA', 'Open', 'cse', 'ect')";
        entityManager.createNativeQuery(q9).executeUpdate();
        String q10 = "INSERT INTO merit_listp12 (Srno, Rollno, cname, Category, prefer1, prefer2) VALUES (10, '24138003', 'BHURE ARYAN DATTATRAY', 'OBC', 'mech', 'ect')";
        entityManager.createNativeQuery(q10).executeUpdate();
        String q11 = "INSERT INTO merit_listp12 (Srno, Rollno, cname, Category, prefer1, prefer2) VALUES (11, '24122197', 'SONI MADHAV PAWANKUMAR', 'ST', 'cse', 'ect')";
        entityManager.createNativeQuery(q11).executeUpdate();
        String q12 = "INSERT INTO merit_listp12 (Srno, Rollno, cname, Category, prefer1, prefer2) VALUES (12, '24187372', 'GAWAND PRANAV TANAJI', 'NTC', 'cse', 'ect')";
        entityManager.createNativeQuery(q12).executeUpdate();
        String q13 = "INSERT INTO merit_listp12 (Srno, Rollno, cname, Category, prefer1, prefer2) VALUES (13, '24142634', 'AKSHAT TIKARIA', 'ST', 'mech', 'ect')";
        entityManager.createNativeQuery(q13).executeUpdate();
        String q14 = "INSERT INTO merit_listp12 (Srno, Rollno, cname, Category, prefer1, prefer2) VALUES (14, '24248558', 'MAHALLE OM VILAS', 'OBC', 'cse', 'ect')";
        entityManager.createNativeQuery(q14).executeUpdate();
        String q15 = "INSERT INTO merit_listp12 (Srno, Rollno, cname, Category, prefer1, prefer2) VALUES (15, '24155293', 'DETHE VED CHANDRASHEKHAR', 'OBC', 'cse', 'ect')";
        entityManager.createNativeQuery(q15).executeUpdate();
        String q16 = "INSERT INTO merit_listp12 (Srno, Rollno, cname, Category, prefer1, prefer2) VALUES (16, '24180600', 'CHINMAY DATTAPRASAD GHATE', 'ST', 'mech', 'ect')";
        entityManager.createNativeQuery(q16).executeUpdate();
        String q17 = "INSERT INTO merit_listp12 (Srno, Rollno, cname, Category, prefer1, prefer2) VALUES (17, '24284644', 'MAHESHWARY ANANT PRASHANT', 'ST', 'cse', 'ect')";
        entityManager.createNativeQuery(q17).executeUpdate();
        String q18 = "INSERT INTO merit_listp12 (Srno, Rollno, cname, Category, prefer1, prefer2) VALUES (18, '24247858', 'KALE UDAY GANESH', 'ST', 'cse', 'ect')";
        entityManager.createNativeQuery(q18).executeUpdate();
        String q19 = "INSERT INTO merit_listp12 (Srno, Rollno, cname, Category, prefer1, prefer2) VALUES (19, '24128986', 'PUJARI VEDANT ASHOK', 'NTC', 'cse', 'aiml')";
        entityManager.createNativeQuery(q19).executeUpdate();
        String q20 = "INSERT INTO merit_listp12 (Srno, Rollno, cname, Category, prefer1, prefer2) VALUES (20, '24239161', 'CHOUHAN SUYANSH ARVINDKUMAR', 'ST', 'mech', 'ect')";
        entityManager.createNativeQuery(q20).executeUpdate();
        String q21 = "INSERT INTO merit_listp12 (Srno, Rollno, cname, Category, prefer1, prefer2) VALUES (21, '24213808', 'SHIMPI MANDAR SANDIP', 'OBC', 'cse', 'ect')";
        entityManager.createNativeQuery(q21).executeUpdate();
        String q22 = "INSERT INTO merit_listp12 (Srno, Rollno, cname, Category, prefer1, prefer2) VALUES (22, '24140600', 'GAIKWAD YUVRAJ YASHWANT', 'ST', 'cse', 'ect')";
        entityManager.createNativeQuery(q22).executeUpdate();
        String q23 = "INSERT INTO merit_listp12 (Srno, Rollno, cname, Category, prefer1, prefer2) VALUES (23, '24216328', 'ANIRUDH ARVIND MAHAPATRA', 'ST', 'mech', 'ect')";
        entityManager.createNativeQuery(q23).executeUpdate();
        String q24 = "INSERT INTO merit_listp12 (Srno, Rollno, cname, Category, prefer1, prefer2) VALUES (24, '24143166', 'SAWANT ASHANI SANJAY', 'Open', 'cse', 'ect')";
        entityManager.createNativeQuery(q24).executeUpdate();
        String q25 = "INSERT INTO merit_listp12 (Srno, Rollno, cname, Category, prefer1, prefer2) VALUES (25, '24140840', 'RANDIVE RIDDHESH KALIDAS', 'OBC', 'cse', 'ect')";
        entityManager.createNativeQuery(q25).executeUpdate();
        String q26 = "INSERT INTO merit_listp12 (Srno, Rollno, cname, Category, prefer1, prefer2) VALUES (26, '24180556', 'PRAJAPATI JENIL NILESH', 'Open', 'cse', 'ect')";
        entityManager.createNativeQuery(q26).executeUpdate();
        String q27 = "INSERT INTO merit_listp12 (Srno, Rollno, cname, Category, prefer1, prefer2) VALUES (27, '24136441', 'SHREYASH CHANDRA', 'Open', 'cse', 'aiml')";
        entityManager.createNativeQuery(q27).executeUpdate();
        String q28 = "INSERT INTO merit_listp12 (Srno, Rollno, cname, Category, prefer1, prefer2) VALUES (28, '24171047', 'MULWANI KRISH NARESH', 'Open', 'cse', 'ect')";
        entityManager.createNativeQuery(q28).executeUpdate();
        String q29 = "INSERT INTO merit_listp12 (Srno, Rollno, cname, Category, prefer1, prefer2) VALUES (29, '24174889', 'GANDHEWAR SWAYAM PARAG', 'Open', 'cse', 'ect')";
        entityManager.createNativeQuery(q29).executeUpdate();
        String q30 = "INSERT INTO merit_listp12 (Srno, Rollno, cname, Category, prefer1, prefer2) VALUES (30, '24121814', 'UTKARSH GUPTA', 'Open', 'cse', 'ect')";
        entityManager.createNativeQuery(q30).executeUpdate();
        String q31 = "INSERT INTO merit_listp12 (Srno, Rollno, cname, Category, prefer1, prefer2) VALUES (31, '24182021', 'KATDARE KAIVALYA GIRISH', 'Open', 'cse', 'ect')";
        entityManager.createNativeQuery(q31).executeUpdate();
        String q32 = "INSERT INTO merit_listp12 (Srno, Rollno, cname, Category, prefer1, prefer2) VALUES (32, '24140393', 'DALAL JINANSH PUNITKUMAR', 'Open', 'cse', 'ect')";
        entityManager.createNativeQuery(q32).executeUpdate();
        String q33 = "INSERT INTO merit_listp12 (Srno, Rollno, cname, Category, prefer1, prefer2) VALUES (33, '24146673', 'BHATTAD PRANAV HEMANT', 'Open', 'mech', 'ect')";
        entityManager.createNativeQuery(q33).executeUpdate();
        String q34 = "INSERT INTO merit_listp12 (Srno, Rollno, cname, Category, prefer1, prefer2) VALUES (34, '24138347', 'MORE PRAJWAL PRAMOD', 'OBC', 'cse', 'ect')";
        entityManager.createNativeQuery(q34).executeUpdate();
        String q35 = "INSERT INTO merit_listp12 (Srno, Rollno, cname, Category, prefer1, prefer2) VALUES (35, '24217471', 'WADKILE TUSHAR RAOSAHEB', 'Open', 'cse', 'ect')";
        entityManager.createNativeQuery(q35).executeUpdate();
        String q36 = "INSERT INTO merit_listp12 (Srno, Rollno, cname, Category, prefer1, prefer2) VALUES (36, '24114837', 'JAMDAR JIBRAN JAVED', 'Open', 'cse', 'cse')";
        entityManager.createNativeQuery(q36).executeUpdate();
        String q37 = "INSERT INTO merit_listp12 (Srno, Rollno, cname, Category, prefer1, prefer2) VALUES (37, '24138682', 'HAJARNIS INDRANEEL AMOL', 'Open', 'cse', 'ect')";
        entityManager.createNativeQuery(q37).executeUpdate();
        String q38 = "INSERT INTO merit_listp12 (Srno, Rollno, cname, Category, prefer1, prefer2) VALUES (38, '24137219', 'JADHAV MANTHAN BHARAT', 'NTC', 'cse', 'ect')";
        entityManager.createNativeQuery(q38).executeUpdate();
        String q39 = "INSERT INTO merit_listp12 (Srno, Rollno, cname, Category, prefer1, prefer2) VALUES (39, '24270587', 'BADHE VAISHNAVI AMOL', 'Open', 'mech', 'ect')";
        entityManager.createNativeQuery(q39).executeUpdate();
        String q40 = "INSERT INTO merit_listp12 (Srno, Rollno, cname, Category, prefer1, prefer2) VALUES (40, '24240356', 'DESHMUKH YASH SUNIL', 'OBC', 'cse', 'ect')";
        entityManager.createNativeQuery(q40).executeUpdate();
        String q41 = "INSERT INTO merit_listp12 (Srno, Rollno, cname, Category, prefer1, prefer2) VALUES (41, '24274745', 'AGARWAL SIDDHANT LALIT', 'Open', 'mech', 'ect')";
        entityManager.createNativeQuery(q41).executeUpdate();
        String q42 = "INSERT INTO merit_listp12 (Srno, Rollno, cname, Category, prefer1, prefer2) VALUES (42, '24299270', 'NACHAN YASH DNYANDEV', 'NTC', 'cse', 'ect')";
        entityManager.createNativeQuery(q42).executeUpdate();
        String q43 = "INSERT INTO merit_listp12 (Srno, Rollno, cname, Category, prefer1, prefer2) VALUES (43, '24135545', 'SHINDE HARSHWARDHAN YUVARAJ', 'Open', 'cse', 'aiml')";
        entityManager.createNativeQuery(q43).executeUpdate();
        String q44 = "INSERT INTO merit_listp12 (Srno, Rollno, cname, Category, prefer1, prefer2) VALUES (44, '24137438', 'SONAWANE PRACHI PRAMOD', 'OBC', 'cse', 'ect')";
        entityManager.createNativeQuery(q44).executeUpdate();
        String q45 = "INSERT INTO merit_listp12 (Srno, Rollno, cname, Category, prefer1, prefer2) VALUES (45, '24237781', 'ISHAAN SAMEER SARDESHMUKH', 'Open', 'cse', 'ect')";
        entityManager.createNativeQuery(q45).executeUpdate();
        String q46 = "INSERT INTO merit_listp12 (Srno, Rollno, cname, Category, prefer1, prefer2) VALUES (46, '24214884', 'KARAMBALKAR HARSH JITIN', 'Open', 'cse', 'ect')";
        entityManager.createNativeQuery(q46).executeUpdate();
        String q47 = "INSERT INTO merit_listp12 (Srno, Rollno, cname, Category, prefer1, prefer2) VALUES (47, '24102832', 'MOHIT VIVEK JAIN', 'Open', 'cse', 'cse')";
        entityManager.createNativeQuery(q47).executeUpdate();
        String q48 = "INSERT INTO merit_listp12 (Srno, Rollno, cname, Category, prefer1, prefer2) VALUES (48, '24199852', 'PASARE SARVESH DATTATRAY', 'Open', 'cse', 'ect')";
        entityManager.createNativeQuery(q48).executeUpdate();
        String q49 = "INSERT INTO merit_listp12 (Srno, Rollno, cname, Category, prefer1, prefer2) VALUES (49, '24180314', 'AHUJA KARAN SANJAY', 'Open', 'mech', 'ect')";
        entityManager.createNativeQuery(q49).executeUpdate();
        String q50 = "INSERT INTO merit_listp12 (Srno, Rollno, cname, Category, prefer1, prefer2) VALUES (50, '24301030', 'LABHSHETWAR SOHAM LAXMIKANT', 'Open', 'cse', 'ect')";
        entityManager.createNativeQuery(q50).executeUpdate();
        String q51 = "INSERT INTO merit_listp12 (Srno, Rollno, cname, Category, prefer1, prefer2) VALUES (51, '24141393', 'KOTHALKAR YASH ANKUR', 'Open', 'cse', 'ect')";
        entityManager.createNativeQuery(q51).executeUpdate();
        String q52 = "INSERT INTO merit_listp12 (Srno, Rollno, cname, Category, prefer1, prefer2) VALUES (52, '24115323', 'WAGHMARE JAYESH SANJAY', 'OBC', 'cse', 'cse')";
        entityManager.createNativeQuery(q52).executeUpdate();
        String q53 = "INSERT INTO merit_listp12 (Srno, Rollno, cname, Category, prefer1, prefer2) VALUES (53, '24210161', 'PHARTADE DNYANESHWARI ANIL', 'OBC', 'cse', 'ect')";
        entityManager.createNativeQuery(q53).executeUpdate();
        String q54 = "INSERT INTO merit_listp12 (Srno, Rollno, cname, Category, prefer1, prefer2) VALUES (54, '24133049', 'SAKORKAR SHARANNYA', 'Open', 'cse', 'aiml')";
        entityManager.createNativeQuery(q54).executeUpdate();
        String q55 = "INSERT INTO merit_listp12 (Srno, Rollno, cname, Category, prefer1, prefer2) VALUES (55, '24234281', 'DIWAN PRERANA SUNIL', 'Open', 'cse', 'ect')";
        entityManager.createNativeQuery(q55).executeUpdate();
        String q56 = "INSERT INTO merit_listp12 (Srno, Rollno, cname, Category, prefer1, prefer2) VALUES (56, '24182479', 'BYADGI PUSHKAR VINAY', 'SC', 'mech', 'ect')";
        entityManager.createNativeQuery(q56).executeUpdate();
        String q57 = "INSERT INTO merit_listp12 (Srno, Rollno, cname, Category, prefer1, prefer2) VALUES (57, '24148459', 'MOKSH NIMESH PATEL', 'SC', 'cse', 'ect')";
        entityManager.createNativeQuery(q57).executeUpdate();
        String q58 = "INSERT INTO merit_listp12 (Srno, Rollno, cname, Category, prefer1, prefer2) VALUES (58, '24153441', 'SAGAR ANKITA ASHOK', 'SC', 'cse', 'ect')";
        entityManager.createNativeQuery(q58).executeUpdate();
        String q59 = "INSERT INTO merit_listp12 (Srno, Rollno, cname, Category, prefer1, prefer2) VALUES (59, '24109586', 'GUPTA HARSHVARDHAN NAVENDU', 'SC', 'cse', 'cse')";
        entityManager.createNativeQuery(q59).executeUpdate();
        String q60 = "INSERT INTO merit_listp12 (Srno, Rollno, cname, Category, prefer1, prefer2) VALUES (60, '24180448', 'SAMRUDDHI SUDHAKAR OMBASE', 'NTC', 'cse', 'ect')";
        entityManager.createNativeQuery(q60).executeUpdate();
        String q61 = "INSERT INTO merit_listp12 (Srno, Rollno, cname, Category, prefer1, prefer2) VALUES (61, '24232203', 'SHAH VANSHIKA SACHINKUMAR', 'SC', 'cse', 'ect')";
        entityManager.createNativeQuery(q61).executeUpdate();
        String q62 = "INSERT INTO merit_listp12 (Srno, Rollno, cname, Category, prefer1, prefer2) VALUES (62, '24188839', 'PRANAV ARORA', 'Open', 'cse', 'ect')";
        entityManager.createNativeQuery(q62).executeUpdate();
        String q63 = "INSERT INTO merit_listp12 (Srno, Rollno, cname, Category, prefer1, prefer2) VALUES (63, '24138007', 'BHURE ARYAN DATTATRAY', 'OBC', 'mech', 'ect')";
        entityManager.createNativeQuery(q63).executeUpdate();
        String q64 = "INSERT INTO merit_listp12 (Srno, Rollno, cname, Category, prefer1, prefer2) VALUES (64, '24122201', 'SONI MADHAV PAWANKUMAR', 'ST', 'cse', 'ect')";
        entityManager.createNativeQuery(q64).executeUpdate();
        String q65 = "INSERT INTO merit_listp12 (Srno, Rollno, cname, Category, prefer1, prefer2) VALUES (65, '24187376', 'GAWAND PRANAV TANAJI', 'NTC', 'cse', 'ect')";
        entityManager.createNativeQuery(q65).executeUpdate();
        String q66 = "INSERT INTO merit_listp12 (Srno, Rollno, cname, Category, prefer1, prefer2) VALUES (66, '24142638', 'AKSHAT TIKARIA', 'ST', 'mech', 'ect')";
        entityManager.createNativeQuery(q66).executeUpdate();
        String q67 = "INSERT INTO merit_listp12 (Srno, Rollno, cname, Category, prefer1, prefer2) VALUES (67, '24248562', 'MAHALLE OM VILAS', 'OBC', 'cse', 'ect')";
        entityManager.createNativeQuery(q67).executeUpdate();
        String q68 = "INSERT INTO merit_listp12 (Srno, Rollno, cname, Category, prefer1, prefer2) VALUES (68, '24155297', 'DETHE VED CHANDRASHEKHAR', 'OBC', 'cse', 'ect')";
        entityManager.createNativeQuery(q68).executeUpdate();
        String q69 = "INSERT INTO merit_listp12 (Srno, Rollno, cname, Category, prefer1, prefer2) VALUES (69, '24180604', 'CHINMAY DATTAPRASAD GHATE', 'ST', 'mech', 'ect')";
        entityManager.createNativeQuery(q69).executeUpdate();
        String q70 = "INSERT INTO merit_listp12 (Srno, Rollno, cname, Category, prefer1, prefer2) VALUES (70, '24284648', 'MAHESHWARY ANANT PRASHANT', 'ST', 'cse', 'ect')";
        entityManager.createNativeQuery(q70).executeUpdate();
        String q71 = "INSERT INTO merit_listp12 (Srno, Rollno, cname, Category, prefer1, prefer2) VALUES (71, '24247862', 'KALE UDAY GANESH', 'ST', 'cse', 'ect')";
        entityManager.createNativeQuery(q71).executeUpdate();
        String q72 = "INSERT INTO merit_listp12 (Srno, Rollno, cname, Category, prefer1, prefer2) VALUES (72, '24128990', 'PUJARI VEDANT ASHOK', 'NTC', 'cse', 'aiml')";
        entityManager.createNativeQuery(q72).executeUpdate();
        String q73 = "INSERT INTO merit_listp12 (Srno, Rollno, cname, Category, prefer1, prefer2) VALUES (73, '24239165', 'CHOUHAN SUYANSH ARVINDKUMAR', 'ST', 'cse', 'ect')";
        entityManager.createNativeQuery(q73).executeUpdate();
        String q74 = "INSERT INTO merit_listp12 (Srno, Rollno, cname, Category, prefer1, prefer2) VALUES (74, '24213812', 'SHIMPI MANDAR SANDIP', 'OBC', 'cse', 'ect')";
        entityManager.createNativeQuery(q74).executeUpdate();
        String q75 = "INSERT INTO merit_listp12 (Srno, Rollno, cname, Category, prefer1, prefer2) VALUES (75, '24140604', 'GAIKWAD YUVRAJ YASHWANT', 'ST', 'cse', 'ect')";
        entityManager.createNativeQuery(q75).executeUpdate();
        String q76 = "INSERT INTO merit_listp12 (Srno, Rollno, cname, Category, prefer1, prefer2) VALUES (76, '24216332', 'ANIRUDH ARVIND MAHAPATRA', 'ST', 'mech', 'ect')";
        entityManager.createNativeQuery(q76).executeUpdate();
        String q77 = "INSERT INTO merit_listp12 (Srno, Rollno, cname, Category, prefer1, prefer2) VALUES (77, '24143170', 'SAWANT ASHANI SANJAY', 'Open', 'cse', 'ect')";
        entityManager.createNativeQuery(q77).executeUpdate();
        String q78 = "INSERT INTO merit_listp12 (Srno, Rollno, cname, Category, prefer1, prefer2) VALUES (78, '24140844', 'RANDIVE RIDDHESH KALIDAS', 'OBC', 'cse', 'ect')";
        entityManager.createNativeQuery(q78).executeUpdate();
        String q79 = "INSERT INTO merit_listp12 (Srno, Rollno, cname, Category, prefer1, prefer2) VALUES (79, '24180560', 'PRAJAPATI JENIL NILESH', 'Open', 'cse', 'ect')";
        entityManager.createNativeQuery(q79).executeUpdate();
        String q80 = "INSERT INTO merit_listp12 (Srno, Rollno, cname, Category, prefer1, prefer2) VALUES (80, '24136445', 'SHREYASH CHANDRA', 'Open', 'cse', 'aiml')";
        entityManager.createNativeQuery(q80).executeUpdate();
        String q81 = "INSERT INTO merit_listp12 (Srno, Rollno, cname, Category, prefer1, prefer2) VALUES (81, '24171051', 'MULWANI KRISH NARESH', 'Open', 'cse', 'ect')";
        entityManager.createNativeQuery(q81).executeUpdate();
        String q82 = "INSERT INTO merit_listp12 (Srno, Rollno, cname, Category, prefer1, prefer2) VALUES (82, '24174893', 'GANDHEWAR SWAYAM PARAG', 'Open', 'cse', 'ect')";
        entityManager.createNativeQuery(q82).executeUpdate();
        String q83 = "INSERT INTO merit_listp12 (Srno, Rollno, cname, Category, prefer1, prefer2) VALUES (83, '24121818', 'UTKARSH GUPTA', 'Open', 'cse', 'ect')";
        entityManager.createNativeQuery(q83).executeUpdate();
        String q84 = "INSERT INTO merit_listp12 (Srno, Rollno, cname, Category, prefer1, prefer2) VALUES (84, '24182025', 'KATDARE KAIVALYA GIRISH', 'Open', 'cse', 'ect')";
        entityManager.createNativeQuery(q84).executeUpdate();
        String q85 = "INSERT INTO merit_listp12 (Srno, Rollno, cname, Category, prefer1, prefer2) VALUES (85, '24140397', 'DALAL JINANSH PUNITKUMAR', 'Open', 'cse', 'ect')";
        entityManager.createNativeQuery(q85).executeUpdate();
        String q86 = "INSERT INTO merit_listp12 (Srno, Rollno, cname, Category, prefer1, prefer2) VALUES (86, '24146677', 'BHATTAD PRANAV HEMANT', 'Open', 'mech', 'ect')";
        entityManager.createNativeQuery(q86).executeUpdate();
        String q87 = "INSERT INTO merit_listp12 (Srno, Rollno, cname, Category, prefer1, prefer2) VALUES (87, '24138351', 'MORE PRAJWAL PRAMOD', 'OBC', 'cse', 'ect')";
        entityManager.createNativeQuery(q87).executeUpdate();
        String q88 = "INSERT INTO merit_listp12 (Srno, Rollno, cname, Category, prefer1, prefer2) VALUES (88, '24217475', 'WADKILE TUSHAR RAOSAHEB', 'Open', 'cse', 'ect')";
        entityManager.createNativeQuery(q88).executeUpdate();
        String q89 = "INSERT INTO merit_listp12 (Srno, Rollno, cname, Category, prefer1, prefer2) VALUES (89, '24114841', 'JAMDAR JIBRAN JAVED', 'Open', 'cse', 'cse')";
        entityManager.createNativeQuery(q89).executeUpdate();
        String q90 = "INSERT INTO merit_listp12 (Srno, Rollno, cname, Category, prefer1, prefer2) VALUES (90, '24138686', 'HAJARNIS INDRANEEL AMOL', 'Open', 'cse', 'ect')";
        entityManager.createNativeQuery(q90).executeUpdate();
        String q91 = "INSERT INTO merit_listp12 (Srno, Rollno, cname, Category, prefer1, prefer2) VALUES (91, '24137223', 'JADHAV MANTHAN BHARAT', 'NTC', 'cse', 'ect')";
        entityManager.createNativeQuery(q91).executeUpdate();
        String q92 = "INSERT INTO merit_listp12 (Srno, Rollno, cname, Category, prefer1, prefer2) VALUES (92, '24270591', 'BADHE VAISHNAVI AMOL', 'Open', 'mech', 'ect')";
        entityManager.createNativeQuery(q92).executeUpdate();
        String q93 = "INSERT INTO merit_listp12 (Srno, Rollno, cname, Category, prefer1, prefer2) VALUES (93, '24240360', 'DESHMUKH YASH SUNIL', 'OBC', 'cse', 'ect')";
        entityManager.createNativeQuery(q93).executeUpdate();
        String q94 = "INSERT INTO merit_listp12 (Srno, Rollno, cname, Category, prefer1, prefer2) VALUES (94, '24274749', 'AGARWAL SIDDHANT LALIT', 'Open', 'mech', 'ect')";
        entityManager.createNativeQuery(q94).executeUpdate();
        String q95 = "INSERT INTO merit_listp12 (Srno, Rollno, cname, Category, prefer1, prefer2) VALUES (95, '24299274', 'NACHAN YASH DNYANDEV', 'NTC', 'cse', 'ect')";
        entityManager.createNativeQuery(q95).executeUpdate();
        String q96 = "INSERT INTO merit_listp12 (Srno, Rollno, cname, Category, prefer1, prefer2) VALUES (96, '24135549', 'SHINDE HARSHWARDHAN YUVARAJ', 'Open', 'cse', 'aiml')";
        entityManager.createNativeQuery(q96).executeUpdate();
        String q97 = "INSERT INTO merit_listp12 (Srno, Rollno, cname, Category, prefer1, prefer2) VALUES (97, '24137442', 'SONAWANE PRACHI PRAMOD', 'OBC', 'cse', 'ect')";
        entityManager.createNativeQuery(q97).executeUpdate();
        String q98 = "INSERT INTO merit_listp12 (Srno, Rollno, cname, Category, prefer1, prefer2) VALUES (98, '24237785', 'ISHAAN SAMEER SARDESHMUKH', 'Open', 'cse', 'ect')";
        entityManager.createNativeQuery(q98).executeUpdate();
        String q99 = "INSERT INTO merit_listp12 (Srno, Rollno, cname, Category, prefer1, prefer2) VALUES (99, '24214888', 'KARAMBALKAR HARSH JITIN', 'Open', 'cse', 'ect')";
        entityManager.createNativeQuery(q99).executeUpdate();
        String q100 = "INSERT INTO merit_listp12 (Srno, Rollno, cname, Category, prefer1, prefer2) VALUES (100, '24102836', 'MOHIT VIVEK JAIN', 'Open', 'cse', 'cse')";
        entityManager.createNativeQuery(q100).executeUpdate();
        String q101 = "INSERT INTO merit_listp12 (Srno, Rollno, cname, Category, prefer1, prefer2) VALUES (101, '24199856', 'PASARE SARVESH DATTATRAY', 'Open', 'cse', 'ect')";
        entityManager.createNativeQuery(q101).executeUpdate();
        String q102 = "INSERT INTO merit_listp12 (Srno, Rollno, cname, Category, prefer1, prefer2) VALUES (102, '24180318', 'AHUJA KARAN SANJAY', 'Open', 'mech', 'ect')";
        entityManager.createNativeQuery(q102).executeUpdate();
        String q103 = "INSERT INTO merit_listp12 (Srno, Rollno, cname, Category, prefer1, prefer2) VALUES (103, '24301034', 'LABHSHETWAR SOHAM LAXMIKANT', 'Open', 'cse', 'ect')";
        entityManager.createNativeQuery(q103).executeUpdate();
        String q104 = "INSERT INTO merit_listp12 (Srno, Rollno, cname, Category, prefer1, prefer2) VALUES (104, '24141397', 'KOTHALKAR YASH ANKUR', 'Open', 'cse', 'ect')";
        entityManager.createNativeQuery(q104).executeUpdate();
        String q105 = "INSERT INTO merit_listp12 (Srno, Rollno, cname, Category, prefer1, prefer2) VALUES (105, '24115327', 'WAGHMARE JAYESH SANJAY', 'OBC', 'cse', 'cse')";
        entityManager.createNativeQuery(q105).executeUpdate();
        String q106 = "INSERT INTO merit_listp12 (Srno, Rollno, cname, Category, prefer1, prefer2) VALUES (106, '24210165', 'PHARTADE DNYANESHWARI ANIL', 'OBC', 'cse', 'ect')";
        entityManager.createNativeQuery(q106).executeUpdate();
        String q107 = "INSERT INTO merit_listp12 (Srno, Rollno, cname, Category, prefer1, prefer2) VALUES (107, '24133053', 'SAKORKAR SHARANNYA', 'Open', 'cse', 'aiml')";
        entityManager.createNativeQuery(q107).executeUpdate();
        String q108 = "INSERT INTO merit_listp12 (Srno, Rollno, cname, Category, prefer1, prefer2) VALUES (108, '24234285', 'DIWAN PRERANA SUNIL', 'Open', 'cse', 'ect')";
        entityManager.createNativeQuery(q108).executeUpdate();
        String q109 = "INSERT INTO merit_listp12 (Srno, Rollno, cname, Category, prefer1, prefer2) VALUES (109, '24182483', 'BYADGI PUSHKAR VINAY', 'SC', 'mech', 'ect')";
        entityManager.createNativeQuery(q109).executeUpdate();
        String q110 = "INSERT INTO merit_listp12 (Srno, Rollno, cname, Category, prefer1, prefer2) VALUES (110, '24148463', 'MOKSH NIMESH PATEL', 'SC', 'cse', 'ect')";
        entityManager.createNativeQuery(q110).executeUpdate();
        String q111 = "INSERT INTO merit_listp12 (Srno, Rollno, cname, Category, prefer1, prefer2) VALUES (111, '24153445', 'SAGAR ANKITA ASHOK', 'SC', 'cse', 'ect')";
        entityManager.createNativeQuery(q111).executeUpdate();
        String q112 = "INSERT INTO merit_listp12 (Srno, Rollno, cname, Category, prefer1, prefer2) VALUES (112, '24109590', 'GUPTA HARSHVARDHAN NAVENDU', 'SC', 'cse', 'cse')";
        entityManager.createNativeQuery(q112).executeUpdate();
        String q113 = "INSERT INTO merit_listp12 (Srno, Rollno, cname, Category, prefer1, prefer2) VALUES (113, '24180452', 'SAMRUDDHI SUDHAKAR OMBASE', 'NTC', 'cse', 'ect')";
        entityManager.createNativeQuery(q113).executeUpdate();
        String q114 = "INSERT INTO merit_listp12 (Srno, Rollno, cname, Category, prefer1, prefer2) VALUES (114, '24232207', 'SHAH VANSHIKA SACHINKUMAR', 'SC', 'cse', 'ect')";
        entityManager.createNativeQuery(q114).executeUpdate();
        String q115 = "INSERT INTO merit_listp12 (Srno, Rollno, cname, Category, prefer1, prefer2) VALUES (115, '24188843', 'PRANAV ARORA', 'Open', 'cse', 'ect')";
        entityManager.createNativeQuery(q115).executeUpdate();
        String q116 = "INSERT INTO merit_listp12 (Srno, Rollno, cname, Category, prefer1, prefer2) VALUES (116, '24138011', 'BHURE ARYAN DATTATRAY', 'OBC', 'mech', 'ect')";
        entityManager.createNativeQuery(q116).executeUpdate();
        String q117 = "INSERT INTO merit_listp12 (Srno, Rollno, cname, Category, prefer1, prefer2) VALUES (117, '24122205', 'SONI MADHAV PAWANKUMAR', 'ST', 'cse', 'ect')";
        entityManager.createNativeQuery(q117).executeUpdate();
        String q118 = "INSERT INTO merit_listp12 (Srno, Rollno, cname, Category, prefer1, prefer2) VALUES (118, '24187380', 'GAWAND PRANAV TANAJI', 'NTC', 'cse', 'ect')";
        entityManager.createNativeQuery(q118).executeUpdate();
        String q119 = "INSERT INTO merit_listp12 (Srno, Rollno, cname, Category, prefer1, prefer2) VALUES (119, '24142642', 'AKSHAT TIKARIA', 'ST', 'mech', 'ect')";
        entityManager.createNativeQuery(q119).executeUpdate();
        String q120 = "INSERT INTO merit_listp12 (Srno, Rollno, cname, Category, prefer1, prefer2) VALUES (120, '24248566', 'MAHALLE OM VILAS', 'OBC', 'cse', 'ect')";
        entityManager.createNativeQuery(q120).executeUpdate();
        String q121 = "INSERT INTO merit_listp12 (Srno, Rollno, cname, Category, prefer1, prefer2) VALUES (121, '24155301', 'DETHE VED CHANDRASHEKHAR', 'OBC', 'cse', 'ect')";
        entityManager.createNativeQuery(q121).executeUpdate();
        String q122 = "INSERT INTO merit_listp12 (Srno, Rollno, cname, Category, prefer1, prefer2) VALUES (122, '24180608', 'CHINMAY DATTAPRASAD GHATE', 'ST', 'mech', 'ect')";
        entityManager.createNativeQuery(q122).executeUpdate();
        String q123 = "INSERT INTO merit_listp12 (Srno, Rollno, cname, Category, prefer1, prefer2) VALUES (123, '24284652', 'MAHESHWARY ANANT PRASHANT', 'ST', 'cse', 'ect')";
        entityManager.createNativeQuery(q123).executeUpdate();
        String q124 = "INSERT INTO merit_listp12 (Srno, Rollno, cname, Category, prefer1, prefer2) VALUES (124, '24247866', 'KALE UDAY GANESH', 'ST', 'cse', 'ect')";
        entityManager.createNativeQuery(q124).executeUpdate();
        String q125 = "INSERT INTO merit_listp12 (Srno, Rollno, cname, Category, prefer1, prefer2) VALUES (125, '24128994', 'PUJARI VEDANT ASHOK', 'NTC', 'cse', 'aiml')";
        entityManager.createNativeQuery(q125).executeUpdate();
        String q126 = "INSERT INTO merit_listp12 (Srno, Rollno, cname, Category, prefer1, prefer2) VALUES (126, '24239169', 'CHOUHAN SUYANSH ARVINDKUMAR', 'ST', 'cse', 'ect')";
        entityManager.createNativeQuery(q126).executeUpdate();
        String q127 = "INSERT INTO merit_listp12 (Srno, Rollno, cname, Category, prefer1, prefer2) VALUES (127, '24213816', 'SHIMPI MANDAR SANDIP', 'OBC', 'cse', 'ect')";
        entityManager.createNativeQuery(q127).executeUpdate();
        String q128 = "INSERT INTO merit_listp12 (Srno, Rollno, cname, Category, prefer1, prefer2) VALUES (128, '24140608', 'GAIKWAD YUVRAJ YASHWANT', 'ST', 'cse', 'ect')";
        entityManager.createNativeQuery(q128).executeUpdate();
        String q129 = "INSERT INTO merit_listp12 (Srno, Rollno, cname, Category, prefer1, prefer2) VALUES (129, '24216336', 'ANIRUDH ARVIND MAHAPATRA', 'ST', 'mech', 'ect')";
        entityManager.createNativeQuery(q129).executeUpdate();
        String q130 = "INSERT INTO merit_listp12 (Srno, Rollno, cname, Category, prefer1, prefer2) VALUES (130, '24143174', 'SAWANT ASHANI SANJAY', 'Open', 'cse', 'ect')";
        entityManager.createNativeQuery(q130).executeUpdate();
        String q131 = "INSERT INTO merit_listp12 (Srno, Rollno, cname, Category, prefer1, prefer2) VALUES (131, '24140848', 'RANDIVE RIDDHESH KALIDAS', 'OBC', 'cse', 'ect')";
        entityManager.createNativeQuery(q131).executeUpdate();
        String q132 = "INSERT INTO merit_listp12 (Srno, Rollno, cname, Category, prefer1, prefer2) VALUES (132, '24180564', 'PRAJAPATI JENIL NILESH', 'Open', 'cse', 'ect')";
        entityManager.createNativeQuery(q132).executeUpdate();
        String q133 = "INSERT INTO merit_listp12 (Srno, Rollno, cname, Category, prefer1, prefer2) VALUES (133, '24136449', 'SHREYASH CHANDRA', 'Open', 'cse', 'aiml')";
        entityManager.createNativeQuery(q133).executeUpdate();
        String q134 = "INSERT INTO merit_listp12 (Srno, Rollno, cname, Category, prefer1, prefer2) VALUES (134, '24171055', 'MULWANI KRISH NARESH', 'Open', 'cse', 'ect')";
        entityManager.createNativeQuery(q134).executeUpdate();
        String q135 = "INSERT INTO merit_listp12 (Srno, Rollno, cname, Category, prefer1, prefer2) VALUES (135, '24174897', 'GANDHEWAR SWAYAM PARAG', 'Open', 'cse', 'ect')";
        entityManager.createNativeQuery(q135).executeUpdate();
        String q136 = "INSERT INTO merit_listp12 (Srno, Rollno, cname, Category, prefer1, prefer2) VALUES (136, '24121822', 'UTKARSH GUPTA', 'Open', 'cse', 'ect')";
        entityManager.createNativeQuery(q136).executeUpdate();
        String q137 = "INSERT INTO merit_listp12 (Srno, Rollno, cname, Category, prefer1, prefer2) VALUES (137, '24182029', 'KATDARE KAIVALYA GIRISH', 'Open', 'cse', 'ect')";
        entityManager.createNativeQuery(q137).executeUpdate();
        String q138 = "INSERT INTO merit_listp12 (Srno, Rollno, cname, Category, prefer1, prefer2) VALUES (138, '24140401', 'DALAL JINANSH PUNITKUMAR', 'Open', 'cse', 'ect')";
        entityManager.createNativeQuery(q138).executeUpdate();
        String q139 = "INSERT INTO merit_listp12 (Srno, Rollno, cname, Category, prefer1, prefer2) VALUES (139, '24146681', 'BHATTAD PRANAV HEMANT', 'Open', 'mech', 'ect')";
        entityManager.createNativeQuery(q139).executeUpdate();
        String q140 = "INSERT INTO merit_listp12 (Srno, Rollno, cname, Category, prefer1, prefer2) VALUES (140, '24138355', 'MORE PRAJWAL PRAMOD', 'OBC', 'cse', 'ect')";
        entityManager.createNativeQuery(q140).executeUpdate();
        String q141 = "INSERT INTO merit_listp12 (Srno, Rollno, cname, Category, prefer1, prefer2) VALUES (141, '24217479', 'WADKILE TUSHAR RAOSAHEB', 'Open', 'cse', 'ect')";
        entityManager.createNativeQuery(q141).executeUpdate();
        String q142 = "INSERT INTO merit_listp12 (Srno, Rollno, cname, Category, prefer1, prefer2) VALUES (142, '24114845', 'JAMDAR JIBRAN JAVED', 'Open', 'cse', 'cse')";
        entityManager.createNativeQuery(q142).executeUpdate();
        String q143 = "INSERT INTO merit_listp12 (Srno, Rollno, cname, Category, prefer1, prefer2) VALUES (143, '24138690', 'HAJARNIS INDRANEEL AMOL', 'Open', 'cse', 'ect')";
        entityManager.createNativeQuery(q143).executeUpdate();
        String q144 = "INSERT INTO merit_listp12 (Srno, Rollno, cname, Category, prefer1, prefer2) VALUES (144, '24137227', 'JADHAV MANTHAN BHARAT', 'NTC', 'cse', 'ect')";
        entityManager.createNativeQuery(q144).executeUpdate();
        String q145 = "INSERT INTO merit_listp12 (Srno, Rollno, cname, Category, prefer1, prefer2) VALUES (145, '24270595', 'BADHE VAISHNAVI AMOL', 'Open', 'mech', 'ect')";
        entityManager.createNativeQuery(q145).executeUpdate();
        String q146 = "INSERT INTO merit_listp12 (Srno, Rollno, cname, Category, prefer1, prefer2) VALUES (146, '24240364', 'DESHMUKH YASH SUNIL', 'OBC', 'cse', 'ect')";
        entityManager.createNativeQuery(q146).executeUpdate();
        String q147 = "INSERT INTO merit_listp12 (Srno, Rollno, cname, Category, prefer1, prefer2) VALUES (147, '24274753', 'AGARWAL SIDDHANT LALIT', 'Open', 'mech', 'ect')";
        entityManager.createNativeQuery(q147).executeUpdate();
        String q148 = "INSERT INTO merit_listp12 (Srno, Rollno, cname, Category, prefer1, prefer2) VALUES (148, '24299278', 'NACHAN YASH DNYANDEV', 'NTC', 'cse', 'ect')";
        entityManager.createNativeQuery(q148).executeUpdate();
        String q149 = "INSERT INTO merit_listp12 (Srno, Rollno, cname, Category, prefer1, prefer2) VALUES (149, '24135553', 'SHINDE HARSHWARDHAN YUVARAJ', 'Open', 'cse', 'aiml')";
        entityManager.createNativeQuery(q149).executeUpdate();
        String q150 = "INSERT INTO merit_listp12 (Srno, Rollno, cname, Category, prefer1, prefer2) VALUES (150, '24137446', 'SONAWANE PRACHI PRAMOD', 'OBC', 'cse', 'ect')";
        entityManager.createNativeQuery(q150).executeUpdate();
        String q151 = "INSERT INTO merit_listp12 (Srno, Rollno, cname, Category, prefer1, prefer2) VALUES (151, '24237789', 'ISHAAN SAMEER SARDESHMUKH', 'Open', 'cse', 'ect')";
        entityManager.createNativeQuery(q151).executeUpdate();
        String q152 = "INSERT INTO merit_listp12 (Srno, Rollno, cname, Category, prefer1, prefer2) VALUES (152, '24214892', 'KARAMBALKAR HARSH JITIN', 'Open', 'cse', 'ect')";
        entityManager.createNativeQuery(q152).executeUpdate();
        String q153 = "INSERT INTO merit_listp12 (Srno, Rollno, cname, Category, prefer1, prefer2) VALUES (153, '24102840', 'MOHIT VIVEK JAIN', 'Open', 'cse', 'cse')";
        entityManager.createNativeQuery(q153).executeUpdate();
        String q154 = "INSERT INTO merit_listp12 (Srno, Rollno, cname, Category, prefer1, prefer2) VALUES (154, '24199860', 'PASARE SARVESH DATTATRAY', 'Open', 'cse', 'ect')";
        entityManager.createNativeQuery(q154).executeUpdate();
        String q155 = "INSERT INTO merit_listp12 (Srno, Rollno, cname, Category, prefer1, prefer2) VALUES (155, '24180322', 'AHUJA KARAN SANJAY', 'Open', 'mech', 'ect')";
        entityManager.createNativeQuery(q155).executeUpdate();
        String q156 = "INSERT INTO merit_listp12 (Srno, Rollno, cname, Category, prefer1, prefer2) VALUES (156, '24301038', 'LABHSHETWAR SOHAM LAXMIKANT', 'Open', 'cse', 'ect')";
        entityManager.createNativeQuery(q156).executeUpdate();
        String q157 = "INSERT INTO merit_listp12 (Srno, Rollno, cname, Category, prefer1, prefer2) VALUES (157, '24141401', 'KOTHALKAR YASH ANKUR', 'Open', 'cse', 'ect')";
        entityManager.createNativeQuery(q157).executeUpdate();
        String q158 = "INSERT INTO merit_listp12 (Srno, Rollno, cname, Category, prefer1, prefer2) VALUES (158, '24115331', 'WAGHMARE JAYESH SANJAY', 'OBC', 'cse', 'cse')";
        entityManager.createNativeQuery(q158).executeUpdate();
        String q159 = "INSERT INTO merit_listp12 (Srno, Rollno, cname, Category, prefer1, prefer2) VALUES (159, '24210169', 'PHARTADE DNYANESHWARI ANIL', 'OBC', 'cse', 'ect')";
        entityManager.createNativeQuery(q159).executeUpdate();
        String q160 = "INSERT INTO merit_listp12 (Srno, Rollno, cname, Category, prefer1, prefer2) VALUES (160, '24133057', 'SAKORKAR SHARANNYA', 'Open', 'cse', 'aiml')";
        entityManager.createNativeQuery(q160).executeUpdate();
        String q161 = "INSERT INTO merit_listp12 (Srno, Rollno, cname, Category, prefer1, prefer2) VALUES (161, '24234289', 'DIWAN PRERANA SUNIL', 'Open', 'cse', 'ect')";
        entityManager.createNativeQuery(q161).executeUpdate();
        String q162 = "INSERT INTO merit_listp12 (Srno, Rollno, cname, Category, prefer1, prefer2) VALUES (162, '24182487', 'BYADGI PUSHKAR VINAY', 'SC', 'mech', 'ect')";
        entityManager.createNativeQuery(q162).executeUpdate();
        String q163 = "INSERT INTO merit_listp12 (Srno, Rollno, cname, Category, prefer1, prefer2) VALUES (163, '24148467', 'MOKSH NIMESH PATEL', 'SC', 'cse', 'ect')";
        entityManager.createNativeQuery(q163).executeUpdate();
        String q164 = "INSERT INTO merit_listp12 (Srno, Rollno, cname, Category, prefer1, prefer2) VALUES (164, '24153449', 'SAGAR ANKITA ASHOK', 'SC', 'cse', 'ect')";
        entityManager.createNativeQuery(q164).executeUpdate();
        String q165 = "INSERT INTO merit_listp12 (Srno, Rollno, cname, Category, prefer1, prefer2) VALUES (165, '24109594', 'GUPTA HARSHVARDHAN NAVENDU', 'SC', 'cse', 'cse')";
        entityManager.createNativeQuery(q165).executeUpdate();
        String q166 = "INSERT INTO merit_listp12 (Srno, Rollno, cname, Category, prefer1, prefer2) VALUES (166, '24180456', 'SAMRUDDHI SUDHAKAR OMBASE', 'NTC', 'cse', 'ect')";
        entityManager.createNativeQuery(q166).executeUpdate();
        String q167 = "INSERT INTO merit_listp12 (Srno, Rollno, cname, Category, prefer1, prefer2) VALUES (167, '24232211', 'SHAH VANSHIKA SACHINKUMAR', 'SC', 'cse', 'ect')";
        entityManager.createNativeQuery(q167).executeUpdate();
        String q168 = "INSERT INTO merit_listp12 (Srno, Rollno, cname, Category, prefer1, prefer2) VALUES (168, '24188847', 'PRANAV ARORA', 'Open', 'cse', 'ect')";
        entityManager.createNativeQuery(q168).executeUpdate();
        String q169 = "INSERT INTO merit_listp12 (Srno, Rollno, cname, Category, prefer1, prefer2) VALUES (169, '24138015', 'BHURE ARYAN DATTATRAY', 'OBC', 'mech', 'ect')";
        entityManager.createNativeQuery(q169).executeUpdate();
        String q170 = "INSERT INTO merit_listp12 (Srno, Rollno, cname, Category, prefer1, prefer2) VALUES (170, '24122209', 'SONI MADHAV PAWANKUMAR', 'ST', 'cse', 'aiml')";
        entityManager.createNativeQuery(q170).executeUpdate();
        String q171 = "INSERT INTO merit_listp12 (Srno, Rollno, cname, Category, prefer1, prefer2) VALUES (171, '24187384', 'GAWAND PRANAV TANAJI', 'NTC', 'cse', 'ect')";
        entityManager.createNativeQuery(q171).executeUpdate();
        String q172 = "INSERT INTO merit_listp12 (Srno, Rollno, cname, Category, prefer1, prefer2) VALUES (172, '24142646', 'AKSHAT TIKARIA', 'ST', 'mech', 'ect')";
        entityManager.createNativeQuery(q172).executeUpdate();
        String q173 = "INSERT INTO merit_listp12 (Srno, Rollno, cname, Category, prefer1, prefer2) VALUES (173, '24248570', 'MAHALLE OM VILAS', 'OBC', 'cse', 'ect')";
        entityManager.createNativeQuery(q173).executeUpdate();
        String q174 = "INSERT INTO merit_listp12 (Srno, Rollno, cname, Category, prefer1, prefer2) VALUES (174, '24155305', 'DETHE VED CHANDRASHEKHAR', 'OBC', 'cse', 'ect')";
        entityManager.createNativeQuery(q174).executeUpdate();
        String q175 = "INSERT INTO merit_listp12 (Srno, Rollno, cname, Category, prefer1, prefer2) VALUES (175, '24180612', 'CHINMAY DATTAPRASAD GHATE', 'ST', 'mech', 'ect')";
        entityManager.createNativeQuery(q175).executeUpdate();
        String q176 = "INSERT INTO merit_listp12 (Srno, Rollno, cname, Category, prefer1, prefer2) VALUES (176, '24284656', 'MAHESHWARY ANANT PRASHANT', 'ST', 'cse', 'ect')";
        entityManager.createNativeQuery(q176).executeUpdate();
        String q177 = "INSERT INTO merit_listp12 (Srno, Rollno, cname, Category, prefer1, prefer2) VALUES (177, '24247870', 'KALE UDAY GANESH', 'ST', 'cse', 'ect')";
        entityManager.createNativeQuery(q177).executeUpdate();
        String q178 = "INSERT INTO merit_listp12 (Srno, Rollno, cname, Category, prefer1, prefer2) VALUES (178, '24128998', 'PUJARI VEDANT ASHOK', 'NTC', 'cse', 'aiml')";
        entityManager.createNativeQuery(q178).executeUpdate();
        String q179 = "INSERT INTO merit_listp12 (Srno, Rollno, cname, Category, prefer1, prefer2) VALUES (179, '24239173', 'CHOUHAN SUYANSH ARVINDKUMAR', 'ST', 'cse', 'ect')";
        entityManager.createNativeQuery(q179).executeUpdate();
        String q180 = "INSERT INTO merit_listp12 (Srno, Rollno, cname, Category, prefer1, prefer2) VALUES (180, '24213820', 'SHIMPI MANDAR SANDIP', 'OBC', 'cse', 'ect')";
        entityManager.createNativeQuery(q180).executeUpdate();
        String q181 = "INSERT INTO merit_listp12 (Srno, Rollno, cname, Category, prefer1, prefer2) VALUES (181, '24140612', 'GAIKWAD YUVRAJ YASHWANT', 'ST', 'cse', 'ect')";
        entityManager.createNativeQuery(q181).executeUpdate();
        String q182 = "INSERT INTO merit_listp12 (Srno, Rollno, cname, Category, prefer1, prefer2) VALUES (182, '24216340', 'ANIRUDH ARVIND MAHAPATRA', 'ST', 'mech', 'ect')";
        entityManager.createNativeQuery(q182).executeUpdate();
        String q183 = "INSERT INTO merit_listp12 (Srno, Rollno, cname, Category, prefer1, prefer2) VALUES (183, '24143178', 'SAWANT ASHANI SANJAY', 'Open', 'cse', 'ect')";
        entityManager.createNativeQuery(q183).executeUpdate();
        String q184 = "INSERT INTO merit_listp12 (Srno, Rollno, cname, Category, prefer1, prefer2) VALUES (184, '24140852', 'RANDIVE RIDDHESH KALIDAS', 'OBC', 'cse', 'ect')";
        entityManager.createNativeQuery(q184).executeUpdate();
        String q185 = "INSERT INTO merit_listp12 (Srno, Rollno, cname, Category, prefer1, prefer2) VALUES (185, '24180568', 'PRAJAPATI JENIL NILESH', 'Open', 'cse', 'ect')";
        entityManager.createNativeQuery(q185).executeUpdate();
        String q186 = "INSERT INTO merit_listp12 (Srno, Rollno, cname, Category, prefer1, prefer2) VALUES (186, '24136453', 'SHREYASH CHANDRA', 'Open', 'cse', 'ect')";
        entityManager.createNativeQuery(q186).executeUpdate();
        String q187 = "INSERT INTO merit_listp12 (Srno, Rollno, cname, Category, prefer1, prefer2) VALUES (187, '24171059', 'MULWANI KRISH NARESH', 'Open', 'cse', 'ect')";
        entityManager.createNativeQuery(q187).executeUpdate();
        String q188 = "INSERT INTO merit_listp12 (Srno, Rollno, cname, Category, prefer1, prefer2) VALUES (188, '24174901', 'GANDHEWAR SWAYAM PARAG', 'Open', 'cse', 'ect')";
        entityManager.createNativeQuery(q188).executeUpdate();
        String q189 = "INSERT INTO merit_listp12 (Srno, Rollno, cname, Category, prefer1, prefer2) VALUES (189, '24121826', 'UTKARSH GUPTA', 'Open', 'cse', 'ect')";
        entityManager.createNativeQuery(q189).executeUpdate();
        String q190 = "INSERT INTO merit_listp12 (Srno, Rollno, cname, Category, prefer1, prefer2) VALUES (190, '24182033', 'KATDARE KAIVALYA GIRISH', 'Open', 'cse', 'ect')";
        entityManager.createNativeQuery(q190).executeUpdate();
        String q191 = "INSERT INTO merit_listp12 (Srno, Rollno, cname, Category, prefer1, prefer2) VALUES (191, '24140405', 'DALAL JINANSH PUNITKUMAR', 'Open', 'cse', 'ect')";
        entityManager.createNativeQuery(q191).executeUpdate();
        String q192 = "INSERT INTO merit_listp12 (Srno, Rollno, cname, Category, prefer1, prefer2) VALUES (192, '24146685', 'BHATTAD PRANAV HEMANT', 'Open', 'mech', 'ect')";
        entityManager.createNativeQuery(q192).executeUpdate();
        String q193 = "INSERT INTO merit_listp12 (Srno, Rollno, cname, Category, prefer1, prefer2) VALUES (193, '24138359', 'MORE PRAJWAL PRAMOD', 'OBC', 'cse', 'ect')";
        entityManager.createNativeQuery(q193).executeUpdate();
        String q194 = "INSERT INTO merit_listp12 (Srno, Rollno, cname, Category, prefer1, prefer2) VALUES (194, '24217483', 'WADKILE TUSHAR RAOSAHEB', 'Open', 'cse', 'ect')";
        entityManager.createNativeQuery(q194).executeUpdate();
        String q195 = "INSERT INTO merit_listp12 (Srno, Rollno, cname, Category, prefer1, prefer2) VALUES (195, '24114849', 'JAMDAR JIBRAN JAVED', 'Open', 'cse', 'cse')";
        entityManager.createNativeQuery(q195).executeUpdate();
        String q196 = "INSERT INTO merit_listp12 (Srno, Rollno, cname, Category, prefer1, prefer2) VALUES (196, '24138694', 'HAJARNIS INDRANEEL AMOL', 'Open', 'cse', 'ect')";
        entityManager.createNativeQuery(q196).executeUpdate();
        String q197 = "INSERT INTO merit_listp12 (Srno, Rollno, cname, Category, prefer1, prefer2) VALUES (197, '24137231', 'JADHAV MANTHAN BHARAT', 'NTC', 'cse', 'ect')";
        entityManager.createNativeQuery(q197).executeUpdate();
        String q198 = "INSERT INTO merit_listp12 (Srno, Rollno, cname, Category, prefer1, prefer2) VALUES (198, '24270599', 'BADHE VAISHNAVI AMOL', 'Open', 'mech', 'ect')";
        entityManager.createNativeQuery(q198).executeUpdate();
        String q199 = "INSERT INTO merit_listp12 (Srno, Rollno, cname, Category, prefer1, prefer2) VALUES (199, '24240368', 'DESHMUKH YASH SUNIL', 'OBC', 'cse', 'ect')";
        entityManager.createNativeQuery(q199).executeUpdate();
        String q200 = "INSERT INTO merit_listp12 (Srno, Rollno, cname, Category, prefer1, prefer2) VALUES (200, '24274757', 'AGARWAL SIDDHANT LALIT', 'Open', 'mech', 'ect')";
        entityManager.createNativeQuery(q200).executeUpdate();
        String q201 = "INSERT INTO merit_listp12 (Srno, Rollno, cname, Category, prefer1, prefer2) VALUES (201, '24299282', 'NACHAN YASH DNYANDEV', 'NTC', 'cse', 'ect')";
        entityManager.createNativeQuery(q201).executeUpdate();
        String q202 = "INSERT INTO merit_listp12 (Srno, Rollno, cname, Category, prefer1, prefer2) VALUES (202, '24135557', 'SHINDE HARSHWARDHAN YUVARAJ', 'Open', 'cse', 'aiml')";
        entityManager.createNativeQuery(q202).executeUpdate();
        String q203 = "INSERT INTO merit_listp12 (Srno, Rollno, cname, Category, prefer1, prefer2) VALUES (203, '24137450', 'SONAWANE PRACHI PRAMOD', 'OBC', 'cse', 'ect')";
        entityManager.createNativeQuery(q203).executeUpdate();
        String q204 = "INSERT INTO merit_listp12 (Srno, Rollno, cname, Category, prefer1, prefer2) VALUES (204, '24237793', 'ISHAAN SAMEER SARDESHMUKH', 'Open', 'cse', 'ect')";
        entityManager.createNativeQuery(q204).executeUpdate();
        String q205 = "INSERT INTO merit_listp12 (Srno, Rollno, cname, Category, prefer1, prefer2) VALUES (205, '24214896', 'KARAMBALKAR HARSH JITIN', 'Open', 'cse', 'ect')";
        entityManager.createNativeQuery(q205).executeUpdate();
        String q206 = "INSERT INTO merit_listp12 (Srno, Rollno, cname, Category, prefer1, prefer2) VALUES (206, '24102844', 'MOHIT VIVEK JAIN', 'Open', 'cse', 'cse')";
        entityManager.createNativeQuery(q206).executeUpdate();
        String q207 = "INSERT INTO merit_listp12 (Srno, Rollno, cname, Category, prefer1, prefer2) VALUES (207, '24199864', 'PASARE SARVESH DATTATRAY', 'Open', 'cse', 'ect')";
        entityManager.createNativeQuery(q207).executeUpdate();
        String q208 = "INSERT INTO merit_listp12 (Srno, Rollno, cname, Category, prefer1, prefer2) VALUES (208, '24180326', 'AHUJA KARAN SANJAY', 'Open', 'mech', 'ect')";
        entityManager.createNativeQuery(q208).executeUpdate();
        String q209 = "INSERT INTO merit_listp12 (Srno, Rollno, cname, Category, prefer1, prefer2) VALUES (209, '24301042', 'LABHSHETWAR SOHAM LAXMIKANT', 'Open', 'cse', 'ect')";
        entityManager.createNativeQuery(q209).executeUpdate();
        String q210 = "INSERT INTO merit_listp12 (Srno, Rollno, cname, Category, prefer1, prefer2) VALUES (210, '24141405', 'KOTHALKAR YASH ANKUR', 'Open', 'cse', 'ect')";
        entityManager.createNativeQuery(q210).executeUpdate();
        String q211 = "INSERT INTO merit_listp12 (Srno, Rollno, cname, Category, prefer1, prefer2) VALUES (211, '24115335', 'WAGHMARE JAYESH SANJAY', 'OBC', 'cse', 'ect')";
        entityManager.createNativeQuery(q211).executeUpdate();
        String q212 = "INSERT INTO merit_listp12 (Srno, Rollno, cname, Category, prefer1, prefer2) VALUES (212, '24210173', 'PHARTADE DNYANESHWARI ANIL', 'OBC', 'cse', 'ect')";
        entityManager.createNativeQuery(q212).executeUpdate();
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
        String c3 = "INSERT INTO calculation (category, thirty, sixty, twoforty) VALUES ('nta', 1, 1, 2)";
        entityManager.createNativeQuery(c3).executeUpdate();
        String c4 = "INSERT INTO calculation (category, thirty, sixty, twoforty) VALUES ('ntb', 1, 1, 2)";
        entityManager.createNativeQuery(c4).executeUpdate();
        String c5 = "INSERT INTO calculation (category, thirty, sixty, twoforty) VALUES ('ntc', 1, 1, 3)";
        entityManager.createNativeQuery(c5).executeUpdate();
        String c6 = "INSERT INTO calculation (category, thirty, sixty, twoforty) VALUES ('ntd', 1, 1, 1)";
        entityManager.createNativeQuery(c6).executeUpdate();
        String c7 = "INSERT INTO calculation (category, thirty, sixty, twoforty) VALUES ('obc', 2, 4, 18)";
        entityManager.createNativeQuery(c7).executeUpdate();
        String c8 = "INSERT INTO calculation (category, thirty, sixty, twoforty) VALUES ('sebc', 1, 2, 9)";
        entityManager.createNativeQuery(c8).executeUpdate();
        String c9 = "INSERT INTO calculation (category, thirty, sixty, twoforty) VALUES ('open', 3, 10, 43)";
        entityManager.createNativeQuery(c9).executeUpdate();
        String c10 = "INSERT INTO calculation (category, thirty, sixty, twoforty) VALUES ('total', 12, 24, 96)";
        entityManager.createNativeQuery(c10).executeUpdate();
        String c11 = "INSERT INTO calculation (category, thirty, sixty, twoforty) VALUES ('deptseats', 30, 60, 240)";
        entityManager.createNativeQuery(c11).executeUpdate();
    }

    @Transactional
    public void duplicate_meritlist(){
        String m1 = "DROP TABLE IF EXISTS i1meritlist";
        entityManager.createNativeQuery(m1).executeUpdate();
        String m2 = "CREATE TABLE i1meritlist AS SELECT * FROM merit_listp12";
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
        String w2 = "CREATE TABLE cseallocatedopen AS SELECT * FROM csep1meritlist LIMIT (SELECT twoforty FROM calculation WHERE category='open')";
        entityManager.createNativeQuery(w2).executeUpdate();
        String w3a = "DROP TABLE IF EXISTS cseunallocatedcommon";
        entityManager.createNativeQuery(w3a).executeUpdate();
        String w3 = "CREATE TABLE cseunallocatedcommon AS SELECT * FROM csep1meritlist";
        entityManager.createNativeQuery(w3).executeUpdate();
        String w4 = "DELETE FROM cseunallocatedcommon WHERE srno IN (SELECT srno FROM cseallocatedopen)";
        entityManager.createNativeQuery(w4).executeUpdate();
    }

    @Transactional
    public void allocated_mech_r1i1_open(){
        //CSE_only OPEN , unallocatedcommonlist
        String w1 = "DROP TABLE IF EXISTS mechallocatedopen";
        entityManager.createNativeQuery(w1).executeUpdate();
        String w2 = "CREATE TABLE mechallocatedopen AS SELECT * FROM mechp1meritlist LIMIT (SELECT thirty FROM calculation WHERE category='open')";
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
        String e4 = "DELETE FROM cseallocatedSC WHERE srno NOT IN (SELECT srno FROM (SELECT srno FROM cseallocatedSC ORDER BY srno LIMIT (SELECT twoforty FROM calculation WHERE category='sc')) )";
        entityManager.createNativeQuery(e4).executeUpdate();
        //CSE_only ST
        String e5 = "DROP TABLE IF EXISTS cseallocatedST";
        entityManager.createNativeQuery(e5).executeUpdate();
        String e6 = "CREATE TABLE cseallocatedST AS SELECT * FROM cseunallocatedcommon";
        entityManager.createNativeQuery(e6).executeUpdate();
        String e7 = "DELETE FROM cseallocatedST WHERE category <> 'ST'";
        entityManager.createNativeQuery(e7).executeUpdate();
        String e8 = "DELETE FROM cseallocatedST WHERE srno NOT IN (SELECT srno FROM (SELECT srno FROM cseallocatedST ORDER BY srno LIMIT (SELECT twoforty FROM calculation WHERE category='st')) )";
        entityManager.createNativeQuery(e8).executeUpdate();
        //CSE_only NT-A
        String e9 = "DROP TABLE IF EXISTS cseallocatedNTC";
        entityManager.createNativeQuery(e9).executeUpdate();
        String e10 = "CREATE TABLE cseallocatedNTC AS SELECT * FROM cseunallocatedcommon";
        entityManager.createNativeQuery(e10).executeUpdate();
        String e11 = "DELETE FROM cseallocatedNTC WHERE category <> 'NTC'";
        entityManager.createNativeQuery(e11).executeUpdate();
        String e12 = "DELETE FROM cseallocatedNTC WHERE srno NOT IN (SELECT srno FROM (SELECT srno FROM cseallocatedNTC ORDER BY srno LIMIT (SELECT twoforty FROM calculation WHERE category='ntc')) )";
        entityManager.createNativeQuery(e12).executeUpdate();
        //CSE_only OBC
        String e13 = "DROP TABLE IF EXISTS cseallocatedOBC";
        entityManager.createNativeQuery(e13).executeUpdate();
        String e14 = "CREATE TABLE cseallocatedOBC AS SELECT * FROM cseunallocatedcommon";
        entityManager.createNativeQuery(e14).executeUpdate();
        String e15 = "DELETE FROM cseallocatedOBC WHERE category <> 'OBC'";
        entityManager.createNativeQuery(e15).executeUpdate();
        String e16 = "DELETE FROM cseallocatedOBC WHERE srno NOT IN (SELECT srno FROM (SELECT srno FROM cseallocatedOBC ORDER BY srno LIMIT (SELECT twoforty FROM calculation WHERE category='obc')) )";
        entityManager.createNativeQuery(e16).executeUpdate();
        //CSE_only SEBC
        String e17 = "DROP TABLE IF EXISTS cseallocatedSEBC";
        entityManager.createNativeQuery(e17).executeUpdate();
        String e18 = "CREATE TABLE cseallocatedSEBC AS SELECT * FROM cseunallocatedcommon";
        entityManager.createNativeQuery(e18).executeUpdate();
        String e19 = "DELETE FROM cseallocatedSEBC WHERE category <> 'SEBC'";
        entityManager.createNativeQuery(e19).executeUpdate();
        String e20 = "DELETE FROM cseallocatedSEBC WHERE srno NOT IN (SELECT srno FROM (SELECT srno FROM cseallocatedSEBC ORDER BY srno LIMIT (SELECT twoforty FROM calculation WHERE category='sebc')) )";
        entityManager.createNativeQuery(e20).executeUpdate();

    }

    @Transactional
    public void allocated_mech_r1i1_scstntabcdobc(){
        //CSE_only SC
        String e1 = "DROP TABLE IF EXISTS mechallocatedSC";
        entityManager.createNativeQuery(e1).executeUpdate();
        String e2 = "CREATE TABLE mechallocatedSC AS SELECT * FROM mechunallocatedcommon";
        entityManager.createNativeQuery(e2).executeUpdate();
        String e3 = "DELETE FROM mechallocatedSC WHERE category <> 'SC'";
        entityManager.createNativeQuery(e3).executeUpdate();
        String e4 = "DELETE FROM mechallocatedSC WHERE srno NOT IN (SELECT srno FROM (SELECT srno FROM mechallocatedSC ORDER BY srno LIMIT (SELECT thirty FROM calculation WHERE category='sc')) )";
        entityManager.createNativeQuery(e4).executeUpdate();
        //CSE_only ST
        String e5 = "DROP TABLE IF EXISTS mechallocatedST";
        entityManager.createNativeQuery(e5).executeUpdate();
        String e6 = "CREATE TABLE mechallocatedST AS SELECT * FROM mechunallocatedcommon";
        entityManager.createNativeQuery(e6).executeUpdate();
        String e7 = "DELETE FROM mechallocatedST WHERE category <> 'ST'";
        entityManager.createNativeQuery(e7).executeUpdate();
        String e8 = "DELETE FROM mechallocatedST WHERE srno NOT IN (SELECT srno FROM (SELECT srno FROM mechallocatedST ORDER BY srno LIMIT (SELECT thirty FROM calculation WHERE category='st')) )";
        entityManager.createNativeQuery(e8).executeUpdate();
        //CSE_only NT-A
        String e9 = "DROP TABLE IF EXISTS mechallocatedNTC";
        entityManager.createNativeQuery(e9).executeUpdate();
        String e10 = "CREATE TABLE mechallocatedNTC AS SELECT * FROM mechunallocatedcommon";
        entityManager.createNativeQuery(e10).executeUpdate();
        String e11 = "DELETE FROM mechallocatedNTC WHERE category <> 'NTC'";
        entityManager.createNativeQuery(e11).executeUpdate();
        String e12 = "DELETE FROM mechallocatedNTC WHERE srno NOT IN (SELECT srno FROM (SELECT srno FROM mechallocatedNTC ORDER BY srno LIMIT (SELECT thirty FROM calculation WHERE category='ntc')) )";
        entityManager.createNativeQuery(e12).executeUpdate();
        //CSE_only OBC
        String e13 = "DROP TABLE IF EXISTS mechallocatedOBC";
        entityManager.createNativeQuery(e13).executeUpdate();
        String e14 = "CREATE TABLE mechallocatedOBC AS SELECT * FROM mechunallocatedcommon";
        entityManager.createNativeQuery(e14).executeUpdate();
        String e15 = "DELETE FROM mechallocatedOBC WHERE category <> 'OBC'";
        entityManager.createNativeQuery(e15).executeUpdate();
        String e16 = "DELETE FROM mechallocatedOBC WHERE srno NOT IN (SELECT srno FROM (SELECT srno FROM mechallocatedOBC ORDER BY srno LIMIT (SELECT thirty FROM calculation WHERE category='obc')) )";
        entityManager.createNativeQuery(e16).executeUpdate();
        //CSE_only SEBC
        String e17 = "DROP TABLE IF EXISTS mechallocatedSEBC";
        entityManager.createNativeQuery(e17).executeUpdate();
        String e18 = "CREATE TABLE mechallocatedSEBC AS SELECT * FROM mechunallocatedcommon";
        entityManager.createNativeQuery(e18).executeUpdate();
        String e19 = "DELETE FROM mechallocatedSEBC WHERE category <> 'SEBC'";
        entityManager.createNativeQuery(e19).executeUpdate();
        String e20 = "DELETE FROM mechallocatedSEBC WHERE srno NOT IN (SELECT srno FROM (SELECT srno FROM mechallocatedSEBC ORDER BY srno LIMIT (SELECT thirty FROM calculation WHERE category='sebc')) )";
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
