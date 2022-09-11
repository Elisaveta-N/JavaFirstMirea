package Task7;

public class TestShape {
    public static void main(String[] args) {

        Shape s1 = new Circle(5.5, "RED", false); // Upcast Circle to Shape

        System.out.println(s1); //метод определенный в классе Circle
        System.out.println(s1.getArea()); // метод определенный в классе Circle
        System.out.println(s1.getPerimeter()); // метод определенный в классе Circle
        System.out.println(s1.getColor()); // метод определенный в классе Shape
        System.out.println(s1.isFilled()); // метод определенный в классе Shape

        System.out.println(s1.getRadius());//абстрактный класс Shape не содержит метод getRadius()
        Circle c1 = (Circle)s1; // Downcast back to Circle
        System.out.println(c1);//метод определенный в классе Circle
        System.out.println(c1.getArea());//метод определенный в классе Circle
        System.out.println(c1.getPerimeter());//метод определенный в классе Circle
        System.out.println(c1.getColor());// метод определенный в классе Shape
        System.out.println(c1.isFilled());// метод определенный в классе Shape
        System.out.println(c1.getRadius());//метод определенный в классе Circle

        Shape s2 = new Shape(); //нельзя создать объект абстрактного класса
        Shape s3 = new Rectangle(1.0, 2.0, "RED", false); // Upcast
        System.out.println(s3);//метод определенный в классе Rectangle
        System.out.println(s3.getArea());//метод определенный в классе Rectangle
        System.out.println(s3.getPerimeter());//метод определенный в классе Rectangle
        System.out.println(s3.getColor());// метод определенный в классе Shape
        System.out.println(s3.getLength());//абстрактный класс Shape не содержит метод getLength()

        Rectangle r1 = (Rectangle)s3; // downcast
        System.out.println(r1);//метод определенный в классе Rectangle
        System.out.println(r1.getArea());//метод определенный в классе Rectangle
        System.out.println(r1.getColor());// метод определенный в классе Shape
        System.out.println(r1.getLength());//метод определенный в классе Rectangle

        Shape s4 = new Square(6.6); // Upcast
        System.out.println(s4);//метод определенный в классе Square
        System.out.println(s4.getArea());//метод определенный в классе Rectangle
        System.out.println(s4.getColor());// метод определенный в классе Shape
        System.out.println(s4.getSide());//абстрактный класс Shape не содержит метод getSide()
// Take note that we downcast Shape s4 to Rectangle,
// which is a superclass of Square, instead of Square

        Rectangle r2 = (Rectangle)s4;
        System.out.println(r2);//метод определенный в классе Square
        System.out.println(r2.getArea());//метод определенный в классе Rectangle
        System.out.println(r2.getColor());// метод определенный в классе Shape
        //System.out.println(r2.getSide());//класс Rectangle не содержит метод getSide()
        System.out.println(r2.getLength());//метод определенный в классе Rectangle
// Downcast Rectangle r2 to Square

        Square sq1 = (Square)r2;
        System.out.println(sq1);//метод определенный в классе Square
        System.out.println(sq1.getArea());//метод определенный в классе Rectangle
        System.out.println(sq1.getColor());// метод определенный в классе Shape
        System.out.println(sq1.getSide());//метод определенный в классе Square
        System.out.println(sq1.getLength());//метод определенный в классе Rectangle


    }
}
