package Task9.SortingStudentsByGPA;

public class Student implements Comparable<Student>{
    public int iDNumber;
    public double gPA;
    public int compareTo(Student o) {
        if (this.gPA > o.gPA)
            return 1;
        if (this.gPA == o.gPA)
            return 0;
        if (this.gPA < o.gPA)
            return -1;
        return 0;
    }
    public Student(int iDNumber, double gPA)
    {
        this.gPA= gPA;
        this.iDNumber = iDNumber;
    }
}
