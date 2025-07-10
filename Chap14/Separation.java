package Chap14;

public class Separation {
    public static void main(String[] args){
        String toTest = "What is this?/GodofKeios";
        String[] result = toTest.split("/");
        for (String s : result){
            System.out.println(s);
        }
    }
}
