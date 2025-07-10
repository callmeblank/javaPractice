package Chap12;

import javax.swing.*;
import java.awt.*;

public class MovingBall extends JPanel{
    JFrame frame;
    int x, y;
    public static void main(String[] args){
        MovingBall moving = new MovingBall();
        System.out.println(moving.isOpaque());
        moving.move();
    }
    public void move(){
        frame = new JFrame();
        frame.setBackground(Color.GREEN);
        //add ball
        frame.getContentPane().add(BorderLayout.CENTER, this);

        //display
        frame.setSize(350, 350);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        for (int i = 0 ; i < 300; i++){
            x++;
            y++;
            this.repaint();
            try{
                Thread.sleep(30);
            } catch (Exception ex){}
        }
    }
    MovingBall(){
        this.setOpaque(true);
    }
    public void paintComponent(Graphics g){
        //set background drakGray
        // g.setColor(Color.darkGray);
        // g.fillRect(0, 0, this.getWidth(), this.getHeight());

        //create a ball with x, y coordinate
        g.setColor(Color.CYAN);
        g.fillOval(x, y, 50, 50);
    }

}
