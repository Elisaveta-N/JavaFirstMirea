package task2;

public class Book {
    String name;
    String author;
    public String toString()
    {
        return (name + ", " + author);
    }
    public Book (String name, String author)
    {
        this.name = name;
        this.author = author;
    }
    public static void main (String [] args)
    {
        Book b = new Book("War and Peace", "Lev Tolstoy");
        System.out.println(b);
    }
}

