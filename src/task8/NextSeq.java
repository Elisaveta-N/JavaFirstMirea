package task8;

import java.util.Scanner;

//задание 8.3
public class NextSeq {
    public static void main(String[] args) {
        System.out.println("Enter your number A: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("Enter your number B: ");
        int b = sc.nextInt();
        rec(a, b);
    }
    public static void rec(int a, int b)
    {
        System.out.println(a);
        if (a > b)
            a--;
        else if (a < b)
            a++;
        else
            return;
        rec(a, b);
    }
}
