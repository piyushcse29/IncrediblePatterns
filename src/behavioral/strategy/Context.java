package behavioral.strategy;

public class Context {
    Strategy stg;

    Context(Strategy stg){
        this.stg = stg;

    }

    int doOperation(int i, int j){
        return stg.doOperation(i,j);
    }
}
