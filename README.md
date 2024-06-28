# GuessGame

## Description
GuessGame is a simple Java-based guessing game where the player and the computer take turns guessing a randomly generated number between 1 and 100. 
The goal is to guess the number correctly with the least number of attempts. The game announces the winner based on who guesses the number first.

## Features
- User and computer take turns to guess the number.
- Computer uses a binary search approach to make its guesses.
- Provides feedback on whether the guess is too high or too low.
- Announces the winner and the number of attempts taken by each participant.

## How to Play
1. The game prompts the user to guess a number between 1 and 100.
2. The user inputs their guess.
3. The computer makes its guess using a binary search approach.
4. The game provides feedback after each guess:
    - If the guess is lower than the target number, it will display "OOPS!! It's Lower than your/Computer's Guess :(".
    - If the guess is higher than the target number, it will display "Guess becomes Higher!!!".
    - If the guess is correct, it will display "WOHOO!!! You got it" or "Computer got it!" and end the game.
5. The game continues until either the user or the computer guesses the number correctly.
6. The game announces the winner and the number of attempts taken.

## Installation
1. Clone the repository:
    ```sh
    git clone https://github.com/imridd/GuessGame.git
    ```
2. Navigate to the project directory:
    ```sh
    cd GuessGame
    ```
3. Compile the Java program:
    ```sh
    javac GuessGame.java
    ```
4. Run the game:
    ```sh
    java GuessGame
    ```

## Contributing
If you would like to contribute to this project, please fork the repository and submit a pull request. Contributions are welcome!

## License
This project is licensed under the MIT License.

## Contact
For any questions or suggestions, please contact [ridha6753@gmail.com].

