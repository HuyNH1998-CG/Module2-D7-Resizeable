package Test;

import shapes.Circle;
import shapes.Rectangle;
import shapes.Square;

public class Main {

    public static void main(String[] args) {
        Circle circle = new Circle(5);
        System.out.println("Circle: before");
        System.out.println(circle.getArea());
        circle.resize();
        System.out.println("Circle: after");
        System.out.println(circle.getArea());
        Rectangle rectangle = new Rectangle(5, 10);
        System.out.println("Rectangle: before");
        System.out.println(rectangle.getArea());
        rectangle.resize();
        System.out.println("Rectangle: after");
        System.out.println(rectangle.getArea());
        Square square = new Square(10);
        System.out.println("Square: before");
        System.out.println(square.getArea());
        square.resize();
        System.out.println("Square: after");
        System.out.println(square.getArea());
    }
}
