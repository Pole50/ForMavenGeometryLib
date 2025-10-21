package com.geometry;

public class Triangle implements Shape {
    private double sideA;
    private double sideB;
    private double sideC;

    public Triangle(double sideA, double sideB, double sideC) {
        if (!isValidTriangle(sideA, sideB, sideC)) {
            throw new IllegalArgumentException("Invalid triangle sides");
        }
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    private boolean isValidTriangle(double a, double b, double c) {
        return a > 0 && b > 0 && c > 0 &&
                a + b > c && a + c > b && b + c > a;
    }

    @Override
    public double calculateArea() {
        // Using Heron's formula
        double s = calculatePerimeter() / 2;
        return Math.sqrt(s * (s - sideA) * (s - sideB) * (s - sideC));
    }

    @Override
    public double calculatePerimeter() {
        return sideA + sideB + sideC;
    }

    public double getSideA() {
        return sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public double getSideC() {
        return sideC;
    }

    @Override
    public String toString() {
        return String.format("Triangle(sides=%.2f,%.2f,%.2f, area=%.2f, perimeter=%.2f)",
                sideA, sideB, sideC, calculateArea(), calculatePerimeter());
    }
}