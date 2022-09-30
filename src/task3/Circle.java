package task3;
import java.lang.Math;
public class Circle {
    double radius;
    String colour;
    public Circle ()
    {
        this.radius = 1;
        this.colour = "black";
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getRadius() {
        return this.radius;
    }
    public void setColour(String colour) {
        this.colour = colour;
    }
    public String getColour() {
        return this.colour;
    }
    public double getPerimeter(){
        return 2*Math.PI*radius;
    }
    public double getSquare(){
        return Math.PI*radius*radius;
    }
}
