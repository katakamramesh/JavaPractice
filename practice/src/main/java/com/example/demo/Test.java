package com.example.demo;

public class Test {
    public static void main(String s[]){
        //Write a program to check a given String or Number is palindrome using most of the OOPS concepts
        Object o = "QWQ";
        Object o1 = 121;
        //if(o.toString().matches("0-9"))
        System.out.println("is String Palindrome---"+checkPalindrome(o));
        System.out.println("is String Palindrome---"+checkPalindrome(o1));
    }

    private static boolean checkPalindrome(Object o) {
        StringBuffer sb = new StringBuffer();
        sb.append(o);
        if(sb.reverse().equals(sb)){
            return true;
        }
        return false;
    }
}
