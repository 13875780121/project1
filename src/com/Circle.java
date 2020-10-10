package com;

public class Circle implements Comparable<Circle> {

    private double radius;

    public double getRadius() {
        return radius;
    }

    public Circle(double radius) {this.radius = radius;}
    @Override
    public String toString() {
        return "Circle radius: " + radius;
    }

    @Override
    public boolean equals(Object obj) {
        Circle temp = (Circle) obj;
        return temp.getRadius() == this.getRadius();
    }

    @Override
    public int compareTo(Circle o) {

        if (radius > o.getRadius()) return 1;
        else if(radius == o.getRadius()) return 0;
        else  return -1;
    }
}
