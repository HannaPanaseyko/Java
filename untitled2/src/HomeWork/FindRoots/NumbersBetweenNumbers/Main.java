package HomeWork.FindRoots.NumbersBetweenNumbers;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number");
        int firstNumber = scanner.nextInt();
        int firstNumber2 = firstNumber;
        int lastNumber = scanner.nextInt();
        int lastNumber2 = lastNumber;
        System.out.println("Все нечетные числа в промежутке между " + firstNumber+ " и "+lastNumber);
        if((firstNumber%2)==0){
            if ((lastNumber%2)==0){
                //System.out.println("Число " + lastNumber + " четное ");
                lastNumber--;
            }
            //System.out.println("Число " + firstNumber + " четное ");
            firstNumber++;
            while (firstNumber<=lastNumber){
                System.out.println(firstNumber);
                firstNumber = firstNumber + 2;
            }
        }
        else{
            if((firstNumber%1)==0){
                if ((lastNumber%2)==0){
                   // System.out.println("Число " + lastNumber + " четное ");
                    lastNumber--;
                }
                //System.out.println("Число " + firstNumber + " нечетное ");

                while (firstNumber<=lastNumber){
                    System.out.println(firstNumber);
                    firstNumber = firstNumber + 2;
                }
            }
        }
        System.out.println("Все четные числа в промежутке между " + firstNumber2+ " и "+lastNumber2);
        if((firstNumber2%2)==0){
            if ((lastNumber2%2)==0){
                //System.out.println("Число " + lastNumber2 + " четное ");
                lastNumber2--;
            }
            //System.out.println("Число " + firstNumber2 + " четное ");
            while (firstNumber2<=lastNumber2){
                System.out.println(firstNumber2);
                firstNumber2 = firstNumber2 + 2;
            }
        }
        else{
            if((firstNumber2%1)==0){
                if ((lastNumber2%2)==0){
                    // System.out.println("Число " + lastNumber2 + " четное ");
                    lastNumber2--;
                }
                //System.out.println("Число " + firstNumber2 + " нечетное ");
                firstNumber2++;
                while (firstNumber2<=lastNumber2){
                    System.out.println(firstNumber2);
                    firstNumber2 = firstNumber2 + 2;
                }
            }
        }
    }
}
