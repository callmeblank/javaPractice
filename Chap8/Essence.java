package Chap8;

public class Essence{
    public static Object getObject(Object a){
        return a;
    }
    public static void main(String[] args){
        Cat myCat = new Cat();
        //if you have a method that return an object. then object returned appear to lose its essence.
        //Like cat lose its catness. Following code will not be compiled
        //Cat notACat = getObject(myCat);
        Object notACat = getObject(myCat);
        //notACat can't call age() method defined in Feline class anymore.
        System.out.println(notACat.getClass());
        //But there's a way to cast object things back to my Cat
        Cat myBigCat = null;
        if (notACat instanceof Cat){
            System.out.println("A cat in disguise");
            myBigCat = (Cat) notACat;
        }
        
        myBigCat.age();
    }
}