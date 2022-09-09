package Task5.Dish;

public class Pan extends Dish {
    public void isFull()
    {
        if (full) {
            System.out.println("Pan is full");
        }
        else
            System.out.println("Pan is empty");
    }
    public void isCooking()
    {
        System.out.println("The food is now ready");
    }
}
