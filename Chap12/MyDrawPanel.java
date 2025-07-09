package Chap12;

import javax.swing.*;
import java.awt.*;

public class MyDrawPanel extends JPanel  {
    
    public static void main(String[] args){
        JFrame frame = new JFrame();

        //add MyDrawPanel
        MyDrawPanel mdPanel = new MyDrawPanel();
        frame.getContentPane().add(mdPanel);

        //set things
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);
        frame.setVisible(true);
    }
    //this is abstract method from JPanel you have to implement. 
    //And you DON'T call it, it is called automatically, g is an object of Graphics2D (subclass of Graphics).
    public void paintComponent(Graphics g){
        //paint background of this
        g.fillRect(0, 0, this.getWidth(), this.getHeight());

        //make random Color
        int red = (int) (Math.random() * 256);
        int green = (int) (Math.random() * 256);
        int blue = (int) (Math.random() * 256);
        Color rColor = new Color(red, green, blue);

        //set random color
        g.setColor(rColor);
        g.fillOval(20, 50, 100, 100);
    }
}
