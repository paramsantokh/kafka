package com.example.kafkaproducerconsumer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

/**
 * @author param singh
 */
@Service
public  class Producer{

  public static final String topic="myTopic";
  
  @Autowired
  private KafkaTemplate<String, String> kafkaTemplate;
  
  public void publishToTopic(String message){
  System.out.println("Publishing to topic: "+ topic);
   this.kafkaTemplate.send(topic, message);
  }
}