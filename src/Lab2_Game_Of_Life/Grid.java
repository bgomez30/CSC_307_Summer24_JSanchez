import javax.swing.*;
import java.awt.*;

/**
 * @author Bryan Gomez
 */
public class Grid extends JPanel {
    private final int ROWS;
    private final int COLS;
    private final Cell[][] cells;

    public Grid(int rows, int cols) {
        this.ROWS = rows;
        this.COLS = cols;
        this.cells = new Cell[ROWS][COLS];
        setLayout(new GridLayout(ROWS, COLS));
        setBackground(Color.GRAY);
        initializeGrid();
    }

    private void initializeGrid() {
        for (int row = 0; row < ROWS; row++) {
            for (int col = 0; col < COLS; col++) {
                cells[row][col] = new Cell();
                add(cells[row][col]);
            }
        }
    }

    public void updateGrid() {
        boolean[][] nextGen = new boolean[ROWS][COLS];

        for (int row = 0; row < ROWS; row++) {
            for (int col = 0; col < COLS; col++) {
                int aliveNeighbors = countAliveNeighbors(row, col);
                if (cells[row][col].isAlive()) {
                    nextGen[row][col] = aliveNeighbors == 2 || aliveNeighbors == 3;
                } else {
                    nextGen[row][col] = aliveNeighbors == 3;
                }
            }
        }

        for (int row = 0; row < ROWS; row++) {
            for (int col = 0; col < COLS; col++) {
                cells[row][col].setAlive(nextGen[row][col]);
            }
        }
    }

    private int countAliveNeighbors(int row, int col) {
        int count = 0;
        for (int i = -1; i <= 1; i++) {
            for (int j = -1; j <= 1; j++) {
                if (i == 0 && j == 0) continue;
                int r = row + i;
                int c = col + j;
                if (r >= 0 && r < ROWS && c >= 0 && c < COLS && cells[r][c].isAlive()) {
                    count++;
                }
            }
        }
        return count;
    }

    public void resetGrid() {
        for (int row = 0; row < ROWS; row++) {
            for (int col = 0; col < COLS; col++) {
                cells[row][col].setAlive(false);
            }
        }
    }
}