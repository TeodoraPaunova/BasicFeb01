package WhileLoopExercise;

import java.util.Scanner;
public class OldBook01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String wantedBook = scanner.nextLine();
        String command = scanner.nextLine();
        boolean theBookIsFound = false;
        int countBooks = 0;

        while (!command.equals("No More Books.")) {
            String currentBook = command;

            if (command.equals(wantedBook)) {
                theBookIsFound = true;
                break;
            }
            countBooks++;
            command = scanner.nextLine();
        }
        if (theBookIsFound) {
            System.out.printf("You checked %d books and found it.", countBooks);
        }else{
            System.out.println("The boom you search is not here!");
            System.out.printf("You checked %d books.", countBooks);
        }
    }
}
