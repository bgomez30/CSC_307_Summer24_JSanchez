import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MouseActions implements MouseListener {

    public void mouseClicked(MouseEvent e) {

    }

    public void mousePressed(MouseEvent e) {
        int x = e.getX();
        int y = e.getY();
        Officer.setX(x);
        Officer.setY(y);
    }

    public void mouseReleased(MouseEvent e) {
        int x = e.getX();
        int y = e.getY();
        Officer.setWidth(x - Officer.getX());
        Officer.setHeight(y - Officer.getY());

        switch(Officer.getShape()){
            case "Rectangle":
                Rectangle rectangle = new Rectangle(Officer.getX(), Officer.getY(), Officer.getWidth(),
                        Officer.getHeight(),Officer.getColor());
                Officer.shapesStack.push(rectangle);
                break;
            case "Circle":
                Circle circle = new Circle(Officer.getX(), Officer.getY(), Officer.getWidth(),
                        Officer.getHeight(),Officer.getColor());
                Officer.shapesStack.push(circle);
                break;
            case "Arc":
                Arc arc = new Arc(Officer.getX(), Officer.getY(), Officer.getWidth(),
                        Officer.getHeight(),Officer.getColor());
                Officer.shapesStack.push(arc);
                break;
        }
        Officer.redrawPanel();
    }

    public void mouseEntered(MouseEvent e) {

    }

    public void mouseExited(MouseEvent e) {

    }
}
