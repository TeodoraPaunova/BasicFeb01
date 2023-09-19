package MoreExercise;

import java.util.Scanner;
public class TrainingLab {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double w = Double.parseDouble(scanner.nextLine());
        double h = Double.parseDouble(scanner.nextLine());

        double numberOfDeskInRow = Math.floor((h * 100 - 100) / 70);
        double numberRows = Math.floor((w * 100) / 120);

        double numberDeskInLab = numberOfDeskInRow * numberRows - 3;

        System.out.println(numberDeskInLab);
    }
}
