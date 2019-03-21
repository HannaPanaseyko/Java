package HomeWork.FindRoots.Fibonachi;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        int number = scanner.nextInt();

        int num1 = 1; int num2 = 1;
        int i = 0;
        while (i < (number-2)){
            int numSum = num1 + num2;
            num1 = num2;
            num2 = numSum;
            i+=1;
        }
        System.out.println(num2);
    }
}
