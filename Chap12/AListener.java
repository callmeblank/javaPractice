package Chap12;
import java.awt.event.*;

public class AListener implements ActionListener{
    //i linked this AListener to button in SimpleGui1B to show that i can connect whatever i want
    public void actionPerformed(ActionEvent ae){
        System.out.println("Clicked");
    }
    
}
