package Lab2;

public class Main {
    public static void main(String[] args){
        Box box1 = new Box();
        Box box2 = new Box(9);
        Box box3 = new Box(6,20,8);
        System.out.println("Area= " + box3.surfArea() + " m^2, volume= " + box3.volume() + " m^3");
        Queue first = new Queue();
        first.push(5);
        first.push(8);
        first.push(25);
        System.out.println("Last element in first queue is " + first.pop());

        Queue second = new Queue();
        first.push(11);
        first.push(22);
        first.push(33);
        System.out.println("Last element in second queue is " + second.pop());

    }
}
