package behavioral.strategy;

public class StrategyPatternDemo {

    public static void main(String[] args) {
        //Addition
        Context cnt = new Context(new Addition());
        System.out.println(cnt.doOperation(2, 4));

        //Multiplication
        Context cnt2 = new Context(new Multiplication());
        System.out.println(cnt.doOperation(2, 2));
    }
}
