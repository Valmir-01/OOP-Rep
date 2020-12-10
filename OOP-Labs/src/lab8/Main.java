package lab8;

public class Main {

    public static void main(String[] args) {
        Paralelipiped paralelipiped = new Paralelipiped(2, 3, 4);
        Sphere sphere = new Sphere(5);
        Cube cube = new Cube(7);
        GeometricBody[] geometricBodies = {paralelipiped, sphere, cube};
        GeometricBodyController geometricBodyController = new GeometricBodyController(geometricBodies);

        System.out.println("biggest volume: "+ geometricBodyController.getBiggestVolumebody(geometricBodies).getVolume());
        System.out.println("biggest surface: "+ geometricBodyController.getBiggestSurfacebody(geometricBodies).getSurface());
    }
}
