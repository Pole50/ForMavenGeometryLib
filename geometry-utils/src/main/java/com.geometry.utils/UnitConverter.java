package com.geometry.utils;

public class UnitConverter {

    public static Double centimetersToMeters(double cm) {
        return cm / 100.0;
    }

    public static Double metersToCentimeters(double m) {
        return m * 100.0;
    }

    public static Double inchesToCentimeters(double inches) {
        return inches * 2.54;
    }

    public static Double centimetersToInches(double cm) {
        return cm / 2.54;
    }
}