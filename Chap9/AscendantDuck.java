package Chap9;

public class AscendantDuck extends Duck{
    String weapon;
    public AscendantDuck(){System.out.println("Ascendant Duck is created");}
    public AscendantDuck(String dWeapon){weapon = dWeapon;}
    public void useWeapon(){System.out.println("Using " + weapon);}
    public static void main(String[] args){
        AscendantDuck littleDuck = new AscendantDuck("Firer");
        //when we call AscendatDuck(). it initialize Duck() part inside it first then create AscendantDuck part
        littleDuck.useWeapon();
    }
}