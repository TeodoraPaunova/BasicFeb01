package MoreExerciseExamss;

import java.util.Scanner;

public class FitnessCard {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double sumHave = Double.parseDouble(scanner.nextLine());
        String gender = scanner.nextLine();
        double age = Double.parseDouble(scanner.nextLine());
        String sport = scanner.nextLine();

        double cardPrice = 0;


    switch(gender){
        case "m":

            switch(sport){
                case "Gym":
                    cardPrice = 42;
                    break;
                case "boxing":
                    cardPrice = 41;
                    break;
                case"Yoga":
                    cardPrice = 45;
                    break;
                case "zumba":
                    cardPrice = 34;
                    break;
                case "dances":
                    cardPrice = 51;
                    break;
                case "Pilates":
                    cardPrice = 39;
                    break;

            }
            break;
        case "f":
            switch (sport) {
                case "Gym":
                    cardPrice = 35;
                    break;
                case "boxing":
                    cardPrice = 37;
                    break;
                case"Yoga":
                    cardPrice = 42;
                    break;
                case "zumba":
                    cardPrice = 31;
                    break;
                case "dances":
                    cardPrice = 53;
                    break;
                case "Pilates":
                    cardPrice = 37;
                    break;

            }
            if(age <= 19){
                cardPrice = cardPrice * 0.80;
            }
    }

    if (sumHave >= cardPrice) {
        System.out.printf("You purchased a 1 month pass for %s.", sport);

    } else {
       double diff = cardPrice - sumHave;
        System.out.printf("You don't have enough money! You need $%.2f more.",diff);
    }

    }
}
