package task5.furniture;

public class Wardrobe extends Furniture{
    @Override
    public String toString() {
        return ("Wardrobe; material: " + material + "; cost: " + cost + "; is sold: " + sold + ".");
    }
    public Wardrobe()
    {
        cost = 1000;
        material = "wood";
    }
}
