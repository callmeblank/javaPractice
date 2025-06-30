package Chap8;

public class AnimalArray{
    //we want to make an array that contains everything. even with AnimalArray can contain every object has type
    //is a subclass of Animal but it can't contain something else like guitar.
    //but here's the shock truth. Every class doesn't extends any class extends Object class implicitly.
    //that's how ArrayList have ability to contain everything
    private Animal[] animals = new Animal[5]; //this line will not create object. because Animal is abstract/
    //but we can create an array declared to hold that type
    private int nextIndex = 0;

    public int add(Animal a){
        if (nextIndex < animals.length){
            animals[nextIndex] = a;
            System.out.println("Animal added at index " + nextIndex);
            nextIndex++;
            return 1;
        }
        System.out.println("Out of range error");
        return 0;
    }
    public static void main(String[] args){
        AnimalArray animalList = new AnimalArray();
        Wolf wolf = new Wolf();
        Hippo hippo = new Hippo();
        Tiger tiger = new Tiger();
        Cat cat = new Cat();
        Tiger tiger2 = new Tiger();
        animalList.add(wolf);
        animalList.add(hippo);
        animalList.add(tiger);
        animalList.add(tiger);
        animalList.add(cat);
        animalList.add(tiger2);
    }
}