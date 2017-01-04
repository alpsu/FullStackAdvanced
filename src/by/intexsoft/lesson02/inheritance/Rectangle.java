package by.intexsoft.lesson02.inheritance;

import java.awt.*;

public class Rectangle extends Shape{

    static {
        System.out.println("in the " + Rectangle.class.getSimpleName() + " static initialization block");
    }

    {
        System.out.println("In the " + Rectangle.class.getSimpleName() + " initialization block");
    }

    public Rectangle(int leftTopCornerX, int leftTopCornerY, int height, int width) {
        super(leftTopCornerX, leftTopCornerY, height, width);
        System.out.println("in the " + Rectangle.class.getSimpleName() + " constructor");
    }

    @Override
    public void draw(Graphics g) {
        g.drawRect(getLeftTopCornerX(), getLeftTopCornerY(), getWidth(), getHeight());
        System.out.println("in the " + Rectangle.class.getSimpleName() + " draw()"  + " method");
    }
}
