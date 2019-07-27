package com.kawakawaryuryu.commandlinerunnersample;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class JobLauncher implements CommandLineRunner {

    private final String hogeValue;

    public JobLauncher(
            @Value("${hoge.value}") String hogeValue) {
        this.hogeValue = hogeValue;
    }

    @Override
    public void run(String... args) {
        log.info("app started");
    }

    public String hoge() {
        log.info(hogeValue);
        return hogeValue;
    }
}
