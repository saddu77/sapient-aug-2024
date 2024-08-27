package javacollections;

import java.util.Iterator;
import java.util.PriorityQueue;

public class Test7 {
    public static void main(String[] args) {
        PriorityQueue<String> obj = new PriorityQueue<String>();
        obj.add("Alex");
        obj.add("Alen");
        obj.add("Clare");
        obj.add("Jack");

        System.out.println("head: " + obj.element());
        System.out.println("=========================");
        Iterator<String> it1 = obj.iterator();
        while ( it1.hasNext()){
            System.out.println(it1.next());
        }
        System.out.println("========================");
        System.out.println(obj.peek());
        System.out.println("=========================");
        System.out.println(obj.poll());
        System.out.println("=========================");
        System.out.println(obj.peek());
        System.out.println("==========================");
        Iterator<String> it2 = obj.iterator();
        while ( it2.hasNext()){
            System.out.println(it2.next());
        }


    }
}
