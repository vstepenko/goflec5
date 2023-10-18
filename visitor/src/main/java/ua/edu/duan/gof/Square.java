package ua.edu.duan.gof;

public class Square implements Figure {

    public int getA() {
        return a;
    }

    private final int a;

    public Square(int a) {
        this.a = a;
    }

    @Override
    public void printName() {
        System.out.println("Square");
    }

    @Override
    public void visit(Visitor visitor) {
        visitor.visitSquare(this);
    }
}
