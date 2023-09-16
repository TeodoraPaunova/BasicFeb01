package SwitchExercise;

import java.util.Scanner;

public class Cinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String project = scanner.nextLine();
        int rows = Integer.parseInt(scanner.nextLine());
        int columbs = Integer.parseInt(scanner.nextLine());
        double income = 0.0;

        switch (project) {
            case "Premiere":
                income = rows * columbs * 12.00;

                break;
            case "Normal":
                income = rows * columbs * 7.50;

                break;
            case "Discount":
                income = rows * columbs * 5.00;

                break;
        }
            System.out.printf("%.2f leva", income);

        }

    }

