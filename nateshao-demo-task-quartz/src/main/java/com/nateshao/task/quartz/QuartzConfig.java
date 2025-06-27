package com.nateshao.task.quartz;

import org.quartz.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class QuartzConfig {
    @Bean
    public JobDetail simpleJobDetail() {
        return JobBuilder.newJob(SimpleJob.class)
                .withIdentity("simpleJob")
                .storeDurably()
                .build();
    }

    @Bean
    public Trigger simpleJobTrigger() {
        SimpleScheduleBuilder scheduleBuilder = SimpleScheduleBuilder.simpleSchedule()
                .withIntervalInSeconds(10)
                .repeatForever();
        return TriggerBuilder.newTrigger()
                .forJob(simpleJobDetail())
                .withIdentity("simpleJobTrigger")
                .withSchedule(scheduleBuilder)
                .build();
    }
} 