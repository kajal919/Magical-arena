class GameView {
    public void displayTurnResult(Player attacker, Player defender, int damage) {
        System.out.printf("%s attacks %s for %d damage, %s's health is now %d%n",
                attacker, defender, damage, defender, defender.getHealth());
    }

    public void displayWinner(Player winner) {
        System.out.printf("%s wins the match with %d health remaining!%n", winner, winner.getHealth());
    }

    
    public void displayStartingMatch(Player player1, Player player2) {
        System.out.printf("Starting match between Player 1 and Player 2%n");
    }
}
