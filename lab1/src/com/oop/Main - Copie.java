package com.oop;

public class shoe {
    public final string brand;
    public final double size;
    shoe(string brand, doube size){
        this.brand= brand;
        this.size = size;
    }
    public class walking extends shoe {
        public final boolean go;
        walking(boolean go, string brand, double size){
            super(brand, size)
            this.go = go;
        }
    }
}
