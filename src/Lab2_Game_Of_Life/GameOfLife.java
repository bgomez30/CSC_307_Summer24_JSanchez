import javax.swing.*;
import java.awt.*;

/**
 * @author Toby Mui
 */



public class GameOfLife extends JFrame {

    public static final int ROWS = 20;
    public static final int COLS = 20;


    public GameOfLife() {
        setTitle("Conway's Game of Life");
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());


        Grid grid = new Grid(ROWS, COLS);
        add(grid, BorderLayout.CENTER);

        ControlPanel controlPanel = new ControlPanel(grid);
        add(controlPanel, BorderLayout.SOUTH);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new GameOfLife().setVisible(true));
    }
}