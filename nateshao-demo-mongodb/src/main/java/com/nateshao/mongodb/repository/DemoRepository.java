package com.nateshao.mongodb.repository;

import com.nateshao.mongodb.entity.DemoDoc;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface DemoRepository extends MongoRepository<DemoDoc, String> {
} 