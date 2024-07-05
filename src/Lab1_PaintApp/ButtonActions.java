import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonActions implements ActionListener {
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() instanceof JCheckBoxMenuItem) {
            Officer.setShape(e.getActionCommand());
        } else if (e.getSource() instanceof JRadioButtonMenuItem) {
            JRadioButtonMenuItem RadioItem = (JRadioButtonMenuItem) e.getSource();
            switch (RadioItem.getText()) {
                case "Black":
                    Officer.setColor(Color.BLACK);
                    break;
                case "Red":
                    Officer.setColor(Color.RED);
                    break;
                case "Blue":
                    Officer.setColor(Color.BLUE);
                    break;
                case "Green":
                    Officer.setColor(Color.GREEN);
                    break;
                case "Yellow":
                    Officer.setColor(Color.YELLOW);
                    break;
                case "Orange":
                    Officer.setColor(Color.orange);
                    break;
                case "Pink":
                    Officer.setColor(Color.PINK);
                    break;
            }
        } else if (e.getSource() instanceof JMenuItem) {
            JMenuItem button = (JMenuItem) e.getSource();
            Officer.outlineShape = new Shape(0,0,0,0,Color.black); //delete outline
            switch (button.getActionCommand()) {
                case ("Undo"):
                    System.out.println("undo");
                    if (!Officer.shapesStack.isEmpty()) {
                        Officer.shapesStack.pop();
                    }
                    Officer.redrawPanel();
                    break;
                case ("Erase!"):
                    System.out.println("erase");
                    if (!Officer.shapesStack.isEmpty()) {
                        Officer.shapesStack.clear();
                    }
                    Officer.redrawPanel();
                    break;
            }
        }
    }
}
