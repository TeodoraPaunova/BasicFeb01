package MoreExerciseExamss;

import java.util.Scanner;

public class MountainRun {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double target = Double.parseDouble(scanner.nextLine());
        double distance = Double.parseDouble(scanner.nextLine());
        double timeInSec = Double.parseDouble(scanner.nextLine());

        double result = distance * timeInSec;
        double slowDown = Math.floor(distance / 50);
        double resistance = slowDown * 30;
        double finalResult = result + resistance;

        if(finalResult < target) {
            System.out.printf("Yes! The new record is %.2f seconds.", finalResult);

        }else {
            System.out.printf("No! He was %.2f seconds slower.", Math.abs(target - finalResult));
        }
    }
}
