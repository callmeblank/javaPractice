package Chap14;

import java.io.*;

public class CardBox implements Serializable{
    private double height;
    private double width;
    //if LittleCardBox doesn't implement Serializable then i can't serialize CardBox
    //because it has LittleCardBox reference. then if some idiots don't implement it i am screwed
    //but we can also choose to skip it my mark it transient.
    private transient LittleCardBox myLittleCardBox = new LittleCardBox();
    public static void main(String[] args){
        //make a card box
        CardBox myBox = new CardBox();
        System.out.println("Card Box specification before serialization: ");
        System.out.println("card's height: " + myBox.getHeight());
        System.out.println("card's width: " + myBox.getWidth());

        //connect serialization thing and serialize
        try{
            FileOutputStream fos = new FileOutputStream("cardbox.ser");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(myBox);
            System.out.println("Serialization's sucess");
            oos.close();

        } catch (Exception ex){ex.printStackTrace();}

        //deserialize
        try{
            //just the inverse of connect serialization thing
            FileInputStream fis = new FileInputStream("cardbox.ser");
            ObjectInputStream ois = new ObjectInputStream(fis); // chain 2 istream
            CardBox restoredCardBox = (CardBox) ois.readObject();
            System.out.println("Deserialization's sucess");
            System.out.println("card's height: " + restoredCardBox.getHeight());
            System.out.println("card's width: " + restoredCardBox.getWidth());
            ois.close();
        }  catch (Exception ex){ex.printStackTrace();}
        
        
    }
    public double getHeight(){return height;}
    public double getWidth(){return width;}
    public LittleCardBox getLittleOne(){return myLittleCardBox;}
    public void setHeight(double h){height = h;}
    public void setWidth(double w){width = w;}
    CardBox(double h, double w){
        this.setHeight(h);
        this.setWidth(w);
    }
    CardBox(){
        this.setHeight(100);
        this.setWidth(100);
    }
}
