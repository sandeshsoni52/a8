package com.example.duplicatetable.service;


import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

@Service
public class DuplicateTableService {

    @PersistenceContext
    private EntityManager entityManager;

    @Transactional
    public void duplicateTable(String sourceTable, String targetTable) {
        String dropQuery = "DROP TABLE IF EXISTS " + targetTable;
        String createQuery = "CREATE TABLE " + targetTable + " AS TABLE " + sourceTable;
        String q1 = "CREATE TABLE merit_listp12 ( Srno INTEGER,Rollno VARCHAR(20), cname VARCHAR(100), Category VARCHAR(20),prefer1 VARCHAR(20),prefer2 VARCHAR(20))";

        entityManager.createNativeQuery(dropQuery).executeUpdate();
        entityManager.createNativeQuery(createQuery).executeUpdate();
        entityManager.createNativeQuery(q1).executeUpdate();

    }
}
