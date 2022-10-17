package com.pmuhorseracingms.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Lombok
public class Race {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    @Column(unique=true)
    private String name;
    @Timestamp
    private Date startDate;
    @OneToMany(
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    private List<Participant> participantList = new ArrayList<>();
    public Race(String name, List<Participant> participantList){
        this.name = name;
        this.participantList = participantList;
    }
}
