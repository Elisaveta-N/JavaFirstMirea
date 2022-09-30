package task3;

public class Book {
    String name;
    String author;
    int year;
    int pageCount;
    public String toString()
    {
        return ("Name of the book is " + name + ", author is " +
                author + ", year of creation is " + year + ", pages: " + pageCount);
    }
    public Book ()
    {
        this.name = "name";
        this.author = "author";
        this.year = 1000;
        this.pageCount = 0;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getPageCount() {
        return pageCount;
    }
    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }

    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
}
