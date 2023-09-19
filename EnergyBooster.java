package MoreExerciseExamss;

import java.util.Scanner;
public class EnergyBooster {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String fruit = scanner.nextLine();
        String setSmallBig = scanner.nextLine();
        double quantity = Double.parseDouble(scanner.nextLine());
        double price =0.0;

        double sizesSet = 0;


        switch (setSmallBig) {
            case "small":

                switch (fruit) {
                    case "Watermelon":
                      price = 56;
                        sizesSet = 2;
                      break;

                    case "Mango":
                        price = 36.66;
                        sizesSet = 2;
                        break;

                    case "Pineapple":
                        price = 42.10;
                        sizesSet = 2;
                        break;

                    case "Raspberry":
                        price = 20 ;
                        sizesSet = 2;
                        break;
                }
                break;
            case "big":
                switch (fruit) {
                    case "Watermelon":
                        price = 28.70;
                        sizesSet = 5;
                        break;
                    case "Mango":
                        price = 19.60;
                        sizesSet = 5;
                        break;
                    case "Pineapple":
                        price = 24.80 ;
                        sizesSet = 5;
                        break;
                    case "Raspberry":
                        price = 15.20;
                        sizesSet = 5;
                        break;
                }
                break;

        }
        double setSum = price * sizesSet;
        double totalSum = setSum * quantity ;




        if (totalSum >= 400 && totalSum <= 1000) {
            totalSum = totalSum - (totalSum * 0.15);
            System.out.printf("%.2f lv.", totalSum);

        }else if ( totalSum > 1000) {
            totalSum = totalSum - (totalSum * 0.5);
            System.out.printf("%.2f lv.", totalSum);
        }else {
            System.out.printf("%.2f lv.", totalSum);

        }

    }
}
