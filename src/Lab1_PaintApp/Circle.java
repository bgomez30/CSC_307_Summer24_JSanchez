import java.awt.*;

//@Author: Bryan Gomez
public class Circle extends Shape{
    public Circle(int x, int y, int w, int h, Color color) {
        super(x, y, w, h, color);
    }

    @Override
    public void draw(Graphics x){
        x.setColor(getColor());
        x.fillOval(getX(),getY(),getW(),getH());
    }
}
