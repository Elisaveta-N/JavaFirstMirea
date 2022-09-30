package task9.sortingStudentsByGPA;

import java.text.DecimalFormat;
import java.util.Random;

public class SortingStudentsByGPA {
    Student student;
    public static void quickSort(Student[]students, int left, int right)
    {
        int leftMarker = left;
        int rightMarker = right;
        Student pivot = students[(leftMarker+rightMarker)/2];
        do {
            while (students[leftMarker].compareTo(pivot) < 0)
                leftMarker++;

            while (students[rightMarker].compareTo(pivot) > 0)
                rightMarker--;

            if (leftMarker <= rightMarker)
            {
                if (leftMarker < rightMarker)
                {
                    Student tmp = students[leftMarker];
                    students[leftMarker] = students[rightMarker];
                    students[rightMarker] = tmp;
                }
                leftMarker++;
                rightMarker--;
            }
        } while (leftMarker <= rightMarker);
        if (leftMarker < right)
            quickSort(students,leftMarker, right);
        if (left < rightMarker)
            quickSort(students, left, rightMarker);
    }

    public static void main(String[] args) {
        Student[] stud = new Student[10];
        Random rand = new Random();
        DecimalFormat dF = new DecimalFormat("#.##");
        for (int i = 0; i < 10; i++)
        {
            stud[i] = new Student(rand.nextInt(10000), rand.nextDouble(4.0));
            System.out.println(stud[i].iDNumber + " " + dF.format(stud[i].gPA));
        }
        quickSort(stud, 0, stud.length-1);
        System.out.println("Sorted array of students:");
        for (int i = 0; i < 10; i++)
        {
            System.out.println(stud[i].iDNumber + " " + dF.format(stud[i].gPA));
        }
    }
}
