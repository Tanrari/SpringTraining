package ru.homeworkone;

public class Point extends Shape {
    private Coords coords;

    public Point(Coords coords) {
        this.coords = coords;
//        this.coords.setX(52);
//        this.coords.setY(78);
    }

    public Point() {
    }

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
                "coords=" + coords +
                '}';
    }
}
