package com.example.demo;

import java.util.*;
import java.util.stream.Collectors;

public class SampleTest {

    //Write a Java program that sorts HashMap by value.

    public static void main(String s[]){
        Map<Integer,String> map = new HashMap();
        map.put(1,"XYZ");
        map.put(2,"PQR");
        map.put(3,"ABC");


        List<Map.Entry<Integer,String>> list = new ArrayList<>(map.entrySet());
//1
        Collections.sort(list, new Comparator<Map.Entry<Integer, String>>() {
            @Override
            public int compare(Map.Entry<Integer, String> o1, Map.Entry<Integer, String> o2) {
                return o1.getValue().compareTo(o2.getValue());
            }
        });
        //2
        Collections.sort(list, (o1, o2) -> o1.getValue().compareTo(o2.getValue()));
        //3
        map.entrySet().stream().sorted((i1,i2) -> i1.getValue().compareTo(i2.getValue()))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1,e2) -> e1, LinkedHashMap::new));

        Map<Integer,String> map1 = new LinkedHashMap<>();

        for(Map.Entry<Integer,String> m : list){
            map1.put(m.getKey(),m.getValue());
        }
        map1.entrySet();
    }

}
