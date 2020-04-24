package oop.unittesting;

public class Triangle {
    private int base;
    private int height;

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        if ( base <= 0){
            throw new IllegalArgumentException("Base must be greater than zero");
        }

        this.base = base;
    }


    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        if ( height <= 0){
            throw new IllegalArgumentException("Height must be greater than zero");
        }
        this.height = height;
    }

    public double getArea(){
        return base * height / 2.0;
    }
}
