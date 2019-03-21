package Lesson2;

public class Main {

    public static final String STRING_OF_CHAR = "HELLO THERE!";

    public static void main(String[] args) {
        float first = 100;
        float second = 50;

        //sum(1, 2);
        //diversity(30, 15);
        // multiply(3, 5);
        // division(12, 6);
      //  System.out.println("sum(first, second) = " + sum(first, second, 30.0f));
       // System.out.println("diversity(first, second) = " + diversity(first, second));
       // System.out.println("multiply(first, second) = " + multiply(first, second));
      //  System.out.println("division(first,second) = " + division(first, second));
        //* public static void sum(int first, int second){
        //        System.out.println(first+second);
        //        System.out.println(sum(52.0f, 30.0f, 30.3f));
        //    }
        //
        //    public static float sum(float first, float second, float third){
        //        return first+second+third;
        //    }
        //
        //    public static void diversity(int first, int second){
        //        System.out.println(first-second);
        //        System.out.println(diversity(10.0f, 15.0f));
        //    }
        //
        //    public static float diversity(float first, float second){
        //        return first-second;
        //    }
        //    public static void multiply(int first, int second){
        //        System.out.println(first*second);
        //        System.out.println(multiply(5.0f, 5.0f));
        //    }
        //
        //    public static float multiply(float first, float second){
        //        return first*second;
        //    }
        //
        //    public static void division(int first, int second){
        //        System.out.println(first/second);
        //        System.out.println(multiply(5.0f, 5.0f));
        //    }
        //
        //    public static float division(float first, float second){
        //        return first/second;
        //    }

        Calculator calculation = new Calculator(first, second);


        calculation.sum();
        System.out.println(calculation.sumReturn());

        calculation.diversity();
        System.out.println(calculation.diversityReturn());

        calculation.multiply();
        System.out.println(calculation.multiplyReturn());

        calculation.division();
        System.out.println(calculation.divisionReturn());

        calculation.krtn();
        System.out.println(calculation.krtnReturn());


        //Задание на дом:

        //метод, который принимает 3 числа
        //вычислить дискриминант
        //программа вычисляет, есть ли у уравнения дискриминант


        }
}
