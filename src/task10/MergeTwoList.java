package task10;


import java.util.Comparator;

public class MergeTwoList {
    public static void main(String[] args) {
        SortingStudents a = new SortingStudents();
        a.setArray();
        SortingStudents b = new SortingStudents();
        b.setArray();
        a.quickSortArray();
        b.quickSortArray();
        Student [] res = merge(a.iDNumber, b.iDNumber);
        for (Student s: res)
        {
            System.out.println(s.toString());
        }
    }
    public static Student[] merge(Student[]a1, Student[]a2)
    {
        Student[] a3 = new Student[a1.length + a2.length];
        Comparator<Student> comp= new StudentGPAComparator();
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
            else if (comp.compare(a1[i], a2[j]) < 0) {
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
        return a3;
    }
}
