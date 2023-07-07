package com.myprojects.JavaCodingExercisesSet7;

import java.util.Scanner;

interface Operation {
    int perform(int x, int y);

}


class Add implements Operation {
    @Override
    public int perform(int x, int y) {
        return x+y;
    }
}

class Subtract implements Operation {
    @Override
    public int perform(int x, int y) {
        return x-y;
    }
}

class Multiply implements Operation {
    @Override
    public int perform(int x, int y) {
        return x*y;
    }
}

class Divide implements Operation {
    @Override
    public int perform(int x, int y) {
        if (y == 0) {
            return -1;
        }
        return x / y;
    }
}

public class OperationRunner {
    private static int getNumberFromUser(Scanner scanner) {
        System.out.println("Enter the number: ");
        int number1 = scanner.nextInt();
        return number1;
    }

    public static void main(String[] args) {
        Operation addition = new Add();
        System.out.println("Addition of the two numbers: " + addition.perform(4,19));

        Operation subtraction = new Subtract();
        System.out.println("Subtraction of the two numbers: " + subtraction.perform(4,19));

        Operation multiplication = new Multiply();
        System.out.println("Multiplication of the two numbers: " + multiplication.perform(4,19));

        Operation division = new Divide();
        System.out.println("Division of the two numbers: " + division.perform(4,19));

        Operation[] operations = {new Add(), new Subtract(), new Multiply(), new Divide()}; // array of operations
        for (Operation operation:operations) {                                            // through Operation interface
            System.out.println(operation.perform(4,19));
        }

        Scanner scanner = new Scanner(System.in);
        int number1 = getNumberFromUser(scanner);
        int number2 = getNumberFromUser(scanner);

        System.out.println("Addition of the two numbers: " + number1 + " + " + number2 + " = "
                + addition.perform(number1,number2));
        System.out.println("Subtraction of the two numbers: " + number1 + " - " + number2 + " = "
                + subtraction.perform(number1,number2));
        System.out.println("Multiplication of the two numbers: " + number1 + " * " + number2 + " = "
                + multiplication.perform(number1,number2));
        System.out.println("Division of the two numbers: " + number1 + " / " + number2 + " = "
                + division.perform(number1,number2));
    }
}
