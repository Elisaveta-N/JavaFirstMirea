package task10;

import java.util.Comparator;

public class StudentGPAComparator implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        if (s1.gPA > s2.gPA)
            return -1;
        else if (s1.gPA == s2.gPA)
            return 0;
        else
            return 1;
    }
}
