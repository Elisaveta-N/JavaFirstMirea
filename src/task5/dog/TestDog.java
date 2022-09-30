package task5.dog;

public class TestDog {
    public static void main(String[] args) {
        Shepherd shepherd = new Shepherd();
        shepherd.setName("Shelly");
        shepherd.setAge(3);

        System.out.println("Name: " + shepherd.getName() + "; age: " + shepherd.getAge());
        shepherd.toWoof();
        shepherd.toGuide();
        shepherd.toWiggleTail();

        BassetHound basset = new BassetHound();
        basset.setName("Brock");
        basset.setAge(2);
        System.out.println("Name: " + basset.getName() + "; age: " + basset.getAge());

        basset.toHunt();
        basset.toWoof();
        basset.toWiggleTail();
    }
}
