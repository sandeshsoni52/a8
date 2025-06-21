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
//        duplicateTableService.method1("merit_list", "clone223maytable1635");
//        System.out.println("Table duplicated successfully!");

        duplicateTableService.create_calculation_table();
        duplicateTableService.duplicate_meritlist();
        duplicateTableService.separatebyp1();
        duplicateTableService.allocated_cse_r1i1_open();
        duplicateTableService.allocated_cse_r1i1_scstobc();
//        duplicateTableService.r1i2prepare();

        duplicateTableService.allocated_mech_r1i1_general();
        duplicateTableService.allocated_mech_r1i1_scstobc();
        System.out.println("1522");

    }
}
