package lesson01.first;

import java.util.Scanner;

// Вычислить n-ое треугольного число(сумма чисел от 1 до n)

public class main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sum = 0;
        int startNum = 1;
        System.out.print("Enter the number: ");
        int n1 = scan.nextInt();
        int result1 = 1 + n1;
        System.out.println("n-triangular number is " + result1);
        // Вычислить n! (произведение чисел от 1 до n)
        System.out.print("Enter the number: ");
        int n2 = scan.nextInt();
        int result2 = mult(n2);
        System.out.println("factorial of n is " + result2);

    }

    public static int mult(int number) {
        int res = 1;
        if (number != 0) {
            int i = 0;
            for (i = 1; i <= number; i++) res *= i;
            return res;
        } else {
            res = 1;
            return res;
        }
    }
}