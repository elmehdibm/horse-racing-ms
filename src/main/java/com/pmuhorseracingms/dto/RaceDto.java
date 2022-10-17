package com.pmuhorseracingms.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Lombok
public class RaceDTO {

    private String name;
    private Date startDate;
    private List<Participant> participantList = new ArrayList<>();

}
