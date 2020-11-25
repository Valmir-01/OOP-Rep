package Lab2;

import java.util.ArrayList;

public class Queue {
    int size;
    ArrayList<Integer> elements;

    Queue(){

        elements = new ArrayList<Integer>();
    }

    Queue(int maxsize){
        size = maxsize;
        elements = new ArrayList<Integer>();
    }

    public boolean empty(){

        return elements.isEmpty();
    }

    public boolean full(){
        if (size == 0){
            return false;
        }
        else if (size <= elements.size())
            return true;
        return false;
    }

    public void push(int element){
        if(full()){
            System.out.println("Queue is full!");
        }
        else {
            Queue.this.elements.add(element);
        }
    }

    public Integer pop(){
        Integer temp = null;
        if(empty()){
            System.out.println("Queue is empty!");
        }
        else {
            temp = Queue.this.elements.get(0);
            Queue.this.elements.remove(0);
        }
        return temp;
    }

}
