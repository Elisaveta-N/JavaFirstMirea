package task10;

public class TestStudent {


    public static void main(String[] args) {
        SortingStudents a = new SortingStudents();
        a.setArray();
        System.out.println("Unsorted array:");
        a.printStudents();
        //a.quickSortArray();
        a.mergeSortArray();
        System.out.println("Sorted array:");
        a.printStudents();
    }
}
