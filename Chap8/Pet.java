package Chap8;

//an interface is a way to add pet-ness to other classes in other inheritance tree 
interface Pet {
    //all method defined here must be declared abstract. 
    //interface get you polymorphism. it works like how any super class. you can pass
    //what implement it where it is declared to be the type
    public abstract void beFriendly();    
    public abstract void greeting();
    public abstract void doSomething(Pet pet, int index);
}
