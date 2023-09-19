package MoreExerciseExamss;

import java.util.Scanner;
public class CatWalking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int minWalkingPerDay = Integer.parseInt(scanner.nextLine());
        int walkingNumber = Integer.parseInt(scanner.nextLine());
        int caloriesPerDy = Integer.parseInt(scanner.nextLine());

        int totalWalking = walkingNumber * minWalkingPerDay;
        int caloriesForDay = totalWalking * 5;

        if (caloriesForDay >= (caloriesPerDy * 0.5)) {
            System.out.printf("Yes, the walk for your cat is enough. Burned calories per day: %d.\n", caloriesForDay);

        }else if (caloriesForDay < (caloriesPerDy * 0.5)){
            System.out.printf("No, the walk for your cat is not enough. Burned calories per day: %d.", caloriesForDay);
        }
    }
}
