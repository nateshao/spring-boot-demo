package com.nateshao.elasticsearch.repository;

import com.nateshao.elasticsearch.entity.DemoDoc;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface DemoRepository extends ElasticsearchRepository<DemoDoc, String> {
} 