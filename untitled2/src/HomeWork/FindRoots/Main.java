package HomeWork.FindRoots;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите a, b и с");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        int d = (b * b) - 4 * a * c;

        if (a > 0) {
            System.out.println("Дискриминант = " + d);
            if (d == 0) {
                double x1 = (-b + (Math.sqrt(d))) / (2 * a);
                System.out.println(x1);
            } else if (d > 0) {
                double x1 = (-b + (Math.sqrt(d))) / (2 * a);
                double x2 = (-b - (Math.sqrt(d))) / (2 * a);
                System.out.println(x1);
                System.out.println(x2);
            } else
                System.out.println("Корней нет");
        } else
            System.out.println("'а' не может быть меньше или равно нулю");
    }
}

