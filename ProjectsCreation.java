package FirststepsInCoding;

import java.util.Scanner;
public class ProjectsCreation {
    // name of architect
    // how many project need to make( 0....100)
    // "The architect name will need ... hours to complete ...projects."
    //Architect name - George
    // 1 project is take 3 hours
    // for 4 projects
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int a = 3;
        int b = Integer.parseInt(scanner.nextLine());
        int hours = a * b;
        System.out.println("The architect " +  name + " will need " + hours + " hours to complete " + b + " project/s.");



    }


}
