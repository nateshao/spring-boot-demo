package com.nateshao.elasticsearchrest.controller;

import org.elasticsearch.action.get.GetRequest;
import org.elasticsearch.action.get.GetResponse;
import org.elasticsearch.action.index.IndexRequest;
import org.elasticsearch.action.index.IndexResponse;
import org.elasticsearch.client.RequestOptions;
import org.elasticsearch.client.RestHighLevelClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.Map;

@RestController
@RequestMapping("/es-rest")
public class EsRestController {
    @Autowired
    private RestHighLevelClient client;

    @PostMapping("/save")
    public String save(@RequestBody Map<String, Object> doc) throws IOException {
        IndexRequest request = new IndexRequest("demo").source(doc);
        IndexResponse response = client.index(request, RequestOptions.DEFAULT);
        return response.getId();
    }

    @GetMapping("/get/{id}")
    public Map<String, Object> get(@PathVariable String id) throws IOException {
        GetRequest request = new GetRequest("demo", id);
        GetResponse response = client.get(request, RequestOptions.DEFAULT);
        return response.getSource();
    }
} 