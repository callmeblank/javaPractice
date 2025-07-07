package Chap10;

public class TryMath {
    public static void main(String[] args){
        System.out.println("absolute: " + Math.abs(4.5)); // absolute value, can pass a double, a float, int or long
        System.out.println("absolute: " + Math.abs(-14.5));
        System.out.println("arccos of " + 0.5 + " is: " + Math.acos(0.5)); // return arccos of parameter (radiant)
        System.out.println("Sum: " + Math.addExact(120, 54)); //return sum of 2 parameters. take int int or lond long only
        System.out.println("arcsin of " + 0.5 + " is: " + Math.asin(0.5)); //return arcsin
        System.out.println("Theta in polar coordinate: " + Math.atan2(1, 1)); //return theta in r, theta coordinate
        System.out.println("cube root of 27 is: " + Math.cbrt(27)); //return cube root of parameter
        //etc
    }
}
