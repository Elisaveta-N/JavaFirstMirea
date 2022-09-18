package Task8;

import java.util.Scanner;
//задание 8.2
public class Sequance {
    public static void main(String[] args) {
        System.out.println("Enter your number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        rec(n, 1);
    }
    public static void rec(int num, int cur)
    {
        if ( num < cur)
            return;
        else
        {
            System.out.println(cur);
            rec(num, cur+1);
        }
    }
}
