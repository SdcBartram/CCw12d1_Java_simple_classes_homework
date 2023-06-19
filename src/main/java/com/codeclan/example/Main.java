package com.codeclan.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("CALCULATOR:");

        Calculator calculator = new Calculator();

        int value1 = 10;
        int value2 = 2;

        int sum = calculator.add(value1, value2);
        System.out.println("Sum: " + value1 + " + "+ value2 + " = " + sum);

        int difference = calculator.subtract(value1, value2);
        System.out.println("Difference: " + value1 + " - "+ value2 + " = " + difference);

        int multiply = calculator.multiply(value1, value2);
        System.out.println("Multiply: " + value1 + " * "+ value2 + " = " + multiply);

        double divide = calculator.divide(value1, value2);
        System.out.println("Divide: " + value1 + " / "+ value2 + " = " + divide);

        System.out.println("\n" + "WATERBOTTLE:");
        WaterBottle waterBottle = new WaterBottle();
        System.out.println("Initial volume: " + waterBottle.getVolume());

        waterBottle.drink();
        System.out.println("After drinking: " + waterBottle.getVolume());

        waterBottle.empty();
        System.out.println("After emptying: " + waterBottle.getVolume());

        waterBottle.fill();
        System.out.println("After filling: " + waterBottle.getVolume());

    }
}