package MoreExercise;

import java.util.Scanner;

public class PipesInPool {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int v = Integer.parseInt(scanner.nextLine());
        int p1 = Integer.parseInt(scanner.nextLine());
        int p2 = Integer.parseInt(scanner.nextLine());
        double h = Double.parseDouble(scanner.nextLine());

        double debitp1 = p1 * h;
        double debitp2 = p2 * h;
        double allDebit = debitp1 + debitp2;

        double totalAllInPercentige = ( allDebit / v ) * 100;
        double debitP1InPercent = ( debitp1 / allDebit ) * 100;
        double debitP2InPercent = (debitp2 / allDebit ) * 100;

        char percent = '%';
        double overflows = totalAllInPercentige - v;
        double hours = h;

        if (totalAllInPercentige <= v) {
            System.out.printf("The pool is %.2f %c full. Pile 1: %.2f %c. Pile 2: %.2f %c.", totalAllInPercentige, percent, debitP1InPercent, percent,debitP2InPercent,percent);
        }else {
            System.out.printf("For %.2f hours the pool overflows with %.2f liters.", hours, overflows);
        }
    }
}
