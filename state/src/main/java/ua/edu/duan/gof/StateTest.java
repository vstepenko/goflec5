package ua.edu.duan.gof;

public class StateTest {

    public static void main(String[] args) {
        DocumentContext context = new DocumentContext();

        context.request();

        context.nextState();
        context.request();
        context.nextState();
        context.request();
    }
}
