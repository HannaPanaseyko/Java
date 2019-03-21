package HomeWork.FindRoots.AreYouLucky;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число от 0 до 20");
        int number = scanner.nextInt();
        Random random = new Random();
        int ticket = random.nextInt(20);
        if (ticket == number){
            System.out.println("Вы счастливчик!");
            System.out.println(ticket);
        } else {
            System.out.println("Попробуйте свою удачу ещё раз!");
            System.out.println(ticket);
        }
    }
}
