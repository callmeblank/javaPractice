package Chap7;

public class Shape {
    public void rotate(){System.out.println("Rotate 90 degree");}
    public void makeSound(){System.out.println("Bip bip bip");}
    public static void main(String[] args){
        Shape generalShape = new Shape();
        generalShape.rotate();
        generalShape.makeSound();
    }
}
