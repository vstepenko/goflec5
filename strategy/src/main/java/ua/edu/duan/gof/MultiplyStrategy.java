package ua.edu.duan.gof;

public class MultiplyStrategy implements  Strategy{
    @Override
    public int execute(int a, int b) {
        return a * b;
    }
}
