package behavioral.strategy;

public class Addition implements Strategy {
    @Override
    public int doOperation(int i, int j) {
      return i+j;
    }
}
