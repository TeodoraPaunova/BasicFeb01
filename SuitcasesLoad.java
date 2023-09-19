package MoreExerciseExamss;

import java.util.Scanner;
public class SuitcasesLoad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int volume = Integer.parseInt(scanner.nextLine());

        int suitcaseVolume = Integer.parseInt(scanner.nextLine());

        String command = scanner.nextLine();
        int cases = Integer.parseInt(command);
        boolean noMoreSpace = false;

        while (!command.equals("End")) {
            volume = volume - cases;

            if (volume <=0){
                noMoreSpace = true;
                break;
            }
            command = scanner.nextLine();

        }
        if(noMoreSpace){
            System.out.println("No more space!");
            System.out.printf("Statistic: %d suitcases loaded.",volume = volume - cases);

        }else {
            System.out.println("Congratulations! All suitcases are loaded!");
            System.out.printf("Statistic: %d suitcases loaded.", volume = volume - cases);
        }


    }
}
