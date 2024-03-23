# apache-kafka-springboot
Sample Spring boot application with implementation of apache kafka as a message broker



Commands

	- link for kafka local server setup https://kafka.apache.org/quickstart
	- link for kafka download https://www.apache.org/dyn/closer.cgi?path=/kafka/3.7.0/kafka_2.13-3.7.0.tgz
	
	- Start the ZooKeeper service
		-> .\bin\windows\zookeeper-server-start.bat config\zookeeper.properties
	
	- Start the Kafka broker service
		-> .\bin\windows\kafka-server-start.bat config\server.properties

	- To create Kafka TOPIC
		-> .\bin\windows\kafka-topics.bat --create --topic test-topic --bootstrap-server localhost:9092
		
	- Write some EVENTS into the TOPIC
		-> .\bin\windows\kafka-console-producer.bat --topic test-topic --bootstrap-server localhost:9092
			Put below events
			>hello world
			>topic demo
	- Read the EVENTS
		-> .\bin\windows\kafka-console-consumer.bat --topic test-topic --from-beginning --bootstrap-server localhost:9092
			get below events
			>hello world
			>topic demo
			

	Commands to start servers again and check messages 
		1.	Start the ZooKeeper service
		-> .\bin\windows\zookeeper-server-start.bat config\zookeeper.properties 
		2.	Start the Kafka broker service
		-> .\bin\windows\kafka-server-start.bat config\server.properties
		
		3.	Produce messages as below by spring boot application 	
			>http://localhost:8080/api/kafka/publish?message=This is my first message
			>http://localhost:8080/api/kafka/publish?message=This is my second message
			>http://localhost:8080/api/kafka/publish?message=This is my third message
		
		4. 	To read events produced messages from spring boot application topic test-topic	
		-> .\bin\windows\kafka-console-consumer.bat --topic test-topic --from-beginning --bootstrap-server localhost:9092
		
		
		