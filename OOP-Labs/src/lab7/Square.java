package lab7;

public class Square extends Figure {
    private double sideLength;

    public Square(double sideLength){
        System.out.println("Square");
        this.sideLength = sideLength;
    }

    public double getArea()
    {

        return sideLength * sideLength;
    }

    public double getPerimeter()
    {

        return 4 * sideLength;
    }

    public String getName()
    {
        return "Square is the biggest";
    }
}
