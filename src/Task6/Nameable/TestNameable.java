package Task6.Nameable;

public class TestNameable {
    public static void main(String[] args) {
        Nameable[] arr = new Nameable[6];
        arr[0] = new Planet("Earth");
        arr[1] = new Planet("Venus");
        arr[2] = new Plant("cactus");
        arr[3] = new Plant("orchid");
        arr[4] = new Animal("cat");
        arr[5] = new Animal("dog");

        for (Nameable nameable : arr) {
            System.out.println(nameable.getName());
        }
    }
}
