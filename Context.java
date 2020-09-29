public class Context { //FOR STRATEGY
    private Noise strategy;

    public Context(Noise strategy){
        this.strategy = strategy;
    }

    public String executeStrategy(){
        return strategy.getNoise();
    }
}