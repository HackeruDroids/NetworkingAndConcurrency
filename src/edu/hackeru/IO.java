package edu.hackeru;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.time.LocalDateTime;
import java.util.Scanner;

public class IO {
    public static Scanner scanner = new Scanner(System.in);


    public static String read(InputStream in) throws IOException {
        //Close the Stream
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(in))){

            String line = null;
            StringBuilder builder = new StringBuilder();

            while ((line = reader.readLine()) != null) {
                builder.append(line);
            }
            return builder.toString();
        }
    }

    private IO() {
    }

    public static int getInt(String message) {
        System.out.println(message);
        return scanner.nextInt();
    }

    public static int getInt(String message, int from, int to) {
        int input;
        do {
            System.out.println(message + " " + from + "-" + to + ":");
            input = scanner.nextInt();
        }
        while (input < from || input > to);

        return input;
    }

    public static String getString(String message) {
        System.out.println(message);
        return scanner.next();
    }

    public static float getFloat(String message) {
        System.out.println(message);
        return scanner.nextFloat();
    }

    public static LocalDateTime getDateTime(String message) {
        System.out.println(message);
        int year = IO.getInt("Enter Year:", 1960, LocalDateTime.now().getYear());
        int month = IO.getInt("Enter Month:", 1, 12);
        int day = IO.getInt("Enter Day:", 1, 31);
        int hour = IO.getInt("Enter Hours:", 0, 23);
        int min = IO.getInt("Enter Minutes:", 0, 59);

        return LocalDateTime.of(year, month, day, hour, min);
    }
}