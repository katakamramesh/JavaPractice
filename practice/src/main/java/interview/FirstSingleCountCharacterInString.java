package interview;

import java.util.*;
import java.util.stream.Stream;

public class FirstSingleCountCharacterInString {
    public static void main(String[] args) {
        String temp = "sharingggeenr";
        char[] arr = temp.toCharArray();
        Map<Character,Integer> m = new LinkedHashMap<>();
        for(Character i :arr){
            m.merge(i, 1, Integer::sum);
        };

        for(var v : m.entrySet()){
            if(v.getValue().equals(1)) {
                System.out.println(v.getKey());
                return;
            }
        }

    }
}
