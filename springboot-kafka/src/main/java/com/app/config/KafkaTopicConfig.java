package com.app.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopicConfig {

	
	//created topic bean here after name method there are more options to explore
	@Bean
	public NewTopic topic() {
		return TopicBuilder.name("test-topic").build();
	}
}
