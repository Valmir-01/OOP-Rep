package Lab1;

public class Monitor {
    String color="Black";
    int width=1960;
    int height=1080;
    double diagonal=15.6;
    int resolution=2048;

    public Monitor( String color, int width, int height, double diagonal, int resolution){
        this.color = color;
        this.width = width;
        this.height = height;
        this.diagonal = diagonal;
        this.resolution = resolution;
    }
    public void setColor(String color){this.color = color; }
    public String getColor() {return color;}

    public void setWidth(int width) {
        this.width = width;
    }

    public int getWidth() {
        return width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    public void setDiagonal(double diagonal) {
        this.diagonal = diagonal;
    }

    public double getDiagonal() {
        return diagonal;
    }

    public void setResolution(int resolution) {
        this.resolution = resolution;
    }

    public int getResolution() {
        return resolution;
    }
}
