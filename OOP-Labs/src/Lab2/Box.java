package Lab2;

public class Box {
    int height = 1;
    int width = 1;
    int length = 1;

    Box(){
        height = width = length = 1;
    }

    Box(int equal){
        height = width = length = equal;
    }

    Box(int height, int width, int length){
        this.height = this.height;
        this.width = this.width;
        this.length = this.length;
    }

    public int surfArea(){
        return 2 * ( width * length + width * width + height * length );
    }

    public int volume(){
        return (length * width * height);
    }

}