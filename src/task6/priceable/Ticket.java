package task6.priceable;

public class Ticket implements Priceable{
    private final int price;
    @Override
    public String getPrice() {
        return "The price of the ticket is " + price;
    }
    public Ticket(int price)
    {
        this.price = price;
    }
}
