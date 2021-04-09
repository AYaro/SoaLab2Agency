package com.example.ayaro.Lab2Agency.models;

import java.time.LocalDateTime;


public class Flat{
    public long id; //Значение поля должно быть больше 0, Значение этого поля должно быть уникальным, Значение этого поля должно генерироваться автоматически
    public String name; //Поле не может быть null, Строка не может быть пустой
    public Coordinates coordinates; //Поле не может быть null
    public String creationDate; //Поле не может быть null, Значение этого поля должно генерироваться автоматически
    public Integer area; //Значение поля должно быть больше 0
    public int numberOfRooms; //Значение поля должно быть больше 0
    public Integer height; //Значение поля должно быть больше 0
    public Furnish furnish; //Поле не может быть null
    public Transport transport; //Поле не может быть null
    public House house; //Поле не может быть null
    public int price;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Coordinates getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(Coordinates coordinates) {
        this.coordinates = coordinates;
    }

    public void setCoordinateX(Long x) {
        this.coordinates.setX(x);
    }

    public void setCoordinateY(Double y) {
        this.coordinates.setY(y);
    }

    public String getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }

    public Integer getArea() {
        return area;
    }

    public void setArea(Integer area) {
        this.area = area;
    }

    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    public void setNumberOfRooms(int numberOfRooms) {
        this.numberOfRooms = numberOfRooms;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public Furnish getFurnish() {
        return furnish;
    }

    public void setFurnish(Furnish furnish) {
        this.furnish = furnish;
    }

    public Transport getTransport() {
        return transport;
    }

    public void setTransport(Transport transport) {
        this.transport = transport;
    }

    public House getHouse() {
        return house;
    }

    public void setHouseName(String name) {
        this.house.setName(name);
    }

    public void setHouseNumberOfLifts(int num) {
        this.house.setNumberOfLifts(num);
    }

    public void setHouseYear(Integer year) {
        this.house.setYear(year);
    }

    public void setHouse(House house) {
        this.house = house;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
