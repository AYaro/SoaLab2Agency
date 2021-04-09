package com.example.ayaro.Lab2Agency.models;

public class House {
    public String name; //Поле может быть null
    public Integer year; //Значение поля должно быть больше 0
    public int numberOfLifts; //Значение поля должно быть больше 0

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public int getNumberOfLifts() {
        return numberOfLifts;
    }

    public void setNumberOfLifts(int numberOfLifts) {
        this.numberOfLifts = numberOfLifts;
    }
}