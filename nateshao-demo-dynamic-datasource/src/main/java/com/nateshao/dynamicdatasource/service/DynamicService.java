package com.nateshao.dynamicdatasource.service;

import com.baomidou.dynamic.datasource.annotation.DS;
import org.springframework.stereotype.Service;

@Service
public class DynamicService {
    @DS("db1")
    public String db1Data() {
        return "数据源1数据";
    }

    @DS("db2")
    public String db2Data() {
        return "数据源2数据";
    }
} 