package MoreExercise;

import java.util.Scanner;

public class VegetableMarket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double vegetableKgPrice = Double.parseDouble(scanner.nextLine());
        double fruitKgPrice = Double.parseDouble(scanner.nextLine());
        double totalVegKg =Double.parseDouble(scanner.nextLine());
        double totalFruitKg =Double.parseDouble(scanner.nextLine());

        double vegPrice = vegetableKgPrice * totalVegKg;
        double fruitPrice = fruitKgPrice * totalFruitKg;

        double totalSum = vegPrice + fruitPrice;
        double totalSumInEvro = totalSum / 1.94;

        System.out.printf("%.2f",totalSumInEvro);
    }
}
