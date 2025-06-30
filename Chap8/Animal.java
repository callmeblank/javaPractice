package Chap8;

abstract public class Animal {
    public void roam(){System.out.println("Walking ...");}
    public void eat(){System.out.println("Mukbang...");}
    public void sleep(){System.out.println("Sleeping...");}
    public static void main(String[] args){
        //it's not reasonable to instantiate an animal (How is it look like. what is it?)
        //so make it abstract prevent it from being instantiated
        System.out.println("Wellcome to the zoo");
    }
}
