package Chap7;

public class Poly {
    public static void makeSomeNoise(Shape shape){
        shape.makeSound();
    }
    public static void main(String[] args){
        Triangle tri = new Triangle();
        Poly.makeSomeNoise(tri); //we can use polymorphism feature to pass a subclass where
        //super class is expected. but it doesn't call the method of subclass
    }
}
