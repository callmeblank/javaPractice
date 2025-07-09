package Chap12;
import javax.swing.*;

public class Framer {
    public static void main(String[] args){
        //make a jframe
        JFrame jFrame = new JFrame();

        //make a button
        JButton jButton = new JButton("click me");

        //default close when close window
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //add button in jFrame
        jFrame.getContentPane().add(jButton);

        //display Frame
        jFrame.setSize(300, 300);
        jFrame.setVisible(true);

    }
}
