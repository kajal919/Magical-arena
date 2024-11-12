class MagicalArenaApp {
    public static void main(String[] args) {
        // Initialize players
        Player player1 = new Player(50, 5, 10);
        Player player2 = new Player(100, 10, 5);

        // Initialize the view
        GameView view = new GameView();

        // Initialize the controller
        GameController controller = new GameController(view);

        // Start the match
        controller.startMatch(player1, player2);
    }
}