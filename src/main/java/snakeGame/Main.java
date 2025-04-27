package snakeGame;
import javax.swing.JFrame;

public class Main {

    private static final int Width = 800;
    private static final int Height = 600;

    public static void main(String[] args) {

        final JFrame frame = new JFrame("Snake Game");
        frame.setSize(Width, Height);
        SnakeGame snakeGame = new SnakeGame(Width, Height);
        frame.add(snakeGame);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setVisible(true);
        frame.pack();
        snakeGame.startGame();
    }
}