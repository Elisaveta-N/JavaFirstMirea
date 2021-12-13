public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int [] array = new int[10];
        for (int i = 0; i < 10; i++)
            array[i] = i;
        sumfor(array);
        sumwhile(array);
        sumdowhile(array);
        printarg(args);
        harmonicrow();
    }
    public static void sumfor(int[] num)
    {
        int sum = 0;
        for (int j : num) sum += j;
        System.out.println(sum);
    }

    public static void sumwhile(int[] num)
    {
        int sum = 0, i = 0;
       while (i < num.length) {
           sum += num[i];
           i++;
       }
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
            System.out.println(sum);
    }

    public static void printarg(String[] args)
    {
        for (String i : args)
            System.out.println(i);
    }

    public static void harmonicrow()
    {
        for (int i = 1; i < 11; i ++)
        {
            String str = String.format("%.3f", 1./i);
            System.out.println(str);
        }
    }
}
