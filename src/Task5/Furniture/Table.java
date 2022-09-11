package Task5.Furniture;

public class Table extends Furniture{


    @Override
    public String toString() {
        return ("Table; material: " + material + "; cost: " + cost + "; is sold: " + sold + ".");
    }
    public Table()
    {
        cost = 500;
        material = "metal";
    }
}
