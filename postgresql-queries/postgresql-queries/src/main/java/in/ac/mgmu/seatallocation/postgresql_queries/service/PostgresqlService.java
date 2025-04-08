package in.ac.mgmu.seatallocation.postgresql_queries.service;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

@Service
public class PostgresqlService {

    @PersistenceContext
    private EntityManager entityManager;

    @Transactional
    public void method1(String sourceTable, String targetTable) {
        String dropQuery = "DROP TABLE IF EXISTS " + targetTable;
        String createQuery = "CREATE TABLE " + targetTable + " AS TABLE " + sourceTable;
        String q0 = "CREATE TABLE merit_listp12 ( Srno INTEGER,Rollno VARCHAR(20), cname VARCHAR(100), Category VARCHAR(20),prefer1 VARCHAR(20),prefer2 VARCHAR(20))";
        entityManager.createNativeQuery(q0).executeUpdate();

        entityManager.createNativeQuery(dropQuery).executeUpdate();
        entityManager.createNativeQuery(createQuery).executeUpdate();


    }
}
