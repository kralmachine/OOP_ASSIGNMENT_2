package oop_assıgnment_2;

import java.awt.Color;
import java.awt.Graphics;

public class Square extends Rectangle {

    public Square() {

    }

    public Square(double lengthOfSide) {
        super.setLengthOfSide(lengthOfSide);
    }

    public double area() {
        return getLengthOfSide() * getLengthOfSide();
    }

    @Override
    public double circumference() {
        return 4 * getLengthOfSide();
    }

    public void drawSquare(Graphics g) {
        g.setColor(Color.BLACK);
        g.drawRect(350, 90, (int) getLengthOfSide(), (int) getLengthOfSide());
    }
}
