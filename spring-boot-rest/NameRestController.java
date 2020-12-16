package com.example.project_rest;

import org.springframework.beans.factory.annotation.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController

public class NameRestController {
    @Autowired
    private NameService service;
    @GetMapping("/names")
    public List<Name> list() {
        return service.listAll();
    }
}
