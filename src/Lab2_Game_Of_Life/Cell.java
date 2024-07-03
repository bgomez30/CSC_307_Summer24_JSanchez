import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Cell extends JPanel {
    private boolean alive;

    public Cell() {
        this.alive = false;
        setBackground(Color.WHITE);
        setBorder(BorderFactory.createLineBorder(Color.BLACK));

        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                alive = !alive;
                setBackground(alive ? Color.BLACK : Color.WHITE);
            }
        });
    }

    public boolean isAlive() {
        return alive;
    }

    public void setAlive(boolean alive) {
        this.alive = alive;
        setBackground(alive ? Color.BLACK : Color.WHITE);
    }
}