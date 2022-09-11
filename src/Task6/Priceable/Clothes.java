package Task6.Priceable;

public class Clothes implements Priceable{
    private final int price;
    @Override
    public String getPrice() {
        return "The price of the clothes is " + price;
    }
    public Clothes(int price)
    {
        this.price = price;
    }
}
