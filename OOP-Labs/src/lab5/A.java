package lab5;

public class A {
    protected String a;
    protected X x = new X("xxx");

    public A(String a, X x) {
        this.a = a;
        this.x = x;
    }

    public void printProperty() {
        System.out.println(x.getXName());
        System.out.println(a);
        System.out.println("");
    }
}
