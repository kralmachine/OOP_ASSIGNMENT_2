package oop_assıgnment_2;

public abstract class Shape2D {

    public static final double PI_NUMBER = Math.PI;

    public abstract double area();
    public abstract double circumference();

    private double radius;
    private double diameter;
    private double[] lengthOfSides;
    private double[] innerAngles;
    private double height;

    public Shape2D() {

    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if (radius < 18)
            radius = 20;
        this.radius = radius;  
    }

    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(double diameter) {
        if (diameter < 18)
            diameter = 20;
        this.diameter = diameter;
    }

    public double[] getLengthOfSides() {
        return lengthOfSides;
    }

    public void setLengthOfSides(double[] lengthOfSides) {
        if(lengthOfSides[0]>380)
            lengthOfSides[0]=320;
        this.lengthOfSides = lengthOfSides;
    }

    public double[] getInnerAngles() {
        return innerAngles;
    }

    public void setInnerAngles(double[] innerAngles) {
        if(innerAngles[0]>380)
            innerAngles[0]=320;
        this.innerAngles = innerAngles;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if (height < 18)
            height = 20;
        this.height = height;
    }
}
