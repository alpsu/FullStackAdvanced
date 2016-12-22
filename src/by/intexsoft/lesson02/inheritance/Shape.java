package by.intexsoft.lesson02.inheritance;

import java.awt.*;

public abstract class Shape {
    private int leftTopCornerX;
    private int leftTopCornerY;
    private int height;
    private int width;

    static {
        System.out.println("in the " + Shape.class.getSimpleName() + " static initialization block");
    }

    public Shape(int leftTopCornerX, int leftTopCornerY, int height, int width) {
        this.leftTopCornerX = leftTopCornerX;
        this.leftTopCornerY = leftTopCornerY;
        this.height = height;
        this.width = width;
        System.out.println("In the " + Shape.class.getSimpleName() + " constructor");
    }

    {
        System.out.println("In the " + Shape.class.getSimpleName() + " initialization block");
    }

    public abstract void draw(Graphics g);

    public int getLeftTopCornerX() {
        return leftTopCornerX;
    }

    public int getLeftTopCornerY() {
        return leftTopCornerY;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }
}
