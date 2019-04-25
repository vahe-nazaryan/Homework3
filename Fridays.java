package Homework3;
import java.time.*;
import java.time.temporal.TemporalAdjusters;
public class Fridays {

    // This program gets the dates next and previous Friday
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        System.out.println("\nNext Friday: "+date.with(TemporalAdjusters.next(DayOfWeek.FRIDAY)));
        System.out.println("Previous Friday: "+date.with(TemporalAdjusters.previous(DayOfWeek.FRIDAY))+"\n");
    }


}
