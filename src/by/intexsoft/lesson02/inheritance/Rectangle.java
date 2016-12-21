package by.intexsoft.lesson02.inheritance;

import java.awt.*;

public class Rectangle extends Shape{
    public Rectangle(int leftTopCornerX, int leftTopCornerY, int height, int width) {
        super(leftTopCornerX, leftTopCornerY, height, width);
    }

    @Override
    public void draw(Graphics g) {
        g.drawRect(getLeftTopCornerX(), getLeftTopCornerY(), getWidth(), getHeight());
    }
}
