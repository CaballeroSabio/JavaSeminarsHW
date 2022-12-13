//3. Реализовать простой калькулятор (операции + - / * )

package lesson01.thirdTask;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        float num1 = scan.nextFloat();
        System.out.print("Enter the second number: ");
        float num2 = scan.nextFloat();
        float res1 = num1 + num2;
        float res2= num1 - num2;
        float res3 = num1 * num2;
        float res4 = num1 / num2;
        System.out.println("Result of ");
        System.out.println("addition: " + res1 + "\n" + "subtraction: " + res2 + "\n" + "multiplication: " + res3 + "\n" + "division: " + res4);
    }
}
