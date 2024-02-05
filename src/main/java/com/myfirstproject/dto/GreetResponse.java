package com.myfirstproject.dto;

import java.util.List;

public class GreetResponse {

    private final String greet;
    private List<String> faveProgrammingLanguages;
    private Person person;

    public GreetResponse(String greet, List<String> faveProgrammingLanguages, Person person) {
        this.greet = greet;
        this.faveProgrammingLanguages = faveProgrammingLanguages;
        this.person = person;
    }

    public String getGreet() {
        return greet;
    }

    public List<String> getFaveProgrammingLanguages() {
        return faveProgrammingLanguages;
    }

    public void setFaveProgrammingLanguages(List<String> faveProgrammingLanguages) {
        this.faveProgrammingLanguages = faveProgrammingLanguages;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    @Override
    public String toString() {
        return "GreetResponse{" +
                "greet='" + greet + '\'' +
                ", faveProgrammingLanguages=" + faveProgrammingLanguages +
                ", person=" + person +
                '}';
    }
}
