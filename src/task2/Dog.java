package task2;

public class Dog {
    String  name;
    int age;
    public Dog (String name, int age)
    {
        this.name = name;
        this.age = age;
    }
    public String toString()
    {
        return (name + ", " + age);
    }
    public void toHumanAge()
    {
        System.out.println ("This dog's age in human age is " + age*7 + " years");
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getName(String name){
        return name;
    }
    public int getAge() {
        return age;
    }
}
