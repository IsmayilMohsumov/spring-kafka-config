package com.example.ms6kafka.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Slf4j
@RequiredArgsConstructor
@Service
public class Producer {

    private final KafkaTemplate<String, String> kafkaTemplate;

    @Scheduled(fixedRate = 1000)
    public void produceMessages() {
        log.info("Sending new message to kafka");
        kafkaTemplate.send("ms6-demo", "Hello Kafka, " + LocalDateTime.now());
    }

}
