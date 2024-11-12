Magical Arena
This project is a console-based battle simulator where two players fight in a magical arena using predefined attributes. Players take turns attacking and defending based on dice rolls, with the match continuing until one player's health reaches zero. The code follows the MVC structure and adheres to SOLID principles and design patterns.

Project Structure
Model: Defines the core classes such as Player, Dice, and Arena.
View: Handles all console-based output, like displaying match information and results.
Controller: Coordinates interactions between the Model and View, controlling game flow.
Classes
Player: Represents a player in the arena with attributes health, strength, and attack.
Dice: Simulates dice rolls for attack and defense calculations.
Arena: Manages the battle between players, orchestrating attacks and defenses.
GameView: Displays messages and game status to the console.
GameController: Controls the game logic, managing rounds and turns.
Prerequisites
Java 8 or higher is required to compile and run this program.
How to Run the Code
Clone the Repository
Clone the repository to your local machine.

bash
Copy code
git clone <repository-url>
Navigate to the Project Directory

bash
Copy code
cd magical-arena
Compile the Code
Compile all Java files.

bash
Copy code
javac -d bin src/*.java
Run the Game
Run the main class MagicalArenaApp from the bin directory.

bash
Copy code
java -cp bin MagicalArenaApp
Run Unit Tests (Optional)
To run the tests, compile and run the test classes (if any) from the tests directory.

bash
Copy code
javac -d bin tests/*.java
java -cp bin TestRunner
Game Rules
Each player is defined by health, strength, and attack attributes.
Players take turns attacking each other. The player with lower health attacks first at the start of each match.
During each turn:
The attacking player rolls the attack dice to determine their attack damage.
The defending player rolls the defense dice to determine the damage they can defend.
The defender's health is reduced by the excess damage, if any.
The match ends when a player’s health reaches zero.
Sample Output
The output displays each turn’s details, showing dice rolls, attack and defense calculations, and remaining health. At the end, the winner is announced.

Code Structure and Design Patterns
This project implements the following design principles and patterns:

SOLID Principles: Classes have single responsibilities, and dependencies are managed to ensure code flexibility and reusability.
MVC Pattern: The game is structured using the MVC pattern, separating concerns between data (Model), user interaction (View), and game control (Controller).

Author
Kajal Pandey