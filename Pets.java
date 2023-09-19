package MoreExercise;

import java.util.Scanner;
public class Pets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        int leftFoodInKg = Integer.parseInt(scanner.nextLine());
        double foodForDogInKg = Double.parseDouble(scanner.nextLine());
        double foodForCarInKg =Double.parseDouble(scanner.nextLine());
        double foodForTurtleInGram = Double.parseDouble(scanner.nextLine());

        double needFoodForDog = days * foodForDogInKg;
        double needFoodForCat = days * foodForCarInKg;
        double needFoodForTurtle = (days * foodForTurtleInGram) / 1000;

        double totalFood = Math.ceil(needFoodForCat + needFoodForCat + needFoodForTurtle);
        double difference = Math.abs(leftFoodInKg - totalFood);

        if(totalFood <= leftFoodInKg) {
            System.out.println(difference + " kilos of food left." );

        } else {
            System.out.println(difference + " more kilos of food are needed.");

        }
    }
}
