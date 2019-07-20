package com.kawakawaryuryu.commandlinerunnersample;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.ConfigFileApplicationContextInitializer;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@ContextConfiguration(
        classes = TestConfiguration.class,
        initializers = ConfigFileApplicationContextInitializer.class)
public class JobLauncherTest {

    @Autowired
    private JobLauncher jobLauncher;

    @Test
    public void testHoge() {
        String fuga = jobLauncher.hoge("fuga");
        assertThat(fuga).isEqualTo("fuga");
    }
}
