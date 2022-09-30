package task11;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class CompareDates {
    public static void main(String[] args) {
        String s;
        SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
        Scanner sc = new Scanner(System.in);
        s = sc.nextLine();
        try {
            Date date = sdf.parse(s);
            Date now = new Date();
            if (date.compareTo(now) < 0)
                System.out.println("Your date is earlier");
            else if (date.compareTo(now) > 0)
                System.out.println("Your date is later");
            else
                System.out.println("Dates are equal");
        }
        catch (ParseException ex) {
            ex.printStackTrace();
        }
    }
}
