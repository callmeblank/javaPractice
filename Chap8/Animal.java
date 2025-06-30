package Chap8;

public class Animal {
    public void roam(){System.out.println("Walking ...");}
    public void eat(){System.out.println("Mukbang...");}
    public void sleep(){System.out.println("Sleeping...");}
    public static void main(String[] args){
        Animal anm = new Animal();
        anm.roam();
        anm.eat();
        anm.sleep();
    }
}
