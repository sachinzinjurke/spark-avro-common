package com.example;

import com.example.avro.pojo.Inventory;
import com.example.kafka.KafkaUtils;
import com.example.serializer.AvroSerializer;
import org.apache.kafka.clients.producer.Producer;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.clients.producer.RecordMetadata;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.Instant;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

public class AvroProducer {

    public static Logger logger = LoggerFactory.getLogger(AvroProducer.class);
    public static void main(String[] args) {

        Producer<String,byte[]> producer = KafkaUtils.createProducer();
        AvroSerializer<Inventory> serializer = new AvroSerializer<>();

        for(int i = 0 ; i<5 ; i++){

            Inventory inventory = Inventory.newBuilder()
                    .setInventoryId("1111" + i)
                    .setInventoryVersion(i)
                    .setMessageType("EXECUTION")
                    .setSource("PRODUCER")
                    .setInputSystemIsac("AT31062")
                    .setDomainIsac("AT41062")
                    .setStatus("NEWT")
                    .setProcessedTs(Instant.now().getEpochSecond())
                    .build();

            byte[] data = serializer.serialize("AVRO-TOPIC", null, inventory);
            ProducerRecord<String, byte[]> producerRecord = new ProducerRecord<String, byte[]>("AVRO-TOPIC",null,data);
            Future<RecordMetadata> metadataFuture = producer.send(producerRecord);
            RecordMetadata metadata = null;
            try {
                metadata = metadataFuture.get();
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            }

            logger.info("Msg Sent Partion : {}, offset : {}",metadata.partition(), metadata.offset());

        }


    }
}
