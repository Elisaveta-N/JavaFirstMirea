package task5.dog;

public abstract class Dog {
    protected String name;
    protected int age;
    abstract void toWoof();

    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getName(){
        return name;
    }
    public int getAge() {
        return age;
    }
    void toWiggleTail()
    {
        System.out.println("The tail is wiggling");
    }
}
