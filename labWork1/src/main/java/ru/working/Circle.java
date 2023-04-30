package ru.working;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Circle extends Shape{

    private Coords coords;
    private int center;
    private int radius;

    @Autowired
    public Circle (Coords coords) {
        this.coords = coords;
        this.coords.setX(23);
        this.coords.setY(78);
     }

    public Coords getCoords() {
        return coords;
    }

    public void setCoords(Coords coords) {
        this.coords = coords;
    }

    public double getCenter() {
        return center;
    }
    @Value("${center}")
    public void setCenter(int center) {
        this.center = center;
    }

    public int getRadius() {
        return radius;
    }
    @Value("${radius}")
    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Circle{" +
                "coords=" + coords +
                ", center=" + center +
                ", radius=" + radius + ","+
                super.getColor()+'}';
    }
}
