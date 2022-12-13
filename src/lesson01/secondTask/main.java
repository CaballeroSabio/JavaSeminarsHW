//2.Вывести все простые числа от 1 до 100

package lesson01.secondTask;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        int i = 100;
        do {
            System.out.println("Element: " + i);
            i -= 1;
        } while (i <= 1);
    }
}
