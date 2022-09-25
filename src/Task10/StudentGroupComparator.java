package Task10;

import java.util.Comparator;

public class StudentGroupComparator implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        if (s1.group > s2.group)
            return 1;
        else if (s1.group == s2.group)
            return 0;
        else
            return -1;
    }
}
