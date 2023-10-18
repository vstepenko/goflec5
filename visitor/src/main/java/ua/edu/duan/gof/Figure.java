package ua.edu.duan.gof;

public interface Figure {
    void printName();
    void visit(Visitor visitor);
}
