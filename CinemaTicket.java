package Switch;

import java.util.Scanner;

public class CinemaTicket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String dayWeek = scanner.nextLine();
        if (dayWeek.equals("Monday") || dayWeek.equals("Tuesday") || dayWeek.equals("Friday")) {
            System.out.println(12);

        }else if (dayWeek.equals("Wednesday") || dayWeek.equals("Thursday")) {
            System.out.println(14);

        }else if (dayWeek.equals("Saturday") || dayWeek.equals("Sunday")) {
            System.out.println(16);
        }

    }
}
