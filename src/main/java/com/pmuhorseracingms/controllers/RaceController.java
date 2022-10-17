package com.pmuhorseracingms.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.netsurfingzone.constant.ApplicationConstant;
import com.netsurfingzone.dto.Student;

@RestController
@RequestMapping("/racing")
public class RaceController {

	@Autowired
	private KafkaTemplate<String, Object> kafkaTemplate;

	@Autowired
	private RaceService raceService;


	@PostMapping("/create")
	public String sendMessage(@RequestBody String name, @RequestBody List<string> participants) {
		try {
			RaceDTO race = raceService.createRace(name, participants);
			kafkaTemplate.send(ApplicationConstant.TOPIC_NAME, race.toString());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "Race created successfully";
	}

}
