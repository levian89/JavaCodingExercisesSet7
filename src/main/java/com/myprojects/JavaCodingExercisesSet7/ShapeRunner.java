package com.myprojects.JavaCodingExercisesSet7;

import java.util.Scanner;

abstract class Shape {
    protected String name;

    public Shape(String name) {
        this.name = name;
    }

    public abstract double calculateArea();

    public void displayInfo() {
        System.out.println("Shape: " + name);
        System.out.println("Area: " + calculateArea());
    }
}

class Circle extends Shape {
    private double radius;

    public Circle(String name, double radius) {
        super(name);
        this.radius = radius;
    }

    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(String name, double length, double width) {
        super(name);
        this.length = length;
        this.width = width;
    }

    public double calculateArea() {
        return length * width;
    }

}

public class ShapeRunner {
    public static void main(String[] args) {
        Shape circle = new Circle("Circle", 5.0);
        circle.displayInfo();
        Shape rectangle = new Rectangle("Rectangle", 10.0, 5.0);
        rectangle.displayInfo();

        Scanner scanner = new Scanner(System.in);
        getInputFromUserForCircle(scanner);
        getInputFromUserForRectangle(scanner);
        scanner.close();
    }

    private static void getInputFromUserForCircle(Scanner scanner) {
        System.out.println("Provide the name of the shape for the circle: ");
        String nameOfShape = scanner.nextLine();
        System.out.println("Provide the radius: ");
        double radius = scanner.nextDouble();
        Shape circle = new Circle(nameOfShape, radius);
        circle.displayInfo();
    }

    private static void getInputFromUserForRectangle(Scanner scanner) {
        System.out.println("Provide the name of the shape for the rectangle: ");
        String nameOfShape = scanner.next();
        System.out.println("Provide the length and the width: ");
        double length = scanner.nextDouble();
        double width = scanner.nextDouble();
        Shape rectangle = new Rectangle(nameOfShape, length, width);
        rectangle.displayInfo();
    }
}