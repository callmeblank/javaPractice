package Chap9;

public class AscendantDuck extends Duck{
    private String weapon;
    public AscendantDuck(){System.out.println("Ascendant Duck is created");}
    public AscendantDuck(String dWeapon){
        super();
        weapon = dWeapon;
    }
    //AscendantDuck inherits from Duck then i can also have name, age, weight
    //we can intialize it by using super with args
    public AscendantDuck(String dName, int dAge, double dWeight, String dWeapon){
        super(dName, dAge, dWeight);
    }
    //getter
    public String getWeapon(){return weapon;}

    //setter
    public void setWeapon(String dWeapon){weapon = dWeapon;}

    public void useWeapon(){System.out.println("Using " + weapon);}
    public static void main(String[] args){
        AscendantDuck littleDuck = new AscendantDuck("Firer");
        //when we call AscendatDuck(). it initialize Duck() part inside it first then create AscendantDuck part
        //we don't initialize Duck() part because compiler do it for use by calling super().
        littleDuck.useWeapon();
        AscendantDuck fullArmedDuck = new AscendantDuck("Luckas", 20, 15.5, "Reaper");
        System.out.println("Full armed duck");
        System.out.println("Name: " + fullArmedDuck.getName());
        System.out.println("Age: " + fullArmedDuck.getAge());
        System.out.println("Weapon: " + fullArmedDuck.getWeapon());
    }
}