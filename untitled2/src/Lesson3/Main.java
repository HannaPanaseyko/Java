package Lesson3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number");
        int number = scanner.nextInt();
     //   System.out.println("your month is:" + getMonthByNumber(monthNumber));

        int[] arr = new int[number];
      //  System.out.println("size of entered array is" + arr.length );

     //   for(int numberOfCircle = 0; numberOfCircle < arr.length; numberOfCircle++){
     //       arr[numberOfCircle] = numberOfCircle * 2;
     //       System.out.println(arr[numberOfCircle]);
     //   }
     //   for(int numberOfCircle = 10; numberOfCircle >= 0; numberOfCircle--){
    //        System.out.println(numberOfCircle);
     //   }
        int numberSecond = number;
        while (number>5){
            System.out.println("number is biger than 5");
            number--;
        }

        do{
            System.out.println("number is not 0");
            number--;
        } while (number > 0);


        int number2 = scanner.nextInt();

        System.out.println("factorial of number" + number2 + "is" + getFactorial(number2));

    }
    public static String getMonthByNumber(int number){
        String result = "";
        switch (number) {
            case 1 : {
                result = "January";
                break;
            }case 2 : {
                result = "February";
            }case 3 : {
                result = "March";
                break;
            }case 4 : {
                result = "April";
                break;
            }case 5 : {
                result = "May";
                break;
            }case 6 : {
                result = "June";
                break;
            }case 7 : {
                result = "July";
                break;
            }case 8 : {
                result = "August";
                break;
            }case 9 : {
                result = "September";
                break;
            }case 10 : {
                result = "October";
                break;
            }case 11 : {
                result = "November";
                break;
            }case 12 : {
                result = "December";
                break;
            }
            default:{
                result = "no month exists";
            }
        }
        return result;

    }
 //*   public static void main(String[] args) {
      //  int firstA = 10;
        //int secondA = 15;
       //String result = ternar(250,5) ? "true":"false";

     //   if(firstA>secondA) result = "true";
     //   System.out.println(result);

     //   String result1 = "";
      //  if(ternar(250, 5)){
       //     result1 = "true";
       // } else {
          //  result1 = "false";
     //   }
      //  System.out.println(result1);
 //   }
 //   public static void ifElse(int first, int second){
     //   if ( first == second){
    //*        System.out.println("first is equal than second");
       // } else  if (first > second) {
       //     System.out.println("first is bigger than second");
      //  } else if (first < second){
      //      System.out.println("first is not bigger than second");
      //  } else  if (first >= second) {
      //  System.out.println("first is bigger or equal than second");
  //  } else if (first <= second){
      //  System.out.println("first is not bigger or equal than second");
 //   } }
//public static boolean ternar(int first, int second){

  //      return first>second;

//}

    public static int getFactorial(int num){
        int result = 1;
        while (num>0){
            result = num * result;
            num--;
        }
        return result;
    }
}
