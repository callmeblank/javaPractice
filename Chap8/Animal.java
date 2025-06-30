package Chap8;

abstract public class Animal {
    public void roam(){System.out.println("Walking ...");}
    public void eat(){System.out.println("Mukbang...");}
    public void sleep(){System.out.println("Sleeping...");}
    
    //abstract method is a method that has to be overriden. why do we need abstract method?
    //why we don't just don't write it?. It's convenient to have a general method. what if programmer A decides
    //call it get_age. But programmer B wants to call it getAge()?.
    //and put in inside "superclass" like this to let the world outside knows all anime have this method.
    public  abstract void age();
    public static void main(String[] args){
        //it's not reasonable to instantiate an animal (How is it look like. what is it?)
        //so make it abstract prevent it from being instantiated
        System.out.println("Wellcome to the zoo");
    }
}
