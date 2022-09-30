package task11;

import java.util.Calendar;

enum DateFmt{fmShort, fmMid, fmLong};

public class Student {
    String name;
    String surname;
    String speciality;
    int course;
    int group;
    float gPA;

    Calendar dayOfBirth;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getCourse() {
        return course;
    }
    public void setCourse(int course) {
        this.course = course;
    }
    public int getGroup() {
        return group;
    }
    public void setGroup(int group) {
        this.group = group;
    }
    public String getSpeciality() {
        return speciality;
    }
    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }
    public String getSurname() {
        return surname;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }

    public float getgPA() {
        return gPA;
    }

    public void setgPA(float gPA) {
        this.gPA = gPA;
    }

    public void setDayOfBirth(Calendar dayOfBirth) {
        this.dayOfBirth = dayOfBirth;
    }

    public Calendar getDayOfBirth() {
        return dayOfBirth;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", speciality='" + speciality + '\'' +
                ", course=" + course +
                ", group=" + group +
                ", gPA=" + gPA +
                '}';
    }

    public String toString(DateFmt fmt) {
        String s;
        switch(fmt)
        {
            case fmShort: {
                s = String.valueOf((dayOfBirth.get(Calendar.YEAR)));
            }
            break;
            case fmMid: {
                s = String.format("%d.%d.%d", dayOfBirth.get(Calendar.DAY_OF_MONTH), dayOfBirth.get(Calendar.MONTH),
                        dayOfBirth.get(Calendar.YEAR));
            }
            break;
            case fmLong: {
                s = String.format("%d.%d.%d %d:%d:%d", dayOfBirth.get(Calendar.DAY_OF_MONTH), dayOfBirth.get(Calendar.MONTH),
                        dayOfBirth.get(Calendar.YEAR), dayOfBirth.get(Calendar.HOUR), dayOfBirth.get(Calendar.MINUTE),
                            dayOfBirth.get(Calendar.SECOND));
            }
            break;
            default: {
                s = new String();
            }
            break;
        }
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", speciality='" + speciality + '\'' +
                ", course=" + course +
                ", group=" + group +
                ", gPA=" + gPA +
                ", Birthday date=" + s +
                '}';
    }

    public Student(String name, String surname, String speciality, int course, int group, float gPA )
    {
        this.name = name;
        this.surname = surname;
        this.speciality = speciality;
        this.course = course;
        this.group = group;
        this.gPA = gPA;
        dayOfBirth = Calendar.getInstance();
    }


}