package lab5;

public class J extends I {
    protected String j;

    public J(String a, String b, String c, String d, String e, String f, String g, String h, String i, String j, X x) {
        super(a, b, c, d, e, f, g, h, i, x);
        this.j = j;
    }

    public void printProperty() {
        super.printProperty();
        System.out.println(x.getXName());
        System.out.println(j);
        System.out.println("");
    }

}