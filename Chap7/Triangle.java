package Chap7;
public class Triangle extends Shape{
    public void rotate(){System.out.println("Rotate by order of Peaky Blinder");}
    public static void main(String[] args){
        Triangle tri = new Triangle();
        tri.rotate();
        tri.makeSound();
    }
}
