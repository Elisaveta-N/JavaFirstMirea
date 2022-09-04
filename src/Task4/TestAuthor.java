package Task4;

public class TestAuthor {
    public static void main (String [] args) {
        Author a = new Author("Christy", "achristy@gmail.com", 'f');
        System.out.println(a.getName() + ", " + a.getEmail() + ", " + a.getGender());
        a.setEmail("christy@gmail.com");
        System.out.println(a);
    }
}
