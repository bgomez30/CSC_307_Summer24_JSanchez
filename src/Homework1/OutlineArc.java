import java.awt.*;

//@Author: Bryan Gomez
public class OutlineArc extends Shape {
    public OutlineArc(int x, int y, int w, int h, Color color) {
        super(x, y, w, h, color);
    }

    @Override
    public void draw(Graphics x){
        x.setColor(getColor());
        x.drawArc(getX(), getY(), getW(), getH(),0, 180);
    }


}
