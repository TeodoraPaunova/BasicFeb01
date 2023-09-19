package MoreExercise;

import java.util.Scanner;

public class FuelTank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String fuel = scanner.nextLine();
        double liters = Double.parseDouble(scanner.nextLine());


       switch (fuel) {
           case "Diesel":
           case "Gasoline":
           case "Gas":
               if (liters < 25) {
                   System.out.println("Fill your tank with "+ fuel + "!" );
               } else if ((liters >= 25)) {
                   System.out.printf("You have enough %s!\n", fuel);
               }else {
                   System.out.println("Invalid fuel!");
               }
       }
    }
}


