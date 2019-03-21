package HomeWork.FindRoots.MultiplicationTable;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число, для которого вывести таблицу умножения");
        int number = scanner.nextInt();
        int i =1;
        int firstNum = 1;
        while (i<11){
            System.out.println(firstNum+" * "+number+" = " + (firstNum*number));
            firstNum += 1;
            i+=1;
        }
    }
}
