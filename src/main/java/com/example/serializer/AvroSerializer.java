package com.example.serializer;

import org.apache.avro.generic.GenericRecord;
import org.apache.avro.io.BinaryEncoder;
import org.apache.avro.io.DatumWriter;
import org.apache.avro.io.EncoderFactory;
import org.apache.avro.specific.SpecificDatumWriter;
import org.apache.avro.specific.SpecificRecordBase;
import org.apache.kafka.common.errors.SerializationException;
import org.apache.kafka.common.header.Headers;
import org.apache.kafka.common.serialization.Serializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.Serializable;
import java.util.Map;

public class AvroSerializer<T extends SpecificRecordBase> implements Serializer<T>, Serializable {

    Logger logger = LoggerFactory.getLogger(AvroSerializer.class);

    @Override
    public void configure(Map<String, ?> configs, boolean isKey) {

    }

    @Override
    public byte[] serialize(String s, T t) {
        return new byte[0];
    }

    @Override
    public byte[] serialize(String topic, Headers headers, T data)  {
        logger.info("Serializing data");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        BinaryEncoder binaryEncoder = EncoderFactory.get().binaryEncoder(byteArrayOutputStream, null);
        byte[] result = null;
        try {
            DatumWriter<GenericRecord> writer = new SpecificDatumWriter<>(data.getSchema());
            writer.write(data, binaryEncoder);
            binaryEncoder.flush();
            byteArrayOutputStream.close();
            result = byteArrayOutputStream.toByteArray();
            System.out.println("Data length : " + result.length);

        } catch (IOException ex) {
            throw new SerializationException("Cant Serialize Message ",ex);
        }finally {

            try{
                if(byteArrayOutputStream!=null){
                    byteArrayOutputStream.close();
                }
                if(binaryEncoder!=null){
                    binaryEncoder.flush();

                }
            }catch(IOException ex){
                throw new RuntimeException(ex);
            }

        }
        return result;
    }

    @Override
    public void close() {

    }
}
