package Chap8;

public class Wolf extends Cannie{
    //because we override age in Cannie class. so we don't need to override it again.that makes sense
    public static void main(String[] args){
        Wolf wolf = new Wolf();
        wolf.age();
    }
    
}
