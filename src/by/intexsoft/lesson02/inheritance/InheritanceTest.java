package by.intexsoft.lesson02.inheritance;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class InheritanceTest extends Frame{
    InheritanceTest(String title) {
        super(title);
        setSize(500, 500);
        setVisible(true);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                super.windowClosing(e);
                System.exit(0);
            }
        });

    }

    public void paint(Graphics g) {
        Shape shapeOne = new Rectangle(20, 200, 20, 70);
        Shape shapetwo = new Box(120, 200, 50);
        shapeOne.draw(g);
        shapetwo.draw(g);
    }


    public static void main(String[] args) {
        new InheritanceTest("Testing inheritance");
    }

}
