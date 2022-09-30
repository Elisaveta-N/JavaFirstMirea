package task11;

import static task11.DateFmt.fmShort;

public class StudentWithBirthday {
    public static void main(String[] args) {
        Student s = new Student("James", "Bond", "Intelligence services",
                3, 0, 5);
        System.out.println(s.toString(DateFmt.fmLong));
        System.out.println(s.toString(DateFmt.fmMid));
        System.out.println(s.toString(fmShort));
    }
}
