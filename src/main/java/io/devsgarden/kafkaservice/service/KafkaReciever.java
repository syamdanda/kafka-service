package io.devsgarden.kafkaservice.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import io.devsgarden.kafkaservice.model.Student;

@Service
public class KafkaReciever {

	private static final Logger LOGGER = LoggerFactory.getLogger(KafkaReciever.class);

	@KafkaListener(topics = "test-topic", groupId = "group_id")
	public void recieveData(Student student) {
		LOGGER.info("Data - " + student.toString() + " recieved");
	}
}
