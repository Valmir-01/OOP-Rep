package lab8;

public class Paralelipiped implements GeometricBody {
    private double w,h,d;

    public Paralelipiped(double w, double h, double d){
        this.w = w;
        this.h = h;
        this.d = d;
    }

    @Override
    public double getVolume() {
        return 0;
    }

    @Override
    public double getSurface() {
        return 0;
    }
}
