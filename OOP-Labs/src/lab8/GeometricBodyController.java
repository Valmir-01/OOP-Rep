package lab8;

public class GeometricBodyController {

    private GeometricBody[] geometricBodies;

    public GeometricBodyController(GeometricBody[] geometricBodies) {
        this.geometricBodies = geometricBodies;
    }

    public GeometricBody getBiggestVolumebody(GeometricBody[] geometricBodies) {
        GeometricBody biggestVolumeBody = geometricBodies[0];
        for (int i = 1; i < geometricBodies.length; i++) {
            if (biggestVolumeBody.getVolume() < geometricBodies[i].getVolume()) {
                biggestVolumeBody = geometricBodies[i];
            }
        }
        return biggestVolumeBody;
    }

    public GeometricBody getBiggestSurfacebody(GeometricBody[] geometricBodies) {
        GeometricBody biggestSurfaceBody = geometricBodies[0];
        for (int i = 1; i < geometricBodies.length; i++) {
            if (biggestSurfaceBody.getSurface() < geometricBodies[i].getSurface()) {
                biggestSurfaceBody = geometricBodies[i];
            }
        }
        return biggestSurfaceBody;
    }
}