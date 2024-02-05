package com.myfirstproject.dto;

public class GreetResponse {
    private final String greet;

    public GreetResponse(String greet) {
        this.greet = greet;
    }

    public String getGreet() {
        return greet;
    }

    @Override
    public String toString() {
        return "GreetResponse{" +
                "greet='" + greet + '\'' +
                '}';
    }
}
