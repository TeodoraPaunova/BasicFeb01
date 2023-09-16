package Switch;

import java.util.Scanner;

public class WorkingHours {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int workHours = Integer.parseInt(scanner.nextLine());
        String day = scanner.nextLine();


        switch(day) {
            case "Monday":
            case"Tuesday":
            case"Wednesday":
            case"Thursday":
            case"Friday":
            case"Saturday":
                if(workHours >=10 && workHours<=18) {
                    System.out.print("open");
                    break;
                }
            default:
                System.out.println("closed");

        }
    }
}

