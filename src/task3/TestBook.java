package task3;

public class TestBook {
    static public void main(String[] args)
    {
        try {
            final String name = "1984";
            final String author = "George Orwell";
            final int year = 1948;
            final int pageCount = 320;
            Book b = new Book();
            b.setName(name);
            b.setAuthor(author);
            b.setYear(year);
            b.setPageCount(pageCount);

            if (!b.getName().equals(name))
                throw new Exception("Name assing error");
            if (!b.getAuthor().equals(author))
                throw new Exception("Author assing error");
            if (b.getYear() != year)
                throw new Exception("Year assing error");
            if (b.getPageCount() != pageCount)
                throw new Exception("Page count assing error");

            System.out.println(b);
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }



    }
}
