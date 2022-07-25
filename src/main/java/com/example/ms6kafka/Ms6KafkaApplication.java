package com.example.ms6kafka;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
@Slf4j
@RequiredArgsConstructor
public class Ms6KafkaApplication  implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(Ms6KafkaApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        log.info("App started");
    }
}
