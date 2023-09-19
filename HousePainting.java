package MoreExercise;

import java.util.Scanner;

public class HousePainting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //. Разхода на зелената боя е 1 литър за 3.4 м2
        // червената – 1 литър за 4.3 м2.

        double x = Double.parseDouble(scanner.nextLine());
        double y = Double.parseDouble(scanner.nextLine());
        double h = Double.parseDouble(scanner.nextLine());

        if (x >= 2 && x <= 100 && y >= 2 && y <= 100 && h >= 2 && h <= 100){
            double wallArea = ((x * x - 1.2 * 2) + x * x + 2*(x * y - 1.5 * 1.5));
            double roofArea = 2 * x * y + 2 * x * h / 2;
            double green = wallArea / 3.4;
            double red = roofArea / 4.3;



            System.out.printf("%.2f\n", green);
            System.out.printf("%.2f", red);
        }else {
            System.out.println("error");
        }

    }
}
