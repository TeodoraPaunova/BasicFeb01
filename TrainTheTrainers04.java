package NestedLoopsExsercise;

import java.util.Scanner;
public class TrainTheTrainers04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int countAllGrades = 0;
        double allGrades = 0;
        String command = scanner.nextLine();

        while (!command.equals("Finish")) {
            String presentation = command;

            double sumCurrentCount = 0;
            for (int i = 1; i <=n; i++) {
                double currentGrade = Double.parseDouble(scanner.nextLine());
                countAllGrades++;
                sumCurrentCount = sumCurrentCount + currentGrade;

            }
            allGrades = allGrades + sumCurrentCount;
            double avgCurrentGrade = sumCurrentCount / n;
            System.out.printf("%s - %.2f.%n", presentation,avgCurrentGrade);

            command = scanner.nextLine();
        }
        double finalGrade = allGrades / countAllGrades;
        System.out.printf("Student's final assessment is %.2f.", finalGrade);
    }
}
