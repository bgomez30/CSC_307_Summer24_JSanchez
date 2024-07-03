import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 * @author Toby Mui
 */
public class Cell extends JPanel {
    private boolean alive;

    public Cell() {
        this.alive = false;
        setBackground(Color.GRAY);
        setBorder(BorderFactory.createLineBorder(Color.BLACK));

        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                alive = !alive;
                setBackground(alive ? Color.YELLOW : Color.GRAY);
            }
        });
    }

    public boolean isAlive() {
        return alive;
    }

    public void setAlive(boolean alive) {
        this.alive = alive;
        setBackground(alive ? Color.YELLOW : Color.GRAY);
    }
}