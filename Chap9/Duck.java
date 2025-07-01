package Chap9;

public class Duck {
    private String name;
    private int age;
    private double weight;
    //if we don't write constructor the compiler writes it. it looks like this
    public Duck(){}
    //default constructor do job for us. it assigns default values for our instance variable
    //but if we want to set other values we can do it with parameters.
    public Duck(String dname, int dage, double dweight){
        name = dname;
        age = dage;
        weight = dweight;
    }
    //getter
    public String getName(){return name;}
    public int getAge(){return age;}
    public double getWeight(){return weight;}

    //setter
    public void setName(String dName){name = dName;}
    public void setAge(int dAge){age = dAge;}
    public void setWeight(double dWeight){weight = dWeight;}

    public void makeSound(){System.out.println("Quack quack");}
    public static void main(String[] args){
        //Duck() looks like an method, but it is not. It's constructor (code that runs when 
        //you instantiate)
        
        Duck myDuck = new Duck();
        
        myDuck.setAge(10);
        myDuck.setName("Me");
        myDuck.setWeight(12.3);
        Duck herDuck = new Duck("Bock", 2, 20.3);
        System.out.println("Her duck: ");
        System.out.println("name: " + herDuck.getName());
        System.out.println("Age: " + herDuck.getAge());
        System.out.println("weight: " + herDuck.getWeight());
    }
}
