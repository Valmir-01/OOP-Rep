package lab7;

public class Rectangle extends Figure {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        System.out.println("Rectangle");
        this.length = length;
        this.width = width;
    }

    public double getArea() {
         return width * length;
    }

    public double getPerimeter() {
         return 2 * (width + length);
    }

    public String getName() {
        return "Rectangle is the biggest";
    }
}
