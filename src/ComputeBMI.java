import java.lang.Math;
import java.util.Random;
import java.util.Scanner;

public class ComputeBMI {
    public static void main(String[] args) {
        //exercise 1
        System.out.println(Math.PI);
        System.out.println(Math.sqrt(16));

        //exercise 2
        System.out.println(Math.abs(-1.23));
        System.out.println(Math.pow(3, 2));
        System.out.println((Math.sqrt(121.0) - Math.sqrt(256.0)));
        Math.abs(Math.min(-3, -5));

        //exercise 3
        int age = 0;
        //neg values turn to 0
        Math.max(age, 0);
        //limit max age to 40
        Math.min(40, age);

        //exercise 4
        Scanner sc = new Scanner(System.in);
        double height, weight, bmi;
        System.out.println("Enter weight in pounds: ");
        weight = sc.nextDouble();
        System.out.println("Enter height in inches: ");
        height = sc.nextDouble();
        bmi = Math.round((weight/Math.pow(height, 2))*703);
        System.out.println("Your BMI is: " + bmi);
    }
}
