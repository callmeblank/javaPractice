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
            //or we can create a folder
            File folderName = new File("Solder");
            // folderName.mkdir();
            //get absolute path
            System.out.println("Absolute path: " + folderName.getAbsolutePath());
            System.out.println("");
            //list contents of folder
            String[] Solders = folderName.list();
            for (int i = 0; i < Solders.length; ++i){
                int index = i + 1;
                System.out.println("Content number " + index + ": " + Solders[i]);
            }
            //and many more things
            fw.close();
        }catch(Exception ex){ex.printStackTrace();}
    }
}
