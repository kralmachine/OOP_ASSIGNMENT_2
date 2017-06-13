package oop_assıgnment_2;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.SwingUtilities;

public class Main extends JFrame {

    private static final int WIDTH = 710, HEIGHT = 610;

    private static JComboBox box;

    private static JTextArea shapeInfo;

    private static Random random;

    private static Circle circle;

    private static Square square;

    private static Rectangle rectangle;

    private static Parallelogram parallelogram;

    private static Shape shape;

    public static void main(String[] args) {

        JFrame frame = new JFrame("141180501-ABDULLAH AVŞAR-   -ASSIGNMENT 2-");
        frame.setSize(new Dimension(WIDTH, HEIGHT));
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //////////////////////////////////////////
        JPanel sizePanel = new JPanel();
        JPanel jtopPanel = new JPanel();
        jtopPanel.setLayout(new GridLayout(2, 1));
        jtopPanel.add(sizePanel);
        /////////////////////////////////////////
        frame.getContentPane().add(jtopPanel, BorderLayout.NORTH);
        /////////////////////////////////////////
        random = new Random();
        /////////////////////////////////////////
        box = new JComboBox();
        box.addItem("--CHOOSE A SHAPE--");
        box.addItem("--CIRCLE--");
        box.addItem("--PARALLELOGRAM--");
        box.addItem("--RECTANGLE--");
        box.addItem("--SQUARE--");
        box.addItem("--QUIT--");
        frame.add(box);
        ////////////////////////////////////////
        shapeInfo = new JTextArea(8, 40);
        shapeInfo.setLocation(200, 350);
        shapeInfo.setSize(300, 300);
        shapeInfo.setAutoscrolls(true);
        shapeInfo.setWrapStyleWord(true);
        shapeInfo.setLineWrap(true);
        shapeInfo.setEditable(false);
        JScrollPane kaydirme = new JScrollPane(shapeInfo);
        kaydirme.setLocation(200, 350);
        kaydirme.setSize(300, 350);
        kaydirme.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        frame.add(kaydirme);
        sizePanel.add(box);
        sizePanel.add(kaydirme);
        /////////////////////////////////////////
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
              frame.setVisible(true);
           }
        });
        /////////////////////////////////////////
        box.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JComboBox getCommand = (JComboBox) e.getSource();
                Object getAction = getCommand.getSelectedItem();
                switch (getAction.toString()) {
                    case "--CIRCLE--":
                        shapeInfo.setText("");
                        rectangle=null;
                        square=null;
                        parallelogram=null;
                        circle = new Circle(random.nextInt(100));
                        shapeInfo.append("CIRCLE");
                        shapeInfo.append("\n---------------\n");
                        shapeInfo.append("Radius :" + circle.getRadius() + "\n");
                        shapeInfo.append("Diameter :" + circle.getDiameter() + "\n");
                        shapeInfo.append("Area :" + circle.area() + "\n");
                        shapeInfo.append("Circumference :" + circle.circumference());
                        shapeInfo.append("\n---------------");
                        shape = new Shape(rectangle, 3);
                        shape = new Shape(square, 4);
                        shape = new Shape(parallelogram, 2);
                        shape = new Shape(circle, 1);
                        shape.setPreferredSize(new Dimension(700, 300));
                        frame.getContentPane().add(shape, BorderLayout.CENTER);                      
                        frame.pack();
                        break;
                    case "--PARALLELOGRAM--":
                        shapeInfo.setText("");
                        rectangle=null;
                        square=null;
                        circle=null;
                        parallelogram = new Parallelogram(random.nextInt(100), random.nextInt(100));
                        //////////////////////////////////////////
                        int setLengthOfSides1=random.nextInt(150);
                        int setLengthOfSides2=random.nextInt(150);
                        //////////////////////////////////////////
                        int setInnerAngles1=setLengthOfSides1+100;
                        int setInnerAngles2=setLengthOfSides1+125;
                        /////////////////////////////////////////
                        parallelogram.setLengthOfSides(new double[]{setLengthOfSides1,setLengthOfSides2});
                        parallelogram.setInnerAngles(new double[]{setInnerAngles1,setInnerAngles2});
                        parallelogram.setHeight((parallelogram.getInnerAngles()[0]+parallelogram.getInnerAngles()[1])/2);
                        /////////////////////////////////////////
                        shapeInfo.append("PARALLELOGRAM");
                        shapeInfo.append("\n---------------\n");
                        shapeInfo.append("Height :" + parallelogram.getHeight() + "\n");
                        shapeInfo.append("Length of Sides :" + parallelogram.getLengthOfSides()[0] + "--" + parallelogram.getLengthOfSides()[1]+"\n");
                        shapeInfo.append("Inner Angles :" + parallelogram.getInnerAngles()[0] + "--" + parallelogram.getInnerAngles()[1]+ "\n");
                        shapeInfo.append("Area :" + parallelogram.area() + "\n");
                        shapeInfo.append("Circumference :" + parallelogram.circumference());
                        shapeInfo.append("\n---------------");
                        shape = new Shape(rectangle, 3);
                        shape = new Shape(square, 4);
                        shape = new Shape(circle, 1);
                        shape = new Shape(parallelogram, 2);
                        shape.setPreferredSize(new Dimension(700, 300));
                        frame.getContentPane().add(shape, BorderLayout.CENTER);
                        frame.pack();
                        break;
                    case "--RECTANGLE--":
                        shapeInfo.setText("");
                        square=null;
                        circle=null;
                        parallelogram=null;
                        rectangle = new Rectangle(random.nextInt(100), random.nextInt(100));
                        shapeInfo.append("RECTANGLE");
                        shapeInfo.append("\n---------------\n");
                        shapeInfo.append("Length :" + rectangle.getWidth()+ "\n");
                        shapeInfo.append("Width :" + rectangle.getLength()+ "\n");
                        shapeInfo.append("Area :" + rectangle.area() + "\n");
                        shapeInfo.append("Circumference :" + rectangle.circumference());
                        shapeInfo.append("\n---------------");
                        shape = new Shape(square, 4);
                        shape = new Shape(parallelogram, 2);
                        shape = new Shape(circle, 1);
                        shape = new Shape(rectangle, 3);
                        shape.setPreferredSize(new Dimension(700, 300));
                        frame.getContentPane().add(shape, BorderLayout.CENTER);
                        frame.pack();      
                        break;
                    case "--SQUARE--":
                        shapeInfo.setText("");
                        rectangle=null;
                        parallelogram=null;
                        circle=null;
                        square = new Square(random.nextInt(100));
                        shapeInfo.append("SQUARE");
                        shapeInfo.append("\n---------------\n");
                        shapeInfo.append("Length Of Side :" + square.getLengthOfSide() + "\n");
                        shapeInfo.append("Area :" + square.area() + "\n");
                        shapeInfo.append("Circumference :" + square.circumference());
                        shapeInfo.append("\n---------------");
                        shape = new Shape(rectangle, 3);
                        shape = new Shape(parallelogram, 2);
                        shape = new Shape(circle, 1);
                        shape = new Shape(square, 4);
                        shape.setPreferredSize(new Dimension(700, 300));
                        frame.getContentPane().add(shape, BorderLayout.CENTER);
                        frame.pack();
                        break;
                    case "--QUIT--":
                        System.exit(0);
                        shape = new Shape();
                        break;
                    default:
                        rectangle=null;
                        square=null;
                        parallelogram=null;
                        circle = null;
                        shape = new Shape(rectangle, 3);
                        shape = new Shape(parallelogram, 2);
                        shape = new Shape(circle, 1);
                        shape = new Shape(square, 4);
                        shape.setPreferredSize(new Dimension(700, 300));
                        frame.getContentPane().add(shape, BorderLayout.CENTER);
                        frame.pack();
                        shapeInfo.setText("");
                        shapeInfo.append("ERROR! PLEASE DIFFERENT CHOOSE A STATE");
                        shape = new Shape();
                        break;
                }
              frame.getContentPane().validate();
              frame.getContentPane().repaint();
            }
        });
    }
}
