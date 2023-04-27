package ru.homeworkone;

public class Circle extends Shape{

    private Coords coords;
    private int center;
    private int radius;

    public Circle (Coords coords) {
        this.coords = coords;
        this.coords.setX(39);
        this.coords.setY(25);

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

    public void setCenter(int center) {
        this.center = center;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
    public void setX(int x){
        coords.setX(32);
    }

    public void setY(int y){
        coords.setY(67);
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
