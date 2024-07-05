import javax.swing.*;
import java.awt.*;
import java.util.Stack;

public class Officer {
    private static Color color;
    private static String shape;
    private static int x;
    private static int y;
    private static int width;
    private static int height;
    private static JPanel drawPanel;
    static Stack<Shape> shapesStack = new Stack<>();
    static Shape outlineShape = new Rectangle(0,0,0,0,Color.BLACK);

    public static Color getColor(){
        return color==null?Color.BLACK:color;
    }
    public static void setColor (Color color){
        Officer.color = color;
    }

    public static String getShape(){
        return shape==null?"Rectangle":shape;
    }

    public static void setShape(String shape){
        Officer.shape = shape;
    }

    public static int getX(){
        return x;
    }

    public static int getY(){
        return y;
    }

    public static void setX(int x){
        Officer.x = x;
    }

    public static void setY(int y){
        Officer.y = y;
    }

    public static int getWidth() {
        return width;
    }

    public static int getHeight() {
        return height;
    }

    public static void setWidth(int width) {
        Officer.width = width;
    }

    public static void setHeight(int height) {
        Officer.height = height;
    }

    public static void setDrawPanel(JPanel d){
        drawPanel = d;
    }

    public static void redrawPanel(){
        drawPanel.repaint();
    }
}
