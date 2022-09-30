package task5.dish;

public class Plate extends Dish {
    String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void isFull()
    {
        if (full) {
            System.out.println("Plate is full");
        }
        else
            System.out.println("Plate is empty");
    }
}
