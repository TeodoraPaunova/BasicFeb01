package WhileLoopLap;

import java.util.Scanner;
public class Graduation08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        int goodGradesCount = 0;
        int poorGradesCount = 0;
        int gradeCount = 1;
        double allGradesSum = 0;
        boolean isFailed = false;

        while(goodGradesCount < 12){

            if (poorGradesCount == 2) {
                isFailed = true;
                break;
            }
            double grade = Double.parseDouble(scanner.nextLine());
            if (grade <4) {
                poorGradesCount++;
                continue;
            }
            gradeCount++;
            goodGradesCount++;
            allGradesSum += grade;

        }
        double avarageGrade = allGradesSum / 12;
        if (isFailed) {
            System.out.printf("%s has been excluded at %d grade",name, gradeCount);
        }else {
            System.out.printf("%s graduated. Average grade: %.2f", name,avarageGrade);
        }

    }
}
