package practices01;

import java.util.Scanner;

public class Q06 {
    public static void main(String[] args) {
        // Write a Java program to convert temperature from Fahrenheit to Celsius degree.
//How to convert temp F to C in C?
//Temperature in degrees Celsius (°C) = (Temperature in degrees Fahrenheit (°F) - 32) * 5/9.
        // c = (f-32)*5/9
        Scanner scan = new Scanner(System.in);
        System.out.println(" Enter fahrenheit degree: ");
        double fahrenheitD= scan.nextDouble();
        double resultCelcius= (fahrenheitD-32)*5/9;
        System.out.println("resultCelcius = " + resultCelcius);
    }
}
