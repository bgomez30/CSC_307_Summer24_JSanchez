import javax.swing.*;
import java.awt.*;

public class Homework extends JFrame {
    public static void main(String[] args) {
        Homework app = new Homework();
        app.setSize(800,600);
        app.setVisible(true);
        app.setResizable(false);
        app.setTitle("My Paint App");
    }

    public Homework(){
        ButtonActions actionNanny = new ButtonActions();
        //JMenu Initialization
        JMenuBar menuBar = new JMenuBar();

        //Color Menu
        JMenu colorMenu = new JMenu("Colors");
        ButtonGroup colorGroup = new ButtonGroup();
        String[] colorNames = {"Black", "Red", "Green", "Blue", "Yellow", "Orange", "Pink"};

        // Loop through color names, create and add JRadioButtonMenuItem to menu and group
        for (String colorName : colorNames) {
            JRadioButtonMenuItem colorItem = new JRadioButtonMenuItem(colorName);
            colorMenu.add(colorItem);
            colorGroup.add(colorItem);
            colorItem.addActionListener(actionNanny);
        }
        menuBar.add(colorMenu);

        //Shape Menu
        JMenu shapeMenu = new JMenu("Shape");
        ButtonGroup shapeGroup = new ButtonGroup();
        String[] shapeNames = {"Rectangle", "Circle", "Arc"};

        for (String shapeName: shapeNames){
            JCheckBoxMenuItem shapeItem = new JCheckBoxMenuItem(shapeName);
            shapeMenu.add(shapeItem);
            shapeGroup.add(shapeItem);
            shapeItem.addActionListener(actionNanny);
        }

        menuBar.add(shapeMenu);

        //Tool Menu
        JMenu toolMenu = new JMenu("Tools");
        JMenuItem undo = new JMenuItem("Undo");
        JMenuItem erase = new JMenuItem("Erase!");

        toolMenu.add(undo);
        toolMenu.add(erase);
        undo.addActionListener(actionNanny);
        erase.addActionListener(actionNanny);
        menuBar.add(toolMenu);

        setJMenuBar(menuBar);

        JPanel drawPanel = new DrawPanel();

        MouseActions mouseNanny = new MouseActions();
        MouseMotions mouseMotionNanny = new MouseMotions();
        drawPanel.addMouseMotionListener(mouseMotionNanny);
        drawPanel.addMouseListener(mouseNanny);
        Officer.setDrawPanel(drawPanel);

        BorderLayout b = new BorderLayout();
        setLayout(b);
        add(drawPanel, BorderLayout.CENTER);

    }
}