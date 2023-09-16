package SwitchExercise;

import java.util.Scanner;

public class NewHouse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String flowersTape =scanner.nextLine();
        int flowersCount = Integer.parseInt(scanner.nextLine());
        int budget = Integer.parseInt(scanner.nextLine());

        double totalPrice = 0;

        switch (flowersTape) {
            case "Roses":
                totalPrice = flowersCount * 5;
                if (flowersCount > 80) {
                    totalPrice = totalPrice * 0.90;
                }
                break;
            case "Dahlias":
                totalPrice = flowersCount * 3.80;
                if (flowersCount > 90) {
                    totalPrice = totalPrice - (totalPrice * 0.15);
                }
                break;
            case "Tulips":
                totalPrice = flowersCount * 2.80;
                if (flowersCount > 80) {
                    totalPrice = totalPrice - (totalPrice * 0.15);
                }
                break;
            case "Narcissus":
                totalPrice = flowersCount * 3;
                if (flowersCount < 120) {
                    totalPrice = totalPrice - (totalPrice * 0.15);
        }
                break;
            case "Gladiolius":
                totalPrice = flowersCount * 2.50;
                if (flowersCount < 80) {
                    totalPrice = totalPrice - (totalPrice * 0.20);
                }
                break;
        }
        if (totalPrice <= budget) {
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", flowersCount, flowersTape, budget - totalPrice);
        } else {
            System.out.printf("Not enough money, you need %.2f leva more.", totalPrice - budget);
        }
    }
}


