package Homework3;
import java.time.LocalDate;
import java.util.Scanner;

// This program checks whether given year is leap or not

public class LeapYear {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a year:");
        int year = scan.nextInt();
        LocalDate date = LocalDate.of(year, 1, 1);

        if(date.isLeapYear())
            System.out.println(year + " is a leap year");
        else
            System.out.println(year + " is not a leap year");

    }
}
