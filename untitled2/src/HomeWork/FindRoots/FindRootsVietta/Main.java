package HomeWork.FindRoots.FindRootsVietta;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите p и q");
        int p = scanner.nextInt();
        int q = scanner.nextInt();

        int d = p * p - 4 * q;
        if (d < 0) {
            System.out.println("Корней нет");
        }
        double x1 = (-p + Math.sqrt(d)) / 2;
        double x2 = x1 + p;

        System.out.println(x1);
        System.out.println(x2);
    }
}
