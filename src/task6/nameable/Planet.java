package task6.nameable;

public class Planet implements Nameable{
    private final String name;

    @Override
    public String getName() {
        return ("planet " + name);
    }
    public Planet(String name)
    {
        this.name = name;
    }
}
