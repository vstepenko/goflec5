package ua.edu.duan.gof;

import java.util.List;

public class VisitorTest {

    public static void main(String[] args) {

        List<Figure> figureList =List.of(new Circle(12), new Square(5), new Triangle(6));
        Visitor costVisitor = new CostVisitor();

        for (Figure figure: figureList) {
             figure.visit(costVisitor);
        }


    }
}
