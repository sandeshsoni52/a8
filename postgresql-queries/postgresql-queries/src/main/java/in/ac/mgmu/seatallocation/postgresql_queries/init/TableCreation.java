package in.ac.mgmu.seatallocation.postgresql_queries.init;

import in.ac.mgmu.seatallocation.postgresql_queries.service.PostgresqlService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class TableCreation implements CommandLineRunner {

    private final PostgresqlService duplicateTableService;

    public TableCreation(PostgresqlService duplicateTableService) {
        this.duplicateTableService = duplicateTableService;
    }

    @Override
    public void run(String... args) throws Exception {
        duplicateTableService.method1("merit_list", "clonetable1635");
        System.out.println("Table duplicated successfully!");
        duplicateTableService.method3();
        System.out.println("1051");
        duplicateTableService.method4();
        System.out.println("1056");
        duplicateTableService.method5();
        System.out.println("1114");
        duplicateTableService.duplicate_meritlist();
        duplicateTableService.separatebyp1();
        System.out.println("1504");
        duplicateTableService.allocated_cse_r1i1_open();
        duplicateTableService.allocated_cse_r1i1_scstntabcdobc();
        System.out.println("1515");

    }
}
