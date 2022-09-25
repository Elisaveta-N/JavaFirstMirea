package Task9.TestStudent;

import java.text.DecimalFormat;
import java.util.Random;

public class TestStudent {


    public static void main(String[] args) {
        Student[] stud = new Student[10];
        Random rand = new Random();
        DecimalFormat dF = new DecimalFormat("#.##");
        for (int i = 0; i < 10; i++)
        {
            stud[i] = new Student(rand.nextInt(10000), rand.nextDouble(4.0));
            System.out.println(stud[i].iDNumber + " " + dF.format(stud[i].gPA));
        }
        stud[0].insertionSort(stud);
    }


}
