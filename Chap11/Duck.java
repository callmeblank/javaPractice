package Chap11;

public class Duck {
    //we ducks an exception here (Error). instead of handling it, we just "throw" it for
    //someone call it to handle
    public static int ranDuck(int index) throws Error{
        ThrowError throwError = new ThrowError();
        return throwError.riskyRanDom(index);
    }
    public static void main(String[] args) throws Error{ // now we have to handle exception in main
        //or we can just duck it (throw it)
        System.out.println("Ran duck: " + Duck.ranDuck(2));
    }
}
