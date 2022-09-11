package Task7;

public class Circle extends Shape{
    protected double radius;
    public Circle()
    {
        radius = 0;
    }
    public Circle(double radius)
    {
        this.radius = radius;
    }
    public  Circle(double radius, String color, boolean filled)
    {
        this.radius = radius;
        this.color = color;
        this.filled = filled;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getPerimeter(){
        return 2*Math.PI*radius;
    }
    public double getArea(){
        return Math.PI*radius*radius;
    }
    public String toString()
    {
        return ("Circle color: " + color + "; filled: " + filled + "; radius: " + radius);
    }
}
