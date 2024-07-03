import javax.swing.*;
import java.awt.*;

public class GameOfLife extends JFrame {

    public GameOfLife() {
        setTitle("Conway's Game of Life");
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        int ROWS = 20;
        int COLS = 20;
        Grid grid = new Grid(ROWS, COLS);
        add(grid, BorderLayout.CENTER);

        ControlPanel controlPanel = new ControlPanel(grid);
        add(controlPanel, BorderLayout.SOUTH);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new GameOfLife().setVisible(true));
    }
}