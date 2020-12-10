package lab8;

public class Cube implements GeometricBody{
    private double l;

    public Cube(double l){
        this.l = l;
    }

    @Override
    public double getVolume() {
        return l*l*l;
    }

    @Override
    public double getSurface() {
        return l*l*6;
    }
}
