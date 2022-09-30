package task5.furniture;

public class TestFurniture {
    public static void main(String[] args) {
        Chair chair = new Chair();
        System.out.println(chair);
        chair.setCost(100);
        chair.setMaterial("wood");
        chair.setSold();
        System.out.println(chair.getMaterial());
        System.out.println(chair);

        FurnitureShop shop = new FurnitureShop();
        shop.innitAssortment();
        shop.showFurniture();
        shop.buy(3,3,3);
        shop.showFurniture();
        shop.buy(3,3,3);
    }
}
