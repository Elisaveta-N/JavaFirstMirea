package task11;

import java.util.Calendar;

import java.util.GregorianCalendar;
import java.util.Scanner;



public class InputToDate {

    static String output(Calendar cal)
    {
        return String.format("%d.%d.%d %d:%d", cal.get(Calendar.DAY_OF_MONTH), cal.get(Calendar.MONTH) + 1,
                cal.get(Calendar.YEAR), cal.get(Calendar.HOUR), cal.get(Calendar.MINUTE));
    }

    public static void main(String[] args) {
        System.out.println("Enter year, month, day, hours, minutes: ");
        Scanner sc = new Scanner(System.in);
        Calendar calendar = new GregorianCalendar();
        int year = sc.nextInt();
        int month = sc.nextInt();
        int day = sc.nextInt();
        int hour = sc.nextInt();
        int minute = sc.nextInt();
        calendar.set(year, month - 1, day, hour, minute);
        System.out.println(output(calendar));
    }

}
