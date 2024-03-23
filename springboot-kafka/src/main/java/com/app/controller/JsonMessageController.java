package com.app.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.kafka.JsonKafkaProducer;
import com.app.payload.User;

@RestController
@RequestMapping("/api/kafka")
public class JsonMessageController {

	private JsonKafkaProducer jsonKafkaProducer;

	public JsonMessageController(JsonKafkaProducer jsonKafkaProducer) {
		this.jsonKafkaProducer = jsonKafkaProducer;
	}

	@PostMapping("/publish")
	public ResponseEntity<String> publish(@RequestBody User user) {
		jsonKafkaProducer.sendMessage(user);
		return ResponseEntity.ok("Json Message sent to kafka topic.");
	}
}
