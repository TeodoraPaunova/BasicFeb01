package NestedLoopsLap;

import java.util.Scanner;
public class Travelling05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String destination = scanner.nextLine();

        while (!destination.equals("End")) {
            double minBuget = Double.parseDouble(scanner.nextLine());
            double myMoney = 0;
            while(myMoney < minBuget) {
                double savedMoney = Double.parseDouble(scanner.nextLine());
                myMoney += savedMoney;
            }
            System.out.printf("Going to %s!\n",destination);
            destination = scanner.nextLine();
        }
    }
}
