package by.intexsoft.lesson02.inheritance;

import java.awt.*;

public class Box extends Rectangle{

    static {
        System.out.println("in the " + Box.class.getSimpleName() + " static initialization block");
    }

    {
        System.out.println("In the " + Box.class.getSimpleName() + " initialization block");
    }

    public Box(int leftTopCornerX, int leftTopCornerY, int height) {
        super(leftTopCornerX, leftTopCornerY, height, height);
        System.out.println("in the " + Box.class.getSimpleName() + " constructor");
    }

    @Override
    public void draw(Graphics g) {
        super.draw(g);
        System.out.println("in the " + Box.class.getSimpleName() + " draw()"  + " method");
    }
}
