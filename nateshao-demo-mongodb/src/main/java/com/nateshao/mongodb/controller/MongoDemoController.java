package com.nateshao.mongodb.controller;

import com.nateshao.mongodb.entity.DemoDoc;
import com.nateshao.mongodb.repository.DemoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/mongo")
public class MongoDemoController {
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