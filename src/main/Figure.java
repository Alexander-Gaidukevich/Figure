package main;

public abstract class Figure {

    private int a;

    public Figure(int a) {
        this.a = a;
    }//constr

    public int getA() {
        return a;
    }//get

    public void setA(int a) {
        this.a = a;
    }//set

    public double getSquareFigure() {
        return 0;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Figure figure = (Figure) o;

        return a == figure.a;
    }

    @Override
    public int hashCode() {
        return a;
    }

    @Override
    public String toString() {
        return "Figure{" +
                "a=" + a +
                '}';
    }
}