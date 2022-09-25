package Task9.TestStudent;

import java.text.DecimalFormat;

public class Student {
    int iDNumber;
    double gPA;
    public Student(int iDNumber, double gPA)
    {
        this.gPA= gPA;
        this.iDNumber = iDNumber;
    }
    public static void insertionSort(Student [] stud)
    {
        System.out.println("Sorted array of students:");
        for (int left = 0; left < stud.length; left++)
        {
            Student value = stud[left];
            int i = left - 1;
            for (; i > -1; i--)
            {
                if (value.iDNumber < stud[i].iDNumber)
                    stud[i+1] = stud[i];
                else
                    break;
            }
            stud[i+1] = value;
        }
        for (int i = 0; i < 10; i++)
        {
            DecimalFormat dF = new DecimalFormat("#.##");
            System.out.println(stud[i].iDNumber + " " + dF.format(stud[i].gPA));
        }
    }
}
