package Task7;

public class Square extends Rectangle{
    public Square() {;}
    public Square(double side)
    {
        width = side;
        length = side;
    }
    public Square(double side, String color, boolean filled)
    {
        width = side;
        length = side;
        this.color = color;
        this.filled = filled;
    }
    public double getSide()
    {
        return length;
    }
    public void setSide(double side)
    {
        width = side;
        length = side;
    }
    public void setLength(double length) {
        this.length = length;
        this.width = length;
    }
    public void setWidth(double width) {
        this.width = width;
        this.length = width;
    }
    public String toString()
    {
        return ("Square color: " + color + "; filled: " + filled + "; side: " + width);
    }
}
