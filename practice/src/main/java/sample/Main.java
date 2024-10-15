package sample;

import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("hello, world");
        List l1 = new LinkedList();
        List l2 = new LinkedList();

        //CustomLinkedList l = new CustomLinkedList();
        /*StringBuffer sb = new StringBuffer();
        sb = (StringBuffer)l1.toString();
        int c1 = (Integer) sb.reverse();
        sb = (StringBuffer)l2.toString();
        int c2 = (Integer) sb.reverse();*/
        StringBuffer sb1 = new StringBuffer(l1.toString());
        StringBuffer sb2 = new StringBuffer(l2.toString());
        sb1 = sb1.reverse();
        //int total = l.add(sb1,sb2);
        //sb = total.toString().toReverse();

        /*for(int i : sb){
            l.add();
        }*/

        //return l;
    }
}