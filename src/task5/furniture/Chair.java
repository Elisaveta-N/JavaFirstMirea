package task5.furniture;

public class Chair extends Furniture{
    @Override
    public String toString() {
        return ("Chair; material: " + material + "; cost: " + cost + "; is sold: " + sold + ".");
    }
    public Chair()
    {
        cost = 200;
        material = "plastic";
    }
}
