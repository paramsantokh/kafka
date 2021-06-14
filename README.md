A simple example to show Kafka function with Producer/Consumer.

Producer will publish(send) the message to kafka topic and consumer 
will consume(read) the message from there.

Download apache kafka:
https://www.apache.org/dyn/closer.cgi?path=/kafka/2.8.0/kafka_2.13-2.8.0.tgz

Unzip it and place at any location on your system.

Goto the kafka directory(kafka_2.13-2.8.0):
 1. Run zookeeper:
    >  bin/zookeeper-server-start.sh config/zookeeper.properties
 2. Start kafka Server
    >  bin/kafka-server-start.sh config/server.properties
 3. Create topic
    >  bin/kafka-topics.sh --create --topic mytopic --bootstrap-server localhost:9092   
 3. Start producer
    >  bin/kafka-console-producer.sh --topic mytopic --bootstrap-server localhost:9092
 4. Start consumer
    >  bin/kafka-console-consumer.sh --topic mytopic --bootstrap-server localhost:9092

Run the application from KafkaproducerconsumerApplication.

Using postman(or any other tool) post messages using below URL:

http://localhost:8080/kafkaapp/post?msg=Hello

In Application console you can see output as below:

>Publishing to topic: myTopic

>Consumed message: HELLO
