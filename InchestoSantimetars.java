package FirststepsInCoding;

import java.util.Scanner;

public class InchestoSantimetars {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
      double inches = Double.parseDouble(scanner.nextLine());
      double cantimeters = inches * 2.54;
      System.out.println(cantimeters);
    }
}
