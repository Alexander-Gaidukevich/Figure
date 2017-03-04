package main;

import main.interfaces.Perimeter;

public class SquareFurniture extends Figure implements Perimeter {

    public int b;

    public SquareFurniture(int a, int b) {
        super(a);
        this.b = b;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    @Override
    public String toString() {
        return "SquareFurniture{" +
                "b=" + b +
                '}';
    }

    @Override
    public int getPerimeter() {
        return 0;
    }
}

