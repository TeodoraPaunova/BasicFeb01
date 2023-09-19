package MoreExercise;

import java.util.Scanner;

public class WeatherForecast {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputWeather = scanner.nextLine();
        String correctWeather = "sunny";


        if (!inputWeather.equals(correctWeather)) {
            System.out.println("It's cold outside!");

        } else {
            System.out.println("It's warm outside!");
        }
    }
}
