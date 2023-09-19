package MoreExercise;

import java.util.Scanner;
public class CelsiusToFahrenheit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double tempCelzi = Double.parseDouble(scanner.nextLine());
     ;

        double tempFarrenhai = (tempCelzi * 1.8) + 32;

        System.out.printf("%.2f", tempFarrenhai);

    }
}
