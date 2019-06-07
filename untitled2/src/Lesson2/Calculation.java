package HomeWork;

import java.util.Calendar;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;

public class Calculation {

    public void fibonachi(int number) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        number = scanner.nextInt();

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

    public void areYouLucky() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int ticket = random.nextInt(20);

        boolean check = true;
        while (check) {
            System.out.println("Введите число от 0 до 20");
            int number = scanner.nextInt();
            if (number == ticket) {
                check = false;
                System.out.println("Вы счастливчик!");
            } else {
                System.out.println("Попробуйте свою удачу ещё раз!");
            }
        }
    }

    public void ChristmasTree() {
        for (int first = 0; first < 10; first++) {
            for (int second = 0; second < first; second++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void WrongChristmasTree() {
        for (int first = 10; first > 0; first--) {
            for (int second = 0; second < first; second++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public int calculateFactorial(int number) {
       // Scanner scanner = new Scanner(System.in);
      //  System.out.println("Введите число для которого посчитать факториал: ");
       // int number = scanner.nextInt();
        if (number == 1) {
            return 1;
        } else {
            return number * (calculateFactorial(number - 1));

        }

    }
    public void time() {

        String phrase;
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date());
        int time = calendar.get(Calendar.HOUR_OF_DAY);

        if ((time >= 22 && time <= 24) || (time >= 0 && time <= 3)) {
            phrase = "night";
        } else if (time >= 4 && time <= 11) {
            phrase = "morning";
        } else if (time >=12 && time <= 18) {
            phrase = "afternoon";
        } else if (time >= 19 && time <= 21 ){
            phrase = "evening";
        } else phrase = "Введите соответствующее число.";
        System.out.println(phrase);
    }

    public void numbersBetweenNumbers() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number");
        int firstNumber = scanner.nextInt();
        int firstNumber2 = firstNumber;
        int lastNumber = scanner.nextInt();
        int lastNumber2 = lastNumber;
        System.out.println("Все нечетные числа в промежутке между " + firstNumber+ " и "+lastNumber);
        if((firstNumber%2)==0){
            if ((lastNumber%2)==0){
                lastNumber--;
            }
            firstNumber++;
            while (firstNumber<=lastNumber){
                System.out.println(firstNumber);
                firstNumber = firstNumber + 2;
            }
        }
        else{
            if((firstNumber%1)==0){
                if ((lastNumber%2)==0){
                    lastNumber--;
                }

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
    public void multiplicationTable() {
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
    private double[] getAllVariables(final int numbersLimit) {
        double[] result = new double[numbersLimit];

        final int limit = (int) Math.sqrt(numbersLimit);

        for (int firstIndex = 1; firstIndex <= limit; firstIndex++) {
            if (numbersLimit % firstIndex == 0) {
                if (numbersLimit / firstIndex != firstIndex) {
                    result[firstIndex] = numbersLimit / (double) firstIndex;
                }
                result[firstIndex] = firstIndex;
            }
        }

        return result;

    }

    public String findRootsByViet(final int indexA, final int indexB, final int indexC) {

        int firstResult = indexB / indexA;
        int secondResult = indexC / indexA;
        int sign1 = 1;
        int sign2 = 1;

        if (secondResult < 0) {
            sign1 = -1;
        } else if ((secondResult > 0) && (firstResult > 0)) {
            sign1 = -1;
            sign2 = -1;
        }

        secondResult = Math.abs(secondResult);

        double[] results = getAllVariables(secondResult);

        int length = 0;
        double x1;
        double x2;
        while (length < results.length) {
            double variable = results[length];
            x1 = variable * sign1;
            x2 = secondResult / variable * sign2;
            if (x1 + x2 == -firstResult) {
                return "x1 = " + x1 + " x2 = " + x2;
            }
            length++;
        }

        return "No results";
    }
    public void findRoots() {
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
