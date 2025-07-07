package Chap10;

public class Formatting {
    public static void main(String[] args){
        //insert commas into number and return that String
        String accountantThing = String.format("%, d", 1000000);
        System.out.println("Acoountant Thing: " + accountantThing);
    }
}
