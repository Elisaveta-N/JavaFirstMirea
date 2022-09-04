package Task4;

public class Author {
    String name;
    String email;
    char gender;
    public Author(String name, String email, char gender)
    {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }
    public String toString() {
        return ("Name: " + name + ", email: " + email + ", gender: " + gender);
    }
    public String getName() {
        return name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public char getGender() {
        return gender;
    }


}
