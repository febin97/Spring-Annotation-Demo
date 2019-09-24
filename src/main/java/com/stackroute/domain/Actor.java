package com.stackroute.domain;

import org.springframework.stereotype.Component;

@Component
public class Actor {
    private String actorName;
    private String actorGender;
    private int actorAge;

    public Actor() {
        System.out.println("Actor Constructor ");
    }

    public Actor(String actorName, String actorGender, int actorAge) {
        this.actorName = actorName;
        this.actorGender = actorGender;
        this.actorAge = actorAge;
    }

    public String getActorName() {
        return actorName;
    }

    public void setActorName(String actorName) {
        this.actorName = actorName;
    }

    public String getActorGender() {
        return actorGender;
    }

    public void setActorGender(String actorGender) {
        this.actorGender = actorGender;
    }

    public int getActorAge() {
        return actorAge;
    }

    public void setActorAge(int actorAge) {
        this.actorAge = actorAge;
    }

    @Override
    public String toString() {
        return "Actor{" +
                "actorName='" + actorName + '\'' +
                ", actorGender='" + actorGender + '\'' +
                ", actorAge=" + actorAge +
                '}';
    }
}
