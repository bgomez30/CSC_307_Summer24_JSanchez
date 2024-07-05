import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

public class MouseMotions implements MouseMotionListener {

    @Override
    public void mouseDragged(MouseEvent e) {
        int x = e.getX();
        int y = e.getY();

        switch(Officer.getShape()){
            case "Rectangle":
                OutlineRectangle rect = new OutlineRectangle(Officer.getX(), Officer.getY(), x - Officer.getX(),
                        y-Officer.getY(),Officer.getColor());
                Officer.outlineShape = rect ;
                break;
            case "Circle":
                OutlineCircle circ = new OutlineCircle(Officer.getX(), Officer.getY(), x - Officer.getX(),
                        y - Officer.getY(),Officer.getColor());
                Officer.outlineShape = circ;
                break;
            case "Arc":
                OutlineArc arc = new OutlineArc(Officer.getX(), Officer.getY(), x - Officer.getX(),
                        y - Officer.getY(),Officer.getColor());
                Officer.outlineShape = arc;
                break;
        }
        Officer.redrawPanel();
    }

    @Override
    public void mouseMoved(MouseEvent e) {
    }
}
