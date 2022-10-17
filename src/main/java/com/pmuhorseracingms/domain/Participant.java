package com.pmuhorseracingms.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Lombok
public class Participant {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    @Column(unique=true)
    private String name;

    public Participant(String name){
        this.name = name;
    }
}
