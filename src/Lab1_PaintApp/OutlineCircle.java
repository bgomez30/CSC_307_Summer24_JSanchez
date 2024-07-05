import java.awt.*;

//@Author: Bryan Gomez
public class OutlineCircle extends Shape {
    public OutlineCircle(int x, int y, int w, int h, Color color) {
        super(x, y, w, h, color);
    }

    @Override
    public void draw(Graphics x){
        x.setColor(getColor());
        x.drawOval(getX(),getY(),getW(),getH());
    }
}
