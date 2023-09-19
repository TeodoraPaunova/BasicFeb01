package FirststepsInCoding;

import java.util.Scanner;

public class ZooShop {
    // dog food - 0...100
    // 1 pack for dog food = 2.50lv.
    // cat foo - 0...100
    // 1 pack for cat food = 4lv.
    // sum in lv.

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        double b = 2.50;
        double e = a * b;
        double c = Double.parseDouble(scanner.nextLine());
        double d = 4.00;
        double f = c * d;
        double sum = e + f;
        System.out.println(sum);

    }
}
