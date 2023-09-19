package MoreExercise;

import java.util.Scanner;
public class FlowerShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int magnolia = Integer.parseInt(scanner.nextLine());
        int hyacinths = Integer.parseInt(scanner.nextLine());
        int rose = Integer.parseInt(scanner.nextLine());
        int cactus = Integer.parseInt(scanner.nextLine());
        double pricePresent = Double.parseDouble(scanner.nextLine());

        double magnoliaPrice = magnolia * 3.25;
        double hyacinthsPrice = hyacinths * 4;
        double rosePrice = rose * 3.50;
        double cactusPrise = cactus * 8;

        double totalPrice = magnoliaPrice + hyacinthsPrice + rosePrice + cactusPrise;
        double budget = totalPrice / 5;
        double totalBudget = pricePresent - budget;
        double needMoney = pricePresent - totalBudget;

        if (budget > pricePresent) {
            System.out.printf("She will have to borrow %.0f leva.", needMoney);
        }else {
            System.out.printf("She is left with %.0f leva.", totalBudget);
        }
    }
}
