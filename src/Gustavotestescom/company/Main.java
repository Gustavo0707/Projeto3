package Gustavotestescom.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
       Scanner read = new Scanner(System.in);
      float number1, number2, number3, number4;
      float average;

        System.out.println("type the first average");
        number1 = read.nextFloat();

        System.out.println("type the second average");
        number2 = read.nextFloat();

        System.out.println("type the third average");
        number3 = read.nextFloat();

        System.out.println("type the fourth average");
        number4 = read.nextFloat();

        average = (number1 + number2 + number3 + number4)/4;

        System.out.println("Your average is  " + average);
    }
}
