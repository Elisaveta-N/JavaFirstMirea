package Task10;

import java.util.Comparator;
import java.util.Objects;
import java.util.Random;

public class SortingStudents {
    Student [] iDNumber = new Student[5];
    public void setArray()
    {
        String[] names = {"Nichola", "Lisa", "Alex", "Ann", "Mike", "Richard"};
        String[] surnames = {"Smith", "Potter", "Holmes", "Peterson", "Evans", "Anderson"};
        String[] specialities = {"IT", "Art", "Law", "Philosophy", "Maths", "Literature"};
        Random rand = new Random();
        for (int i = 0; i < iDNumber.length; i++)
        {
            iDNumber[i] = new Student(names[rand.nextInt(5)],surnames[rand.nextInt(5)],
                    specialities[rand.nextInt(5)], rand.nextInt(4) + 1,
                    rand.nextInt(9) + 1, rand.nextFloat(4) + 1);
        }
    }
    private static void quickSort(Student[]students, int left, int right)
    {
        Comparator<Student> comp = new StudentGPAComparator();
        int leftMarker = left;
        int rightMarker = right;
        Student pivot = students[(leftMarker+rightMarker)/2];
        do {
            while (comp.compare(students[leftMarker],(pivot)) < 0)
                leftMarker++;

            while (comp.compare(students[rightMarker],pivot) > 0)
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
    public void quickSortArray()
    {
        quickSort(iDNumber,0, iDNumber.length-1);
    }
    public void printStudents()
    {
        for (int i = 0; i < iDNumber.length; i++)
        {
            System.out.println(iDNumber[i].toString());
        }
    }
    public void mergeSortArray()
    {
        mergeSort(iDNumber,0, iDNumber.length-1);
    }
    private void mergeSort(Student[] source, int left, int right) {
        Comparator<Student> comp = new StudentGPAComparator();
        int delimiter = left + ((right - left) / 2) + 1;
        if (delimiter > 0 && right > (left + 1)) {
            mergeSort(source, left, delimiter - 1);
            mergeSort(source, delimiter, right);
        }
        Student[] buffer = new Student[right - left + 1];
        int cursor = left;
        for (int i = 0; i < buffer.length; i++) {
            if (delimiter > right || comp.compare(source[cursor], source[delimiter]) < 0) {
                buffer[i] = source[cursor];
                cursor++;
            } else {
                buffer[i] = source[delimiter];
                delimiter++;
            }
        }
        System.arraycopy(buffer, 0, source, left, buffer.length);
    }
}
