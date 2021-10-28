# spark-avro-common
Created to demo kafka avro message stcutured streaming with apache spark

#Project Details:

This project will be having avro dependecies to create avro POJO using avro plugin.
We have sample message for Inventory, for that you can find the avro schema under resources folder.

We first create sorce code using that avro schema and same we will be using to create java Inventory
object.

We will create local kafka single node cluster and push the message to AVRO-TOPIC.

Here are the commands to be used to create local kafka cluster.

I am using kafka_2.11-0.11.0.1 kafka version.

1. Start zookeeper
Open the windows CMD and Go to the home directory where you have downloaded the kafka zip.
In my case, it will be under C:\real-time-tools\kafka_2.11-0.11.0.1

cd C:\real-time-tools\kafka_2.11-0.11.0.1

Run the below command to start zookeeper

.\bin\windows\zookeeper-server-start.bat .\config\zookeeper.properties

2. Start the Kafka Broker

From the same directory execute below command

.\bin\windows\kafka-server-start.bat .\config\server.properties

3. Create topic named "AVRO-TOPIC" with 3 partitions

cd C:\real-time-tools\kafka_2.11-0.11.0.1\bin\windows

kafka-topics.bat --create --zookeeper localhost:2181 --replication-factor 1 --partitions 3 --topic AVRO-TOPIC

Once the kafka is up and running, you can run the main class

com.example.AvroProducer to start pushing messages. 
 