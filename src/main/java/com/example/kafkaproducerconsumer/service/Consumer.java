package com.example.kafkaproducerconsumer.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

/**
 * @author param singh
 */
@Service
public class Consumer {
  
  @KafkaListener(topics = "myTopic", groupId = "mygroup")
  public void consumeFromTopic(String message){
    System.out.println("Consumed message: "+ message);
  }
}
