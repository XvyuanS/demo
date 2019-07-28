package com.example.dto;

import java.util.Objects;

public class WoMan {
    private int Id;
    private String name;
    private int stature;
    private String birthday;
    private String production;

    public WoMan() { }

    public WoMan(int id, String name, int stature, String birthday, String production) {
        Id = id;
        this.name = name;
        this.stature = stature;
        this.birthday = birthday;
        this.production = production;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStature() {
        return stature;
    }

    public void setStature(int stature) {
        this.stature = stature;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getProduction() {
        return production;
    }

    public void setProduction(String production) {
        this.production = production;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WoMan woMan = (WoMan) o;
        return Id == woMan.Id &&
                stature == woMan.stature &&
                Objects.equals(name, woMan.name) &&
                Objects.equals(birthday, woMan.birthday) &&
                Objects.equals(production, woMan.production);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Id, name, stature, birthday, production);
    }

    @Override
    public String toString() {
        return "WoMan{" +
                "Id=" + Id +
                ", name='" + name + '\'' +
                ", stature=" + stature +
                ", birthday='" + birthday + '\'' +
                ", production='" + production + '\'' +
                '}';
    }
}
