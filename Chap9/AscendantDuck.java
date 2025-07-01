package Chap9;

public class AscendantDuck extends Duck{
    String weapon;
    public AscendantDuck(){System.out.println("Ascendant Duck is created");}
    public AscendantDuck(String dWeapon){
        super();
        weapon = dWeapon;
    }
    public void useWeapon(){System.out.println("Using " + weapon);}
    public static void main(String[] args){
        AscendantDuck littleDuck = new AscendantDuck("Firer");
        //when we call AscendatDuck(). it initialize Duck() part inside it first then create AscendantDuck part
        //we don't initialize Duck() part because compiler do it for use by calling super().
        littleDuck.useWeapon();
    }
}