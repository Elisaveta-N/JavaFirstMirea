package Task5.Dish;

public class Kettle extends Dish {

    public void isFull()
    {
        if (full) {
            System.out.println("Kettle is full");
        }
        else
            System.out.println("Kettle is empty");
    }
    public void boilWater()
    {
        System.out.println("The water is now hot");
    }
}

