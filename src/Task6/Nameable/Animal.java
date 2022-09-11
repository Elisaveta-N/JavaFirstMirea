package Task6.Nameable;

public class Animal implements Nameable {
    private final String name;

    @Override
    public String getName() {
        return ("animal " + name);
    }
    public Animal(String name)
    {
        this.name = name;
    }
}
