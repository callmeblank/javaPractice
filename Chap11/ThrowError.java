package Chap11;

public class ThrowError {
    public int riskyRanDom(int index) throws Error{
        if (index == 0 || index == 1) throw new Error();
        return (int) (Math.random() * index);
    }
    public static void main(String[] args){
        ThrowError throwError = new ThrowError();
        try{
            System.out.println("Random number: " + throwError.riskyRanDom(0));
        } catch (Error er){
            System.out.println("Can't be random with 0 or 1");
            er.printStackTrace();
        }
    }
}
