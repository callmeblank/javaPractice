package Chap10;

public class Sharing {
    //this static variable is intialized when JVM decides to load a class
    //it is intialized before any any variables, any method.
    //every instances of this class shares the same sCount variable
    private static int sCount = 0;
    //mark one variable as static final make it constants. just like Math.PI
    private static final String root = "God of all Duck";
    public Sharing(){
        sCount++;
        System.out.println("Sharing number " + sCount + " is created");
    }
    public int getNumber(){return sCount;}
    public static void main(String[] args){
        Sharing[] mySharing = new Sharing[6];
        for (int i = 0; i < 4; i++){
            Sharing share = new Sharing();
            mySharing[i] = share;
        }
        System.out.println("Root: " + root);
    }
}
