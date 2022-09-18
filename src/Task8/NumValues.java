package Task8;
//задание 8.16
import java.util.Scanner;

public class NumValues {
    public static void main(String[] args) {
        System.out.println("Enter your numbers: ");
        rec(0, 0);
    }
    public static void rec(int max, int count)
    {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if (number == 0)
        {
            System.out.println("The number of maxes is: " + count);
            return;
        }

        if (number > max)
        {
            max = number;
            count = 1;
        }
        else if (number == max)
            count++;
        rec(max, count);
    }
}
