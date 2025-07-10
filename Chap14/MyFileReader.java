package Chap14;
import java.io.*;

public class MyFileReader {
    public static void main(String[] args){
        try{
            //File object to represents file
            File fileName = new File("BufferSoup.txt");
            //File Reader
            FileReader fileReader = new FileReader(fileName);
            //using buffer to increase efficiency
            BufferedReader bReader = new BufferedReader(fileReader);
            //print lines to terminal
            for (String line; (line = bReader.readLine()) != null;){
                System.out.println("Name: " + line);
            }
            bReader.close();
        } catch (Exception ex){ex.printStackTrace();}
    }
}
