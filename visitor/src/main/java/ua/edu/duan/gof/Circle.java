package ua.edu.duan.gof;

public class Circle implements Figure{

    public int getR() {
        return r;
    }

    private final int r;

    public Circle(int r) {
        this.r = r;
    }

    @Override
    public void printName() {
        System.out.println("Circle");
    }

    @Override
    public void visit(Visitor visitor) {
        visitor.visitCircle(this);
    }
}
