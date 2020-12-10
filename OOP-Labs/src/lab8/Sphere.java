package lab8;

public class Sphere implements GeometricBody{
    private float radius;

    public Sphere(float radius){
        this.radius = radius;
    }

    @Override
    public double getVolume() {
        return (4*3.1415*radius*radius*radius)/3;
    }

    @Override
    public double getSurface() {
        return 4*3.1415*radius*radius;
    }
}
