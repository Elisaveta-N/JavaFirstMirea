package Task2;

public class Ball {
    int radius;
    String colour;
    int myNumber;
    static int number = 1;
    public Ball (int radius, String colour) {
        this.radius = radius;
        this.colour = colour;
        myNumber = number;
        number++;
    }
    public String toString (){
        return "Radius is " + radius + ", color is " + colour + ", number is " + myNumber;
    }

    public static void main(String[] args)
    {
        Ball tennisBall = new Ball(3, "green");
        Ball volleyballBall = new Ball (15, "orange");
        System.out.println(tennisBall);
        System.out.println(volleyballBall);
    }
}
