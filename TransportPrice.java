package MoreExercise;

import java.util.Scanner;

public class TransportPrice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double km = Double.parseDouble(scanner.nextLine());
        String dayNight = scanner.nextLine();
        //double sum = 0.0;

        if (km < 20 ) {

        if (dayNight == "day") {
           double sum = 0.70 + (0.79 * km);
            System.out.println(sum);

        } else if (dayNight == "night") {
             double  sum = 0.70 + (0.90 * km);
            System.out.println(sum);
        }
        if(km >= 20 && km < 100) {

             double sum = 0.09 * km;
            System.out.println(sum);
        }
        if (km >= 100 ) {
            double sum = 0.06 * km;
            System.out.println(sum);
        }
        }
        }
}
