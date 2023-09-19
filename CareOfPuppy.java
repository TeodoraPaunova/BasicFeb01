package MoreExerciseExamss;

import java.util.Scanner;
public class CareOfPuppy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int kilos = Integer.parseInt(scanner.nextLine());

        int eat = 0;
        String command = scanner.nextLine();

        while (!command.equals("Adopted")) {
            int gram = Integer.parseInt(command);
            eat += gram;

            command = scanner.nextLine();
        }
        if(eat <= kilos * 1000) {
            int diff = kilos * 1000 - eat;
            System.out.printf("Food is enough! Leftovers: %d grams.",diff);

        }else {
            int diff = eat - (kilos * 1000);
            System.out.printf("Food is not enough. You need %d grams more.", diff);
        }
    }
}
