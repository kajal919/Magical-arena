abstract class Arena {
    protected final GameView view;

    public Arena(GameView view) {
        this.view = view;
    }

    public void fight(Player player1, Player player2) {
        Player attacker = determineFirstAttacker(player1, player2);
        Player defender = (attacker == player1) ? player2 : player1;

        while (player1.isAlive() && player2.isAlive()) {
            executeRound(attacker, defender);
            // Swap attacker and defender
            Player temp = attacker;
            attacker = defender;
            defender = temp;
        }
        view.displayWinner(attacker.isAlive() ? attacker : defender);
    }

    protected abstract void executeRound(Player attacker, Player defender);

    private Player determineFirstAttacker(Player p1, Player p2) {
        return (p1.getHealth() <= p2.getHealth()) ? p1 : p2;
    }
}

class StandardArena extends Arena {

    public StandardArena(GameView view) {
        super(view);
    }

    @Override
    protected void executeRound(Player attacker, Player defender) {
    	int attackDamage = attacker.rollAttackDice(); // Calculate attacker’s damage
        int defensePower = defender.rollDefendDice(); // Calculate defender’s strength
        int damage = Math.max(0, attackDamage - defensePower);

        defender.takeDamage(damage);
        view.displayTurnResult(attacker, defender, damage);
    }
}
