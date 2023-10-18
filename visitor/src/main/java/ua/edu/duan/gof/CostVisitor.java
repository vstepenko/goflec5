package ua.edu.duan.gof;

public class CostVisitor implements Visitor{

    @Override
    public void visitCircle(Circle circle) {
        System.out.println("Cost Circle :" + 2* 3.14 * circle.getR() );
    }

    @Override
    public void visitSquare(Square square) {
        System.out.println("Cost :" + 4 * square.getA());
    }

    @Override
    public void visiTriangle(Triangle triangle) {
        System.out.println("Cost :" + 3 * triangle.getA());
    }
}
