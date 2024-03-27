package tema.scoalainformala.week8;
public enum ShootingResult {
    HIT('x'), MISS('O');
    private final char symbol;
    ShootingResult(char symbol){
        this.symbol = symbol;
    }
}
