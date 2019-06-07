package Lesson2;

public class Main {

    public static final String STRING_OF_CHAR = "HELLO THERE!";

    public static void main(String[] args) {
        float first = 100;
        float second = 50;

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
        }
}
