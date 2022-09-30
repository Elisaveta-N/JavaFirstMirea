package task3;

public class TestCircle {
    public static void main (String [] args){
        Circle f = new Circle();
        double radius = 1.5;
        String colour = "red";
        f.setRadius(radius);
        if (f.getRadius() == radius)
            System.out.println("setRadius works fine");
        f.setColour(colour);
        if (f.getColour().equals(colour))
            System.out.println("setColour works fine");
        String str = String.format("Perimeter is %.3f", f.getPerimeter());
        System.out.println(str);
        str = String.format("Square is %.3f", f.getSquare());
        System.out.println(str);
    }
}
