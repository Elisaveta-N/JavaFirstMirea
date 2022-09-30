package task7.moveable;

public class TestMoveable {
    public static void main(String[] args) {
        MoveableCircle circle = new MoveableCircle(0,0,5,2, 3);
        System.out.println(circle);
        circle.moveDown();
        circle.moveLeft();
        System.out.println(circle);

        MoveableRectangle rectangle = new MoveableRectangle(0,0, 10, -10, 5, 5);
        System.out.println(rectangle);
        rectangle.moveUp();
        rectangle.moveRight();
        System.out.println(rectangle);
    }
}
