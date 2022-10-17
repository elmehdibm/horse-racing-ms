package com.pmuhorseracingms.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/racing")
public class RaceService {

    @Autowired
    private RaceRepository raceRepository;

    public RaceDTO createRace(String raceName, List<string> participants) {
        try {
            if(participants == null || participants.length < 2){
                throw new Exception("Participants should be at least 3");
            }
            List<Participant> participantList = new ArrayList<Participants>();
            for(int i = 0; i < participants.length; i++){
                participantList.add(new Participant(participants[i]));
            }
            Race race = new Race(raceName,participantList);

            raceRepository.save(race);

            return RaceMapper.mapToDto(race);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
