package Switch;

import java.util.Scanner;

public class FruitShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String product = scanner.nextLine();
        String day = scanner.nextLine();
        double quantity = Double.parseDouble(scanner.nextLine());
        double price = 0.00;

        boolean dayIsValid = day.equals("Monday") || day.equals("Tuesday") || day.equals("Wednesday") || day.equals("Thursday") || day.equals("Friday");
        boolean weekendIsValid = day.equals("Saturday") || day.equals("Sunday");
        boolean productIsValid = product.equals("banana") || product.equals("apple") || product.equals("orange") || product.equals("grapefruit") || product.equals("kiwi") || product.equals("pineapple") || product.equals("grapes");
        boolean workingDay= dayIsValid || weekendIsValid;

        if (!workingDay || !productIsValid) {
            System.out.println("error");
        }else {
            switch (product) {
                case "banana":
                    if (dayIsValid) {
                        price = 2.50;
                    } else if (weekendIsValid) {
                        price = 2.70;
                    }
                    break;
                case "apple":
                    if (dayIsValid) {
                        price = 1.20;
                    } else if (weekendIsValid) {
                        price = 1.25;
                    }
                    break;
                case "orange":
                    if (dayIsValid) {
                        price = 0.85;
                    } else if (weekendIsValid) {
                        price = 0.90;
                    }
                    break;
                case "grapefruit":
                    if (dayIsValid) {
                        price = 1.45;
                    } else if (weekendIsValid) {
                        price = 1.60;
                    }
                    break;
                case "kiwi":
                    if (dayIsValid) {
                        price = 2.70;
                    } else if (weekendIsValid) {
                        price = 3.00;
                    }
                    break;
                case "pineapple":
                    if (dayIsValid) {
                        price = 5.50;
                    } else if (weekendIsValid) {
                        price = 5.60;
                    }
                    break;
                case "grapes":
                    if (dayIsValid) {
                        price = 3.85;
                    } else if (weekendIsValid) {
                        price = 4.20;
                    }
                    break;

            }
            System.out.printf("%.2f", price * quantity);

            }

        }
    }




