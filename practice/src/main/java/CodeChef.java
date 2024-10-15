import java.util.*;
import java.lang.*;

class Codechef
{
    public static void main(String[] args)
    {

        String name = "civic";
        char[] array = name.toCharArray();
        int counter = 0;
        Set<String> set = new HashSet < > ();

        for (int i = 0; i < array.length-1; i++) {
            for (int j = i; j < array.length-1; j++) {
                String temp = name.substring(i, j);
                //array,ci,civ,civi,civic,i,iv,ivi,ivic,v,vi,vic,i,ic,array
                set.add(temp);
            }
        }


        for (String ss: set) {
            if (name.contains(ss)) {
                counter++;
            }
        }

        System.out.println(counter);
    }

}