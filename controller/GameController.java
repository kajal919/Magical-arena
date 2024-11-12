class GameController {
    private final GameView view;

    public GameController(GameView view) {
        this.view = view;
    }

    public void startMatch(Player player1, Player player2) {
    	view.displayStartingMatch(player1, player2);
        
        Player attacker = determineFirstAttacker(player1, player2);
        Player defender = (attacker == player1) ? player2 : player1;

        while (player1.isAlive() && player2.isAlive()) {
            int attackRoll = attacker.rollAttackDice();
            int defendRoll = defender.rollDefendDice();
            int damage = calculateDamage(attackRoll, attacker, defendRoll, defender);

            defender.takeDamage(damage);
            view.displayTurnResult(attacker, defender, damage);
            if (!defender.isAlive()) {
            	view.displayWinner(attacker.isAlive() ? attacker : defender);
                break;
            }

            // Swap roles for the next turn
            Player temp = attacker;
            attacker = defender;
            defender = temp;
        }
    }

    private int calculateDamage(int attackRoll, Player attacker, int defendRoll, Player defender) {
        int attackDamage = attackRoll * attacker.getAttack();
        int defendStrength = defendRoll * defender.getStrength();
        return Math.max(0, attackDamage - defendStrength);
    }

    private Player determineFirstAttacker(Player p1, Player p2) {
        return (p1.getHealth() <= p2.getHealth()) ? p1 : p2;
    }
}
