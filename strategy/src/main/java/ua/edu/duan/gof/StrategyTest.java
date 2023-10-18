package ua.edu.duan.gof;

public class StrategyTest {
    public static void main(String[] args) {
        StrategyContext context = new StrategyContext();

        context.setStrategy(new SubtructStrategy());


        System.out.println("Subtract : " + context.execute(20, 10));

        context.setStrategy(new AddStrategy());

        System.out.println("Add : " + context.execute(20, 10));

        context.setStrategy(new MultiplyStrategy());

        System.out.println("multiply : " + context.execute(20, 10));

    }
}
