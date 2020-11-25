package lab5;


public class Main {
    public static void main(String[] argv) {
        J j = new J("A",
                    "B",
                    "C",
                    "D",
                    "E",
                    "F",
                    "G",
                    "H",
                    "I",
                    "J",
                    new X("The Name for X:"));

        j.printProperty();
    }
}