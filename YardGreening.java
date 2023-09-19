package FirststepsInCoding;

import java.util.Scanner;
public class YardGreening {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double area = Double.parseDouble(scanner.nextLine());
        double result = area * 7.61;
        double discount = result * 0.18;
        double total = result - discount;
        System.out.println("The final prise is: " + total + " lv.");
        System.out.println("The discount is: " + discount + " lv.");
    }
}
