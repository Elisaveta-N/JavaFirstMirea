package task7.moveable;

public class MoveableRectangle implements Moveable {
    private final MoveablePoint topLeft;
    private final MoveablePoint bottomRight;

    public MoveableRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed) {
        topLeft = new MoveablePoint(x1, y1, xSpeed, ySpeed);
        bottomRight = new MoveablePoint(x2, y2, xSpeed, ySpeed);
    }

    public String toString() {
        return "MoveableRectangle: x1 = " + topLeft.x + "; y1 = " + topLeft.y + "; x2 = " + bottomRight.x + "; y2 = " +
                bottomRight.y + "; xSpeed = " + topLeft.xSpeed + "; ySpeed = " + topLeft.ySpeed;

    }
    @Override
    public void moveUp() {
        topLeft.moveUp();
        bottomRight.moveUp();
    }
    @Override
    public void moveDown() {
        topLeft.moveDown();
        bottomRight.moveDown();
    }
    @Override
    public void moveLeft() {
        topLeft.moveLeft();
        bottomRight.moveLeft();
    }
    @Override
    public void moveRight() {
        topLeft.moveRight();
        bottomRight.moveRight();
    }
}