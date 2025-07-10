package Chap14;

import java.io.FileWriter;
import java.io.File;

public class StringWriter {
    public static void main(String[] args){
        try{
            //i can use File to represent the string and still have ability to 
            //pass File object as parameter of Constructor of FileWriter
            File pathFile = new File("myName.txt");
            FileWriter fw = new FileWriter(pathFile);
            fw.write("Hummle");
            fw.close();
        }catch(Exception ex){ex.printStackTrace();}
    }
}
