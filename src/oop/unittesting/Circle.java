package oop.unittesting;

public class Circle {
    private int radio;

    public int getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        if (radio <= 0) {
            throw new IllegalArgumentException("Radio must be greater than zero");
        }

        this.radio = radio;
    }

    public double getArea(){
        return Math.PI * Math.pow(radio, 2);
    }
}
