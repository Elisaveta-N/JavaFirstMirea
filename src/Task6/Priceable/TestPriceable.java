package Task6.Priceable;


public class TestPriceable {
    public static void main(String[] args) {
       Priceable[] arr = new Priceable[6];
        arr[0] = new Lunch(250);
        arr[1] = new Lunch(500);
        arr[2] = new Clothes(1500);
        arr[3] = new Clothes(3000);
        arr[4] = new Ticket(150);
        arr[5] = new Ticket(200);

        for (Priceable priceable : arr) {
            System.out.println(priceable.getPrice());
        }
    }
}
