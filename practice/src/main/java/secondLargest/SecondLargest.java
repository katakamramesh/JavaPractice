package secondLargest;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SecondLargest {

    public static void main(String sp[]){
        //1.Write Java Program to find Second Largest Number in an Array
        /*int arr[] = new int[]{4,2,1,6};
        int largest = 0;
        int secondLargest = 0;
        for(int i : arr){
            if(largest < i){
                secondLargest = largest;
                largest = i;
            }
        }

        System.out.println(secondLargest);*/

        //2.write a java program to count the occurrences of each character in string

        String temp = "yogesh";
        Map<Character, Integer> occurance = new HashMap();

        char arr [] = temp.toCharArray();
        for(char c : arr){
            if(occurance.get(c) != null){
                int value = occurance.get(c) + 1;
                occurance.put(c, value);
            }else{
                occurance.put(c, 1);
            }
        }

        System.out.println(occurance.toString());

    }
}
