package oop_assıgnment_2;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Path2D;

public class Parallelogram extends Shape2D {

    private double length, width;
    private double lengthOfSide;

    public Parallelogram() {

    }

    public Parallelogram(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getLengthOfSide() {
        return lengthOfSide;
    }

    public void setLengthOfSide(double lengthOfSide) {
        if (lengthOfSide < 18) {
            lengthOfSide = 20;
        }
        this.lengthOfSide = lengthOfSide;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        if (length < 18) {
            length = 20;
        }
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if (width < 18) {
            width = 20;
        }
        this.width = width;
    }

    @Override
    public double area() {
        return getWidth() * getLength();
    }

    @Override
    public double circumference() {
        return 2 * getLengthOfSides()[0] + 2 * getLengthOfSides()[1];
    }

    public void drawParallelogram(Graphics g) {
        g.setColor(Color.BLACK);
        Path2D.Double parallelogramDraw = new Path2D.Double();
        parallelogramDraw.moveTo(getWidth()/4, getHeight()/4);
        parallelogramDraw.lineTo(getWidth() / 4+getInnerAngles()[0], getHeight() / 4);
        parallelogramDraw.lineTo(getWidth() / 4+getInnerAngles()[0]+50+getInnerAngles()[1]/2, getHeight() / 4+getInnerAngles()[0]);
        parallelogramDraw.lineTo(getWidth() / 4+50+getLengthOfSides()[1]/2, getHeight() / 4+getInnerAngles()[0]);
        parallelogramDraw.closePath();
        Graphics2D g2draw = (Graphics2D) g;
        g2draw.draw(parallelogramDraw);
    }
}
