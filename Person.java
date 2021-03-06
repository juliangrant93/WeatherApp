package com.tts.WeatherApp.model;

import java.util.List;

import lombok.Data;

public class Person {

    public String firstName;
    public String lastName;
    public int age;
    public List<String> favoriteFoods;

    public Person(String firstName, String lastName, int age, List<String> favoriteFoods) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.favoriteFoods = favoriteFoods;
    }
}