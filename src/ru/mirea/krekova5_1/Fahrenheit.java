package ru.mirea.krekova5_1;

public class Fahrenheit implements Convertable{
    private Celsius t;

    public Fahrenheit(Celsius t) {
        this.t = t;
    }

    public double convert() {
        return t.getT()*1.8+32;
    }
}
