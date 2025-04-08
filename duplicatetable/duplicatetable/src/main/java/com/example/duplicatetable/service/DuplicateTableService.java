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

        entityManager.createNativeQuery(dropQuery).executeUpdate();
        entityManager.createNativeQuery(createQuery).executeUpdate();
    }
}
