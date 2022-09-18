package Task8;

import java.util.Scanner;

public class MaxValue {
    public static void main(String[] args) {
        System.out.println("Enter your numbers: ");
        rec(0);
    }
    public static void rec(int max)
    {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if (number == 0)
        {
            System.out.println("The max is: " + max);
            return;
        }
        if (number > max)
        {
            max = number;
        }
        rec(max);
    }
}
