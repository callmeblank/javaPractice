package Chap10;

public class Which {
    private int size;
        public int getSize(){return size;}
    public static void duck(){
        // System.out.println("This is the size: " + size);
        // System.out.println("This is the size: " + getSize());
        //this is not compiled since we refer size from static method.
        //we also can't call non-static method from static method
        //what about calling a non-static method that doesn't use any instance variable?
        //compiler still doesn't compile it, because you tell the world that method is non-static
        //you can't use it in static method. what if one day someone subclass that class and
        //overide method so it uses instance variable?
    }
}
