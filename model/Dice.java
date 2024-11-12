import java.util.Random; 
interface Dice {
    int roll();
}

class StandardDice implements Dice {
    private final Random random = new Random();
    private final int sides;

    public StandardDice(int sides) {
        this.sides = sides;
    }

    @Override
    public int roll() {
        return random.nextInt(sides) + 1;
    }
}
