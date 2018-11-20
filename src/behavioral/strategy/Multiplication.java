package behavioral.strategy;

public class Multiplication implements Strategy {
    @Override
    public int doOperation(int i, int j) {
        return i*j;
    }
}
