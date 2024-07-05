import java.awt.*;

//@Author: Bryan Gomez
public class OutlineRectangle extends Shape{

    public OutlineRectangle(int x, int y, int w, int h, Color color){
        super(x,y,w,h,color);
    }

    @Override
    public void draw(Graphics x){
        x.setColor(getColor());
        x.drawRect(getX(),getY(),getW(),getH());
    }
}
