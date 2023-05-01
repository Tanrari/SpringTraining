package ru.homeworktwo;

public class Point extends Shape {
    private Coords coords;

    public Point(Coords coords) {
        this.coords = coords;
    }

    public Point() {

    }


    public void setCoords(Coords coords) {
        this.coords = coords;

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
