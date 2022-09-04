package Task2;
import java.util.*;


public class TestDog {
    public static void main (String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Input a number of dogs: ");
        int a = in.nextInt(), age;
        String name;
        Dog [] dogs = new Dog [a];
        for (int i = 0; i < a; i++)
        {
            System.out.print("Input the name of the dog: ");
            name = in.next();
            System.out.print("Input the age of the dog: ");
            age = in.nextInt();
            dogs[i] = new Dog(name, age);
        }
        System.out.println("There are the dogs: ");
        for (Dog d: dogs)
        {
            System.out.println(d);
            d.toHumanAge();
        }
    }
}
