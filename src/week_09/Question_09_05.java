package assignments.week_09;

import org.w3c.dom.ls.LSOutput;

import java.util.GregorianCalendar;

public class Question_09_05 {
    public static void main(String[] args) {


        GregorianCalendar currentDate = new GregorianCalendar();
        int currentYear = currentDate.get(GregorianCalendar.YEAR);
        int currentMonth = currentDate.get(GregorianCalendar.MONTH);

        int currentDay = currentDate.get(GregorianCalendar.DAY_OF_MONTH);
        System.out.println("Current year: " +currentYear );
        System.out.println("Current month: " + currentMonth);
        System.out.println("Current day: " + currentDay);
        GregorianCalendar specifiedDate = new GregorianCalendar();
        specifiedDate.setTimeInMillis(1234567898765L);
        int specifiedYear = specifiedDate.get(GregorianCalendar.YEAR);
        int specifiedMonth = specifiedDate.get(GregorianCalendar.MONTH);
        int specifiedDay = specifiedDate.get(GregorianCalendar.DAY_OF_MONTH);

        System.out.println("\nAfter setTime:");
        System.out.println("Current year: " +specifiedYear );
        System.out.println("Current month: " + specifiedMonth);
        System.out.println("Current day: " + specifiedDay);
    }
}
