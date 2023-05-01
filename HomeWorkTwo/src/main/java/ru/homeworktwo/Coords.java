package ru.homeworktwo;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


public class Coords {

    private int x;

    private int  y;


    @Override
    public String toString() {
        return "Coords{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    public Coords(int x,  int y) {
        this.x = x;
        this.y = y;
    }

    public Coords() {
    }

    public int getX() {
        return x;
    }
    @Value("32")
    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }
    @Value("22")
    public void setY(int y) {
        this.y = y;
    }
}
