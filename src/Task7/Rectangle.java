package Task7;

public class Rectangle extends Shape{
    protected double width;
    protected double length;
    public Rectangle()
    {
        width = 0;
        length = 0;
    }
    public Rectangle(double width, double length)
    {
        this.width = width;
        this.length = length;
    }
    public Rectangle(double width, double length, String color, boolean filled)
    {
        this.width = width;
        this.length = length;
        this.color = color;
        this.filled = filled;
    }

    public double getLength() {
        return length;
    }
    public double getWidth() {
        return width;
    }
    public void setLength(double length) {
        this.length = length;
    }
    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double getArea() {
        return length*width;
    }

    @Override
    public double getPerimeter() {
        return 2*(length + width);
    }
    public String toString()
    {
        return ("Rectangle color: " + color + "; filled: " + filled + "; width: " + width + "; length: " + length);
    }
}
