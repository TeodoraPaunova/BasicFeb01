package MoreExercise;

import java.util.Scanner;

public class Harvest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int vineYear = Integer.parseInt(scanner.nextLine());
        double grapes = Double.parseDouble(scanner.nextLine());
        int litters = Integer.parseInt(scanner.nextLine());
        int workers = Integer.parseInt(scanner.nextLine());

        double harvest = (vineYear * 0.4) * grapes;
        double wine = harvest / 2.5;
        double littersLeft = Math.abs(wine - litters);
        double litterPerWorker = littersLeft / workers;

        if (wine < litters) {
            System.out.printf("It will be a tough winter! More %.0f liters wine needed.", Math.floor(littersLeft));

        } else if (wine >= litters) {
            System.out.printf("Good harvest this year! Total wine: %.0f liters.", Math.floor(wine));
            System.out.println();
            System.out.printf("%s liters left -> %s liters per person.", Math.round(littersLeft), Math.round(litterPerWorker));

        }
    }
}
