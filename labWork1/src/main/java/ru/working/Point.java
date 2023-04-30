package ru.working;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(scopeName = "prototype")
public class Point extends Shape {

    private Coords coords;


    public Point(Coords coords) {
        this.coords = coords;

    }

    public Point() {
    }
    @Value(value = "#{soords}")
    public void setCoords(Coords coords) {
        this.coords = coords;
        this.coords.setX(52);
        this.coords.setY(78);
    }

    public Coords getCoords() {
        return coords;
    }


    @Override
    public void draw() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Point{" +
                "coords=" + coords +super.getColor()+
                '}';
    }
}
