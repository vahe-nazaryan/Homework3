package Homework3;

import java.time.LocalDate;
import java.util.Scanner;

public class BirthDay {

        public static void main(String[] args) {

            // This program asks user's age and types the year of birth

            LocalDate localDate = LocalDate.now();
            System.out.println("Local date is: " + localDate);

            Scanner input = new Scanner(System.in);
            System.out.println("Please enter your age");
            int age = input.nextInt();

            System.out.println("You were born in " + (localDate.minusYears(age + 1)).getYear());

        }
    }

