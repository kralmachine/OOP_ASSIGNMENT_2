package oop_assıgnment_2;

import java.awt.Color;
import java.awt.Graphics;


public class Rectangle extends Parallelogram{

    public Rectangle() {
        
    }
    
    public Rectangle(double length,double width){
        super.setLength(length);
        super.setWidth(width);
    }

    @Override
    public double area() {
        return getLength()*getWidth();
    }

    @Override
    public double circumference() {
       return 2*(getLength()+getWidth());
    }
    
    public void drawRect(Graphics g){
        g.setColor(Color.BLACK);
        g.drawRect(220,90,(int)getLength(),(int)getWidth()); 
    }
  
}
