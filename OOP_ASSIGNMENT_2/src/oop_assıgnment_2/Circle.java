package oop_assıgnment_2;

import java.awt.Color;
import java.awt.Graphics;

public class Circle extends Shape2D{

    public Circle() {
    
    }
    
    public Circle(double radius) {
        super.setDiameter(2*radius);
        super.setRadius(radius);
    }
    @Override
    public double area() {
       return (int)(PI_NUMBER*getRadius()*getRadius());
    }

    @Override
    public double circumference() {
        return (int)(2*PI_NUMBER*getRadius());
    }
    
    public void drawCircle(Graphics g){
        g.setColor(Color.BLACK);
        g.drawOval((int)(350-getRadius()),(int) (100-getRadius()), (int)(2*getRadius()),(int)(2*getRadius()));
    }
  
    
}
