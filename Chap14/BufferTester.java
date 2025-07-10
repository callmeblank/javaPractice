package Chap14;

import java.io.*;

public class BufferTester {
    public static void main(String[] args){
        //use buffer to increase efficiency. because dealing with memory is
        //much "easier" task than dealing with disk directly
        File fileName = new File("BufferSoup.txt");
        try{
            BufferedWriter bWriter = new BufferedWriter(new FileWriter(fileName));
            bWriter.write("Hummble\nJinx\nKeios\nJohn");
            bWriter.close();
        } catch(Exception ex){
            ex.printStackTrace();
        }
        

    }
}
