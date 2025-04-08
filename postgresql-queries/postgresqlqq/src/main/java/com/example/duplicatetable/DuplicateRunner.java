package com.example.duplicatetable;

import com.example.duplicatetable.service.DuplicateTableService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DuplicateRunner implements CommandLineRunner {

    private final DuplicateTableService duplicateTableService;

    public DuplicateRunner(DuplicateTableService duplicateTableService) {
        this.duplicateTableService = duplicateTableService;
    }

    @Override
    public void run(String... args) throws Exception {
        duplicateTableService.duplicateTable("users", "employees_backup1114");
        System.out.println("Table duplicated successfully!");
    }
}

