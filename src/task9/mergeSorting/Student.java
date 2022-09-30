package task9.mergeSorting;

public class Student implements Comparable<Student>{
    public int iDNumber;
    public double gPA;
    public int compareTo(Student o) {
        if (this.iDNumber > o.iDNumber)
            return 1;
        if (this.iDNumber == o.iDNumber)
            return 0;
        if (this.iDNumber < o.iDNumber)
            return -1;
        return 0;
    }
    public Student(int iDNumber, double gPA)
    {
        this.gPA= gPA;
        this.iDNumber = iDNumber;
    }
    public static void insertionSort(Student[] stud)
    {

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
    }
}
