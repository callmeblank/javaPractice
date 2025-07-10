package Chap14;

import java.io.FileWriter;

public class StringWriter {
    public static void main(String[] args){
        try{
            FileWriter fw = new FileWriter("myName.txt");
            fw.write("phuocNguyen");
            fw.close();
        }catch(Exception ex){ex.printStackTrace();}
    }
}
