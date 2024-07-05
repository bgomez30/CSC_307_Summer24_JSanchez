import java.awt.*;

//@Author: Bryan Gomez
public class Arc extends Shape{
    public Arc(int x, int y, int w, int h, Color color) {
        super(x, y, w, h, color);
    }

    @Override
    public void draw(Graphics x){
        x.setColor(getColor());
        x.fillArc(getX(), getY(), getW(), getH(),0, 180);
    }




}
