package Lab1;

import java.util.ArrayList;

public class University {
    private String name = "NA";
    private int year = 0;
    private ArrayList<Student> StudentList;

    public University(String name, int year) {
        this.year = year;
        this.name = name;
        this.StudentList = new ArrayList<Student>();
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    public void addStudent(Student student) {
        StudentList.add(student);
    }

    public void printStudents() {
        for (Student s : StudentList)
            System.out.println(s.getName() + "Age" + s.getAge() + "Mark" + s.getMark());
    }

    public void aMark() {
        double amark = 0.0;
        int n = 0;
        double sum = 0;
        for (Student i : StudentList) {
            n += 1;
            sum += i.getMark();
        }
        amark = sum / n;
        System.out.println("Average mark: " + amark);
    }
    static class Student {
        private String name = "NA";
        private int age = 1960;
        private int mark = 1080;

        Student(String name, int age, int mark){
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
}

