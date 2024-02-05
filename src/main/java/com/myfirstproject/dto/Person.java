package com.myfirstproject.dto;

public class Person {

    private String name;
    private int age;
    private double savings;

    public Person(String name, int age, double savings) {
        this.name = name;
        this.age = age;
        this.savings = savings;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSavings() {
        return savings;
    }

    public void setSavings(double savings) {
        this.savings = savings;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", savings=" + savings +
                '}';
    }
}
