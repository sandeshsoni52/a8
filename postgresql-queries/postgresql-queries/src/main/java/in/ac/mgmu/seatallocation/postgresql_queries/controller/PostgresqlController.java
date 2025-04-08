package in.ac.mgmu.seatallocation.postgresql_queries.controller;

import in.ac.mgmu.seatallocation.postgresql_queries.service.PostgresqlService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class PostgresqlController {

    private final PostgresqlService service;

    public PostgresqlController(PostgresqlService service) {
        this.service = service;
    }

    @PostMapping("/whatisthis")
    public String whatisthis(@RequestParam String source, @RequestParam String target) {
        service.method1(source, target);
        return "Duplicated table: " + source + " ➡️ " + target;
    }
}
