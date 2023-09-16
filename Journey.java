package SwitchExercise;

import java.util.Scanner;

public class Journey {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();

        String destination = "";
        String tapeVacation = "";

        if (budget <= 100) {
            destination = "Bulgaria";
            if(season.equals("summer")) {
                tapeVacation = "Camp";
                budget = budget * 0.30;
            }else if (season.equals("winter")) {
                tapeVacation = "Hotel";
                budget = budget * 0.70;
            }
        } else if (budget > 100 && budget <= 1000) {
            destination = "Balkans";
            if (season.equals("summer")) {
            tapeVacation = "Camp";
            budget = budget * 0.40;
        } else if (season.equals("winter")) {
                tapeVacation = "Hotel";
                budget = budget * 0.80;
            }

            }else if (budget > 1000) {
            destination = "Europe";
            tapeVacation = "Hotel";
            budget = budget * 0.90;
        }
        System.out.printf("Somewhere in %s%n", destination);
        System.out.printf("%s - %.2f", tapeVacation,budget);

        }
}
