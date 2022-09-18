package Task8;

import java.util.Scanner;

public class TriangleSeq {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число: ");

        int number = sc.nextInt();
        rec(0, number, 0);
    }
    public static void rec(int cur, int num, int sum)
    {
        for (int i = 0; i < cur; i++)
        {
            if (sum == num)
                break;
            System.out.println(cur);
            sum++;

        }
        if (sum < num)
            rec(cur+1, num, sum);
    }
}
