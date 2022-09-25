package Task9.MergeSorting;

import java.text.DecimalFormat;
import java.util.Random;

public class Sorting {

    public static void merge(Student[]a1, Student[]a2, Student[]a3)
    {
        int i = 0, j = 0;
        for (int k = 0; k < a3.length; k++) {
            if (i > a1.length-1)
            {
                Student a = a2[j];
                a3[k] = a;
                j++;
            }
            else if (j > a2.length-1)
            {
                Student a = a1[i];
                a3[k] = a;
                i++;
            }
            else if (a1[i].compareTo(a2[j]) < 0) {
                Student a = a1[i];
                a3[k] = a;
                i++;
            }
            else {
                Student a = a2[j];
                a3[k] = a;
                j++;
            }
        }
    }

    public static void main(String[] args) {
        Student[] stud1 = new Student[5];
        Student[] stud2 = new Student[5];
        Student[]students = new Student[10];
        Random rand = new Random();
        DecimalFormat dF = new DecimalFormat("#.##");
        for (int i = 0; i < 5; i++)
        {
            stud1[i] = new Student(rand.nextInt(10000), rand.nextDouble(4.0));
        }
        for (int i = 0; i < 5; i++)
        {
            stud2[i] = new Student(rand.nextInt(10000), rand.nextDouble(4.0));
        }
        stud1[0].insertionSort(stud1);
        stud2[0].insertionSort(stud2);
        System.out.println("First array of students:");
        for (int i = 0; i < 5; i++)
        {
            System.out.println(stud1[i].iDNumber + " " + dF.format(stud1[i].gPA));
        }
        System.out.println("Second array of students:");
        for (int i = 0; i < 5; i++)
        {
            System.out.println(stud2[i].iDNumber + " " + dF.format(stud2[i].gPA));
        }
        merge(stud1, stud2, students);
        System.out.println("Sorted array of students:");
        for (int i = 0; i < students.length; i++)
        {
            System.out.println(students[i].iDNumber + " " + dF.format(students[i].gPA));
        }
    }
}
