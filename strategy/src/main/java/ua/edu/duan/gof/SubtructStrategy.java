package ua.edu.duan.gof;

public class SubtructStrategy implements Strategy{
    @Override
    public int execute(int a, int b) {
        return a - b;
    }
}
