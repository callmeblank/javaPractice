package Chap7;
public class Triangle extends Shape{
    public void rotate(){System.out.println("Rotate by order of Peaky Blinder");}
    //This is not an override method. it's an overload function
    //to be an override method.
    //1. args must be the same, and return type must be compatible
    //compatible means you can return a subclass where superclass is expected
    //2. The method can't be less accessible. because if compiler see method in superclass is public.
    //but at the run time. jvm tell compiler that method is actually private, such a shock to compiler.
    public void makeSound(int i){
        if (i == 0){
            System.out.println("pip pip pip...");
        } else if (i == 1){
            System.out.println("Emergency Thing happens");
        } else{
            System.out.println("Have a good day");
        }
    }
    public static void main(String[] args){
        Triangle tri = new Triangle();
        tri.rotate();
        tri.makeSound();
    }
}
