package com.example.duplicatetable;

import com.example.duplicatetable.service.DuplicateTableService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class DuplicateController {

    private final DuplicateTableService service;

    public DuplicateController(DuplicateTableService service) {
        this.service = service;
    }

    @PostMapping("/duplicate")
    public String duplicate(@RequestParam String source, @RequestParam String target) {
        service.duplicateTable(source, target);
        return "Duplicated table: " + source + " ➡️ " + target;
    }
}

