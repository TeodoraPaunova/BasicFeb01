package MoreExerciseExamss;

import java.util.Scanner;
public class ChangeBureau {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double bitcoin = Double.parseDouble(scanner.nextLine());
        double una = Double.parseDouble(scanner.nextLine());
        double comision = Double.parseDouble(scanner.nextLine());

        comision = comision * 0.01;

        double allInEvro =(una * 0.15 * 1.76 + bitcoin * 1168) / 1.95;

        double charge = allInEvro * comision;
        double totalSumInEvro = allInEvro - charge;


        System.out.printf("%.2f",totalSumInEvro);
    }
}
