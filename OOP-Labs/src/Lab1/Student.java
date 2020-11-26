package Lab1;

public class Student {
    private String name = "NA";
    private int age = 1960;
    private int mark = 1080;

    public Student(String name, int age, int mark){
        this.age = age;
        this.mark = mark;
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

    public int getMark() {
        return mark;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
