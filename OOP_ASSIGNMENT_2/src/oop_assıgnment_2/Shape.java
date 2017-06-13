package oop_assıgnment_2;

import java.awt.Graphics;
import javax.swing.JPanel;

public class Shape extends JPanel {

    private int drawValue;
    private static Circle circle;
    private static Rectangle rectangle;
    private static Square square;
    private static Parallelogram parallelogram;

    public Shape() {

    }

    public Shape(Circle circle, int drawValue) {
        this.circle = circle;
        this.drawValue = drawValue;
    }

    public Shape(Rectangle rectangle, int drawValue) {
        this.rectangle = rectangle;
        this.drawValue = drawValue;

    }

    public Shape(Square square, int drawValue) {
        this.square = square;
        this.drawValue = drawValue;
    }

    public Shape(Parallelogram parallelogram, int drawValue) {
        this.parallelogram = parallelogram;
        this.drawValue = drawValue;
    }

    public int getDrawValue() {
        return drawValue;
    }

    public void setDrawValue(int drawValue) {
        this.drawValue = drawValue;
    }

    @Override
    protected void paintComponent(Graphics g) {
        if (circle != null && drawValue == 1) {
            circle.drawCircle(g);
        }
        if (parallelogram != null && drawValue == 2) {
            parallelogram.drawParallelogram(g);
        }
        if (rectangle != null && drawValue == 3) {
            rectangle.drawRect(g);
        }
        if (square != null && drawValue == 4) {
            square.drawSquare(g);
        }
    }
}
