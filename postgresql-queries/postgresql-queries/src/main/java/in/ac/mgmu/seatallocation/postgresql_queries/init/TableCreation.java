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
//        duplicateTableService.method1("merit_list", "clonetable1635");
//        System.out.println("Table duplicated successfully!");
        duplicateTableService.created212candidiates();
        duplicateTableService.create_calculation_table();
        duplicateTableService.duplicate_meritlist();
        duplicateTableService.separatebyp1();
        duplicateTableService.allocated_cse_r1i1_open();
        duplicateTableService.allocated_cse_r1i1_scstntabcdobc();
        duplicateTableService.r1i2prepare();
        System.out.println("1649");
        duplicateTableService.allocated_mech_r1i1_open();
        duplicateTableService.allocated_mech_r1i1_scstntabcdobc();

    }
}
