package Chap10;
import java.util.*;

public class Wrapper {
    public static void main(String[] args){
        //before java5.0 we have to can't use add directly with int. we use add(Integet(3)) instead.
        //because ArrayList return instance variable not primitive type. but now in java5.0 or latter
        //it is done automatically
        ArrayList<Integer> ages = new ArrayList<>();
        ages.add(3);
        ages.add(4);
        ages.add(6);
        ages.add(2);
        for (int i = 0; i < ages.size(); ++i){
            int displayIndex = i + 1;
            if (i == 0){
               System.out.println("Ages in " + displayIndex + "st position: " + ages.get(i)); 
            }
            else if (i == 1){
                System.out.println("Ages in " + displayIndex + "nd position: " + ages.get(i)); 
            }
            else if (i == 2){
                System.out.println("Ages in " + displayIndex + "rd position: " + ages.get(i)); 
            } else
                System.out.println("Ages in " + displayIndex + "th position: " + ages.get(i));
        }
    }
}
