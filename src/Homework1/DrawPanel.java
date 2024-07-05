import javax.swing.*;
import java.awt.*;
public class DrawPanel extends JPanel{
    public DrawPanel() {
        setBackground(new Color(176,250,192));
    }

    @Override
    public void paintComponent(Graphics g){
        super.paintComponents(g);
        g.setColor(new Color(176, 250, 192));
        g.fillRect(0, 0, getWidth(), getHeight());
        g.setColor(Officer.getColor());

        //Index the stack
        for(int i = 0; i < Officer.shapesStack.size(); i++){
            Shape temp = Officer.shapesStack.get(i);
            temp.draw(g);
        }
        //Draw the outline
        Officer.outlineShape.draw(g);
    }
}
