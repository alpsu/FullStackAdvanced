package by.intexsoft.lesson02.inheritance;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class InheritanceTest extends Frame{
    InheritanceTest(String title) {
        super(title);
        setVisible(true);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                super.windowClosing(e);
                System.exit(0);
            }
        });
        setSize(500, 500);

    }

    public void paint(Graphics g) {
        System.out.println("Before creating Rectangle");
        Shape shapeOne = new Rectangle(20, 200, 20, 70);
        System.out.println("After creating Rectangle");
        System.out.println("-----------------------------------------------------------------------");
        System.out.println("Before creating Box");
        Shape shapetwo = new Box(120, 200, 50);
        System.out.println("After creating Rectangle");
        shapeOne.draw(g);
        shapetwo.draw(g);
    }


    public static void main(String[] args) {
        new InheritanceTest("Testing inheritance");
    }

}
