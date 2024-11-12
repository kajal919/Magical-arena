import java.util.Random;

class Player {
    private int health;
    private int strength;
    private int attack;
    private final Dice attackDice;
    private final Dice defendDice;

    public Player(int health, int strength, int attack, Dice attackDice, Dice defendDice) {
        this.health = health;
        this.strength = strength;
        this.attack = attack;
        this.attackDice = attackDice;
        this.defendDice = defendDice;
    }
    public Player(int health, int strength, int attack) {
        this.health = health;
        this.strength = strength;
        this.attack = attack;
        this.attackDice = new StandardDice(6);  // Default dice with 6 sides
        this.defendDice = new StandardDice(6);  // Default dice with 6 sides
    }

    // Method to calculate attack damage
    public int rollAttackDice() {
        return attack * attackDice.roll();  // roll attack dice and calculate attack damage
    }

    // Method to calculate defense strength
    public int rollDefendDice() {
        return strength * defendDice.roll();  // roll defense dice and calculate defense power
    }

    public void takeDamage(int damage) {
        this.health = Math.max(0, health - damage);  // reduce health by damage, ensuring it doesn't go below 0
    }

    public boolean isAlive() {
        return health > 0;
    }

    public int getHealth() {
        return health;
    }

    public int getStrength() {
        return strength;
    }

    public int getAttack() {
        return attack;
    }
}
