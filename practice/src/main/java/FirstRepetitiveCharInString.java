import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FirstRepetitiveCharInString {
    public static void main(String[] args) {
        String temp = "valueess";
        System.out.println(Stream.of(temp));
        Set<Character> s = new HashSet<>();
        for(char c : temp.toCharArray()){
            if(s.contains(c)){
               // System.out.println("----" + c);
               // return ;
            }
            s.add(c);
        }


        LinkedHashMap<Character, Long> linkedMap =
                temp.chars().mapToObj(x -> (char)x).collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));
        Optional<Character> first = linkedMap.entrySet().stream().filter(count -> count.getValue() > 1).map(Map.Entry::getKey)
                .findFirst();
        /*temp.chars() -- this will give char
        maptoObj -- as char is a primitive type, it will convert in to object, because we need object for stream operation
        .collect -- to collect
        Collectors.groupingBy(Function.identity(),  -- this is for grouping by self, not based on any other condition
        LinkedHashMap::new, -- we need insertion order for the first one
        Collectors.counting()) -- we need the count grater than 1 as it is first repetitive char
        linkedMap.entrySet() -- iterate the key elements of map
        filter(count -> count.getValue() > 1) -- find the first duplicate value
        .map(Map.Entry::getKey) -- return the key
        .findFirst() -- only the first one
        */

        if(first.isPresent()){
            System.out.println(first.get() + " -------------------");
        }else {
            System.out.println("na");
        }

    }
}
