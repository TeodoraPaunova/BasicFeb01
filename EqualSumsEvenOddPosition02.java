package NestedLoopsExsercise;

import java.util.Scanner;
public class EqualSumsEvenOddPosition02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNum = Integer.parseInt(scanner.nextLine());
        int secondNum = Integer.parseInt(scanner.nextLine());

        for (int i = firstNum; i <= secondNum; i++) {

            String number = "" + i;

            int evenSum = 0;
            int oddSum = 0;

            for (int j = 0; j < number.length(); j++) {
                int digit = Integer.parseInt("" + number.charAt(j));

                if (j % 2 == 0) {
                evenSum += digit;
            } else {
                    oddSum += digit;
                }

            }
            if (evenSum == oddSum) {
                System.out.print(i + " ");
            }
        }
    }
}



