package Task6.Priceable;

public class Lunch implements Priceable{
    private final int  price;
    @Override
    public String getPrice() {
        return "The price of the lunch is " + price;
    }
    public Lunch(int price)
    {
        this.price = price;
    }

}
