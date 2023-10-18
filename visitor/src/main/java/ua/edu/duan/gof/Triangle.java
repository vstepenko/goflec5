package ua.edu.duan.gof;

public class Triangle implements Figure {

    public int getA() {
        return a;
    }

    private final int a;

    public Triangle(int a) {
        this.a = a;
    }

    @Override
    public void printName() {
        System.out.println("Triangle");
    }

    @Override
    public void visit(Visitor visitor) {
        visitor.visiTriangle(this);
    }
}
