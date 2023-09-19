package NestedLoopsExsercise;

import java.util.Scanner;

public class SumPrimeNonPrime03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sumPrimeN = 0;
        int sumNoPrimeN = 0;
        String input = scanner.nextLine();

        while (!input.equals("stop")) {
            int number = Integer.parseInt(input);

            if (number < 0) {
                System.out.println("Number is negative.");
                input = scanner.nextLine();
                continue;
            }

            int count = 0;
            for (int i = 1; i <= number; i++) {
                if (number % i == 0) {
                    count++;
                }
            }
            if (count == 2) {
                sumPrimeN = sumPrimeN + number;
            } else {
                sumNoPrimeN = sumNoPrimeN + number;
            }
            input = scanner.nextLine();
        }
        System.out.printf("Sum of all prime numbers is: %d%n", sumPrimeN);
        System.out.printf("Sum of all non prime numbers is: %d", sumNoPrimeN);
    }
}