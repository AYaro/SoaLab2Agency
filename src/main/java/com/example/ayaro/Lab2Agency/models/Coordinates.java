package com.example.ayaro.Lab2Agency.models;

public class Coordinates {
    public Long x; //Значение поля должно быть больше -484, Поле не может быть null
    public Double y; //Поле не может быть null

    public Long getX() {
        return x;
    }

    public Double getY() {
        return y;
    }

    public void setX(Long x) {
        this.x = x;
    }

    public void setY(Double y) {
        this.y = y;
    }
}

