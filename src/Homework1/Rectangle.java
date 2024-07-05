import java.awt.*;

//@Author: Bryan Gomez
public class Rectangle extends Shape{

    public Rectangle(int x, int y, int w, int h, Color color){
        super(x,y,w,h,color);
    }

    @Override
    public void draw(Graphics x){
        x.setColor(getColor());
        x.fillRect(getX(),getY(),getW(),getH());
    }
}
