package ConditionalStatementMoreExercises;

import java.util.Scanner;

public class MatchTickets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        double Vip = 499.99;
        double Normal = 249.99;
        int people = Integer.parseInt(scanner.nextLine());

        double transportPrice = 0;

        if(people >= 1 && people <=4) {
            transportPrice = budget * 0.75;
        } else if (people >= 5 && people <=9) {
            transportPrice = budget * 0.60;
        } else if (people >= 10 && people <= 24) {
            transportPrice = budget * 0.50;
        } else if (people >= 25 && people <= 49) {
            transportPrice = budget * 0.40;
        }else {
            transportPrice = budget * 0.25;
        }



    }
}
