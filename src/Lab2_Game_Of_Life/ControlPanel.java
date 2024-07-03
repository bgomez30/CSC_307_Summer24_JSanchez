import javax.swing.*;


/**
 * @author Toby Mui
 */

public class ControlPanel extends JPanel {
    private final Timer timer;

    public ControlPanel(Grid grid) {
        JButton startButton = new JButton("Start");
        JButton stopButton = new JButton("Stop");
        JButton resetButton = new JButton("Reset");

        timer = new Timer(500, e -> grid.updateGrid());

        startButton.addActionListener(e -> timer.start());

        stopButton.addActionListener(e -> timer.stop());

        resetButton.addActionListener(e -> {
            timer.stop();
            grid.resetGrid();
        });

        add(startButton);
        add(stopButton);
        add(resetButton);
    }
}