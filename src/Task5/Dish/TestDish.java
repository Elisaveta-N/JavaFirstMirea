package Task5.Dish;

public class TestDish {
    public static void main(String[] args) {
        Kettle ket = new Kettle();
        Plate plate = new Plate();
        Pan pan = new Pan();

        ket.setClean(true);
        ket.setFull(true);
        ket.isFull();
        ket.boilWater();

        plate.setClean(true);
        plate.setFull(false);
        plate.isFull();
        plate.setType("flat");
        System.out.println("Plate is " +plate.getType());

        pan.setClean(true);
        pan.setFull(true);
        pan.isFull();
        pan.isCooking();
    }
}
