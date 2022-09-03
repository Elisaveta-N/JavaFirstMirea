import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int [] array = new int[10];
        double [] arr = new double [10];
        for (int i = 0; i < 10; i++)
            array[i] = i;
        sumfor(array);
        sumwhile(array);
        sumdowhile(array);
        printarg(args);
        harmonicrow();
        randomnum(arr);
        randomnum2(array);

        Scanner in = new Scanner(System.in);
        System.out.print("Input a number: ");
        int a = in.nextInt();
        factorial (a);
    }

    public static void sumfor(int[] num) {
        int sum = 0;
        for (int j : num) sum += j;
        System.out.print ("The sum of the array is ");
        System.out.println(sum);
    }

    public static void sumwhile(int[] num)
    {
        int sum = 0, i = 0;
       while (i < num.length) {
           sum += num[i];
           i++;
       }
        System.out.print ("The sum of the array is ");
        System.out.println(sum);
    }

    public static void sumdowhile(int[] num)
    {
        int sum = 0, i = 0;
       do {
            sum += num[i];
            i++;
        }
        while (i < num.length);
        System.out.print ("The sum of the array is ");
        System.out.println(sum);
    }

    public static void printarg(String[] args)
    {
        System.out.println ("The arguments are ");
        for (String i : args)
            System.out.println(i);
    }

    public static void harmonicrow()
    {
        System.out.println ("First 10 members of harmonic row:");
        for (int i = 1; i < 11; i ++)
        {
            String str = String.format("%.3f", 1./i);
            System.out.println(str);
        }
    }

    public static void randomnum(double [] arr)
    {
        System.out.println ("10 randomly generated numbers:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Math.random();
            String str = String.format("%.3f", arr[i]);
            System.out.println(str);
        }
        System.out.println ("Same but sorted:");
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            String str = String.format("%.3f", arr[i]);
            System.out.println(str);
        }
    }


    public static void randomnum2(int [] num)
    {
        System.out.println ("Another 10 randomly generated numbers:");
        Random rand = new Random();
        for (int i = 0; i < num.length; i++) {
            num[i] = rand.nextInt(100);
            System.out.println(num[i]);
        }
        System.out.println ("Same but sorted:");
        Arrays.sort(num);
        for (int i = 0; i < num.length; i++) {
            System.out.println(num[i]);
        }
    }

    public static void factorial (int a)
    {
        int k = a, fact = 1;
        while (k > 1)
        {
            fact *= k;
            k--;
        }
        System.out.print("The factorial of your number is ");
        System.out.println(fact);
    }
}
