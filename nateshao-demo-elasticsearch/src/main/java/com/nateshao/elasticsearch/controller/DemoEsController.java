package com.nateshao.elasticsearch.controller;

import com.nateshao.elasticsearch.entity.DemoDoc;
import com.nateshao.elasticsearch.repository.DemoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/es")
public class DemoEsController {
    @Autowired
    private DemoRepository demoRepository;

    @PostMapping("/save")
    public DemoDoc save(@RequestBody DemoDoc doc) {
        return demoRepository.save(doc);
    }

    @GetMapping("/get/{id}")
    public DemoDoc get(@PathVariable String id) {
        return demoRepository.findById(id).orElse(null);
    }
} 