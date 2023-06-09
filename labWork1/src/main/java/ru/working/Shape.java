package ru.working;

import org.springframework.beans.factory.annotation.Value;

public abstract class Shape {

    private String color;

    public String getColor() {
        return color;
    }
    @Value("Red")
    public void setColor(String color) {
        this.color = color;
    }

    public abstract void draw();

}
