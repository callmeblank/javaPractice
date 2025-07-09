package Chap12;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MyDrawPanel extends JPanel{
    JFrame frame;
    public static void main(String[] args){
        MyDrawPanel mdPanel = new MyDrawPanel();
        mdPanel.go();
    }
    public void go(){
        frame = new JFrame();

        //add MyDrawPanel and buttons
        MyDrawPanel mdPanel = new MyDrawPanel();
        JButton cButton = new JButton("Change color");
        frame.getContentPane().add(BorderLayout.CENTER, mdPanel);
        frame.getContentPane().add(BorderLayout.SOUTH, cButton);
        //connect cButton with Changing color.
        //This is better than let JPanel connect with cButton because it's not OO at all.
        cButton.addActionListener(new ChangingColor());
        

        //set things
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);
        frame.setVisible(true);
    }
    //this is abstract method from JPanel you have to implement. 
    //And you DON'T call it, it is called automatically, g is an object of Graphics2D (subclass of Graphics).
    public void paintComponent(Graphics g){
        Graphics2D g2d = (Graphics2D) g;
        //paint background of this
        g2d.fillRect(0, 0, this.getWidth(), this.getHeight());

        //make random Color
        //start color
        int sred = (int) (Math.random() * 256);
        int sgreen = (int) (Math.random() * 256);
        int sblue = (int) (Math.random() * 256);
        Color sColor = new Color(sred, sgreen, sblue);

        //end color
        int ered = (int) (Math.random() * 256);
        int egreen = (int) (Math.random() * 256);
        int eblue = (int) (Math.random() * 256);
        Color eColor = new Color(ered, egreen, eblue);

        //create gradient color
        GradientPaint gradientColor = new GradientPaint(70, 70, sColor, 150, 150, eColor);

        //set random color
        g2d.setPaint(gradientColor);
        g2d.fillOval(20, 50, 100, 100);
    }
    //This is called inner class. it is tied to MyDrawPanel object uniquely
    class ChangingColor implements ActionListener{
        public void actionPerformed(ActionEvent e){
            frame.repaint();
        }
    }
}
