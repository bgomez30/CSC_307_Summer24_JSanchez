import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class PacManGame extends JFrame {

    private static final int WIDTH = 800;
    private static final int HEIGHT = 600;

    public PacManGame() {
        setTitle("Pac-Man Game");
        setSize(WIDTH, HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);

        GameBoard gameBoard = new GameBoard();
        add(gameBoard);
        addKeyListener(new KeyHandler(gameBoard));

        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(PacManGame::new);
    }

    private class GameBoard extends JPanel {
        private int pacManX = 100;
        private int pacManY = 100;

        public GameBoard() {
            setBackground(Color.BLACK);
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            drawGame(g);
        }

        private void drawGame(Graphics g) {
            g.setColor(Color.YELLOW);
            g.fillOval(pacManX, pacManY, 30, 30);
        }

        public void movePacMan(int dx, int dy) {
            pacManX += dx;
            pacManY += dy;
            repaint();
        }
    }

    private class KeyHandler implements KeyListener {
        private final GameBoard gameBoard;

        public KeyHandler(GameBoard gameBoard) {
            this.gameBoard = gameBoard;
        }

        @Override
        public void keyPressed(KeyEvent e) {
            int key = e.getKeyCode();
            switch (key) {
                case KeyEvent.VK_LEFT -> gameBoard.movePacMan(-10, 0);
                case KeyEvent.VK_RIGHT -> gameBoard.movePacMan(10, 0);
                case KeyEvent.VK_UP -> gameBoard.movePacMan(0, -10);
                case KeyEvent.VK_DOWN -> gameBoard.movePacMan(0, 10);
            }
        }

        @Override
        public void keyReleased(KeyEvent e) {}

        @Override
        public void keyTyped(KeyEvent e) {}
    }
}