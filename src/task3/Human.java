package task3;

public class Human {
    private Head head;
    private Arm arm;
    private Leg leg;
    private String name;
    public Human(String name)
    {
        head = new Head();
        leg = new Leg();
        arm = new Arm();
        this.name = name;
    }

    public void toThink() {
        head.toThink(name);
    }
    public void toEat() {
        head.toEat(name);
    }
    public void toWave() {
        arm.toWave(name);
    }
    public void toWalk() {
        leg.toWalk(name);
    }
    static class Head {
        public void toThink(String name)
        {
            System.out.println(name + " is in the process of thinking");
        }
        public void toEat(String name)
        {
            System.out.println(name + " is eating");
        }
    }
    static class Arm {
        public void toWave(String name)
        {
            System.out.println(name + " is waving");
        }
    }
    static class Leg {
        public void toWalk(String name)
        {
            System.out.println(name + " is walking");
        }
    }
}



