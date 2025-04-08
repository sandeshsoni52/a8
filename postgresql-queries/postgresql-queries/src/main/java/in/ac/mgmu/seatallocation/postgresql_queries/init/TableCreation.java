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
        duplicateTableService.method1("merit_list", "clonetable1629");
        System.out.println("Table duplicated successfully!");
    }
}
