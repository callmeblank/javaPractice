package Chap9;

public class Duck {
    String name;
    int age;
    double weight;
    //if we don't write constructor the compiler writes it. it looks like this
    public Duck(){}
    //default constructor do job for us. it assigns default values for our instance variable
    //but if we want to set other values we can do it with parameters.
    public Duck(String dname, int dage, double dweight){
        name = dname;
        age = dage;
        weight = dweight;
    }
    public static void main(String[] args){
        //Duck() looks like an method, but it is not. It's constructor (code that runs when 
        //you instantiate)
        
        Duck myDuck = new Duck();
        
        myDuck.age = 10;
        myDuck.weight = 20.3;
        Duck herDuck = new Duck("Bock", 2, 20.3);
        System.out.println("Her duck: ");
        System.out.println("name: " + herDuck.name);
        System.out.println("Age: " + herDuck.age);
        System.out.println("weight: " + herDuck.weight);
    }
}
