package Task7.Moveable;

public class MoveableCircle implements Moveable{
    private final int  radius;
    private final MoveablePoint center;
    public MoveableCircle(int x, int y, int xSpeed, int ySpeed, int radius)
    {
        center = new MoveablePoint(x, y, xSpeed, ySpeed);
        this.radius = radius;
    }
    public String toString()
    {
        return "MoveableCircle: x = " + center.x + "; y = " + center.y + "; xSpeed = " + center.xSpeed +
                "; ySpeed = " + center.ySpeed + "; radius = " + radius;
    }
    @Override
    public void moveUp() {
        center.moveUp();
    }
    @Override
    public void moveDown() {
        center.moveDown();
    }
    @Override
    public void moveLeft() {
        center.moveLeft();
    }
    @Override
    public void moveRight() {
        center.moveRight();
    }
}
