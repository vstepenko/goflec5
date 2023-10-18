package ua.edu.duan.gof;

public interface Visitor {

    void visitCircle(Circle circle);
    void visitSquare(Square square);
    void visiTriangle(Triangle triangle);
}
