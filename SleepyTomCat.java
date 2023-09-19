package MoreExercise;

import java.util.Scanner;
public class SleepyTomCat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       int yearsDays = 365;
       int gamesInMin = 30000;
       int minGameInWorkingDay = 63;
       int minGameInDaysOff = 127;

        int daysOff = Integer.parseInt(scanner.nextLine());
        int workingDasys = yearsDays - daysOff;
        int realGamesInMin = workingDasys * minGameInWorkingDay + daysOff * minGameInDaysOff;

        if (gamesInMin >= realGamesInMin) {
            System.out.println("Tom sleeps well");
            System.out.println((gamesInMin - realGamesInMin) / 60 + " hours and " + (gamesInMin - realGamesInMin) % 60 +" minutes less for play");
        } else {
            System.out.println("Tom will run away");
            System.out.printf((realGamesInMin - gamesInMin) / 60 + " hours and " + (gamesInMin + realGamesInMin) % 60 + " minutes more for play");
        }
    }
}
