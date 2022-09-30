package task6.nameable;

public class Plant implements Nameable{
    private final String name;

    @Override
    public String getName() {
        return ("plant " + name);
    }
    public Plant(String name)
    {
        this.name = name;
    }
}
