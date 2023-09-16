package WhileLoopLap;

import java.util.Scanner;
public class Password02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String userName = scanner.nextLine();
        String password = scanner.nextLine();
        String inputPass = scanner.nextLine();

        while (!password.equals(inputPass)) {
            inputPass = scanner.nextLine();
        }
        System.out.printf("Welcome %s!",userName);
    }
}
