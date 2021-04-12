package com.example.firstspringapplication;

public class Player {
    Integer id;
    String Name;
    String Club_name;
    String Country;

    public Player(Integer id, String name, String club_name, String country) {
        this.id = id;
        Name = name;
        Club_name = club_name;
        Country = country;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getClub_name() {
        return Club_name;
    }

    public void setClub_name(String club_name) {
        Club_name = club_name;
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String country) {
        Country = country;
    }
}
