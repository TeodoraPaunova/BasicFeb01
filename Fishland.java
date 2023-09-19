package MoreExercise;

import  java.util.Scanner;

public class Fishland {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double skumriaPriceKG = Double.parseDouble(scanner.nextLine());
        double cacaPriceKg = Double.parseDouble(scanner.nextLine());
        double palamudPriceKg = Double.parseDouble(scanner.nextLine());
        double safridPriceKg = Double.parseDouble(scanner.nextLine());
        double midiPriceKg = Double.parseDouble(scanner.nextLine()) ;

        double totalpalamudKgPrice = skumriaPriceKG + skumriaPriceKG * 0.60;
        double totalPricePalamud = palamudPriceKg * totalpalamudKgPrice;

        double totalSafridKgPrice = cacaPriceKg + cacaPriceKg * 0.80;
        double totalPriceSafrid = safridPriceKg * totalSafridKgPrice;

        double totalPriceMidi = midiPriceKg * 7.50;

        double totalSum = totalPricePalamud + totalPriceSafrid + totalPriceMidi;

        System.out.printf("%.2f", totalSum);

    }
}
