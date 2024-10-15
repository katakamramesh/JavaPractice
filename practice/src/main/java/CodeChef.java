import java.util.*;
import java.lang.*;

class Codechef
{
    public static void main(String[] args) throws java.lang.Exception
    {

        String name = "civic";
        char c[] = name.toCharArray();
        int counter = 0;
        Set<String> set = new HashSet < > ();

        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < c.length; j++) {
                String temp = name.substring(i, j+1);
                //c,ci,civ,civi,civic,i,iv,ivi,ivic,v,vi,vic,i,ic,c
                set.add(temp.toString());
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