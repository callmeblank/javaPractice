package Chap8;

//using keywork implements to use Pet interface
//a class can implements interfaces
public class Cat extends Feline implements Pet, Robot{
    public void beFriendly(){System.out.println("Cat is waving its tail");}
    public void greeting(){System.out.println("Hello human");}
    public void doSomething(Pet pet, int index){
        if (index == 1) {
            pet.beFriendly();
        }
        else{pet.greeting();}
    }
    public void lazeBeam(){System.out.println("Lazing ...");}
    public static void main(String[] args){
        Cat myCat = new Cat();
        myCat.beFriendly();
        Cat anotherCat = new Cat();
        anotherCat.greeting();
        myCat.doSomething(anotherCat, 1);
    }
}
