package com.nateshao.task.quartz;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.stereotype.Component;
import java.time.LocalDateTime;

@Component
public class SimpleJob implements Job {
    @Override
    public void execute(JobExecutionContext context) throws JobExecutionException {
        System.out.println("[Quartz] SimpleJob executed at: " + LocalDateTime.now());
    }
} 