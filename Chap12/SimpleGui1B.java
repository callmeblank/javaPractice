package Chap12;
import javax.swing.*;
import java.awt.event.*;
public class SimpleGui1B implements ActionListener{
    //the button you want to listen
    JButton button;
    public static void main(String[] args){
        SimpleGui1B gui = new SimpleGui1B();
        gui.go();
    }
    public void go(){
        JFrame frame = new JFrame();
        button = new JButton("Click me");

        //add action listener here and you can connect this button with any listener you want
        AListener al = new AListener();
        button.addActionListener(al);

        frame.getContentPane().add(button);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);
        frame.setVisible(true);
    }

    //actionPerformed is abstract method from ActionListener interface
    public void actionPerformed(ActionEvent e){
        button.setText("You clicked");
    }
}