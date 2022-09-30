package task4;

public class TestBall {
    public static void main (String [] args) {
        Ball tennisBall = new Ball();
        Ball golfBall = new Ball(3, 5);

        System.out.println(tennisBall.getX()+ ", " + tennisBall.getY()); //(0, 0)
        tennisBall.setX(2.5);
        tennisBall.setY(4.5);
        golfBall.setXY(5,7);
        System.out.println(tennisBall);//(2.5, 4.5)
        System.out.println(golfBall); //(5, 7)
        golfBall.move(5, 3);
        System.out.println(golfBall);//(10, 10)
    }
}
