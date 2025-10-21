package com.geometry;

public class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
        if (radius <= 0) {
            throw new IllegalArgumentException("Radius must be positive");
        }
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public String toString() {
        return String.format("Circle(radius=%.2f, area=%.2f, perimeter=%.2f)",
                radius, calculateArea(), calculatePerimeter());
    }

    public double calculateDiameter() {
        return 2 * radius;
    }
}
