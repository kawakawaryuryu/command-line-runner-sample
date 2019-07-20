package com.kawakawaryuryu.commandlinerunnersample;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@Slf4j
@PropertySource("config.properties")
public class JobLauncher implements CommandLineRunner {

    private final String appName;

    private final String config;

    private final Integer value;

    public JobLauncher(
            @Value("${application.name}") String appName,
            @Value("${config.name}") String config,
            @Value("${hoge.fuga.value}") Integer value) {
        this.appName = appName;
        this.config = config;
        this.value = value;
    }

    @Override
    public void run(String... args) throws Exception {
        log.info("app started");
    }

    public String hoge(String fuga) {
        log.info(appName + " starting");
        log.info(config + " starting");
        log.info(value + " starting");
        return fuga;
    }
}
