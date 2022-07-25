package com.example.ms6kafka.service;


import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class Consumer {

    @KafkaListener(topics = "ms6-demo", groupId = "ingress1")
    public void listenGroupFoo(String message) throws InterruptedException {
        log.info("Received Message in group ingress1 {} ", message);
        //Thread.sleep((long) (Math.random() * 10000));
    }

}
