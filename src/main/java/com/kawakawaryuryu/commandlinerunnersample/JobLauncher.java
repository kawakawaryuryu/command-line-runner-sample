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

    public JobLauncher(
            @Value("${application.name}") String appName,
            @Value("${config.name}") String config) {
        this.appName = appName;
        this.config = config;
    }

    @Override
    public void run(String... args) throws Exception {
        log.info("app started");
    }

    public String hoge(String fuga) {
        log.info(appName + " starting");
        log.info(config + " starting");
        return fuga;
    }
}
