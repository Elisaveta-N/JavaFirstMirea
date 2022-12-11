package task14;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressions {
    static int MAX_VALID_YR = 9999;
    static int MIN_VALID_YR = 1900;

    static boolean isLeap(int year)
    {
        return (((year % 4 == 0) &&
                (year % 100 != 0)) ||
                (year % 400 == 0));
    }
    static boolean isValidDate(int d, int m, int y)
    {
        // If year, month and day are not in given range
        if (y > MAX_VALID_YR || y < MIN_VALID_YR)
            return false;
        if (m < 1 || m > 12)
            return false;
        if (d < 1 || d > 31)
            return false;

        // Handle February month with leap year
        if (m == 2)
        {
            if (isLeap(y)) return (d <= 29);
            else return (d <= 28);
        }

        // Months of April, June, Sept and Nov must have number of days less than or equal to 30.
        if (m == 4 || m == 6 || m == 9 || m == 11)
            return (d <= 30);

        return true;
    }

    static boolean DoesItMatch(String str)
    {
        Pattern p1 = Pattern.compile("abcdefghijklmnopqrstuv18340");
        return p1.matcher(str).matches();
    }

    static String GetPriceFromString(String str)
    {
        String regex = "([0-9]+[.?][0-9]{0,2}+) (EU|RUB|USD)";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(str);
        StringBuilder res = new StringBuilder();
        while(matcher.find())
            res.append(matcher.group(1)).append(" ");
        return res.toString();
    }

    static boolean isExpressionValid(String str)
    {
        String regex = "[0-9]+ \\+";
        Pattern pattern = Pattern.compile(regex);
        Matcher m = pattern.matcher(str);

        return m.find();
    }

    static boolean isDateStringValid(String str)
    {
        boolean res = false;
        String regex = "([0-9]{2})/([0-9]{2})/([0-9]{4})";
        Pattern pattern = Pattern.compile(regex);
        Matcher m = pattern.matcher(str);

        if(m.find())
        {
            res = isValidDate(Integer.parseInt(m.group(1)), Integer.parseInt(m.group(2)), Integer.parseInt(m.group(3)));
        }

        return res;
    }

    static boolean isEmailValid(String str)
    {
        String regex = "[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?";
        Pattern pattern = Pattern.compile(regex);
        Matcher m = pattern.matcher(str);

        return m.find();
    }

    static boolean isPasswordReliable(String str)
    {
        String regex = "(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])^([a-zA-Z0-9_]+){8,}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher m = pattern.matcher(str);

        return m.find();
    }


    public static void main(String[] args) {
        System.out.println("abcdefghijklmnopqrstuv18340: " + DoesItMatch("abcdefghijklmnopqrstuv18340"));
        System.out.println("abcdefghijklmnoasdfasdpqrstuv18340: " + DoesItMatch("abcdefghijklmnoasdfasdpqrstuv18340"));

        System.out.println("Correct price: " + GetPriceFromString("44 ERR, 0.004 EU 25.98 USD 15.125 RUB 25.15 EU"));
        System.out.println("Correct price: " + GetPriceFromString("16515 ERR"));

        System.out.println("\"(1 + 8) – 9 / 4\" Expression Valid: " + isExpressionValid("(1 + 8) – 9 / 4"));
        System.out.println("\"6 / 5 – 2 * 9\" Expression Valid: " + isExpressionValid("6 / 5 – 2 * 9"));

        System.out.println("\"29/02/2000\" Expression Valid: " + isDateStringValid("29/02/2000"));
        System.out.println("\"29/02/2001\" Expression Valid: " + isDateStringValid("29/02/2001"));

        System.out.println("\"user@example.com\" E-mail Valid: " + isEmailValid("user@example.com"));
        System.out.println("\"myhost@@@com.ru\" E-mail Valid: " + isEmailValid("myhost@@@com.ru"));

        System.out.println("\"F032_Password\" Password OK: " + isPasswordReliable("F032_Password"));
        System.out.println("\"smart_pass\" Password OK: " + isPasswordReliable("smart_pass"));

    }
}
