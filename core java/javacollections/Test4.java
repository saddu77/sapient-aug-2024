package javacollections;

import java.util.Iterator;
import java.util.LinkedList;

public class Test4 {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<String>();
        ll.add("John");
        ll.add("Julie");
        ll.add("Alex");
        ll.add("Clare");

        Iterator itrObj = ll.iterator();
        while (itrObj.hasNext()){
            System.out.println(itrObj.next());
        }

        ll.add(2,"Rahul");
        System.out.println("=========================");
        Iterator itrObj1 = ll.iterator();
        while (itrObj1.hasNext()){
            System.out.println(itrObj1.next());
        }

        ll.addFirst("Alen");
        ll.addLast("Zues");

        System.out.println("=========================");
        Iterator itrObj2 = ll.iterator();
        while (itrObj2.hasNext()){
            System.out.println(itrObj2.next());
        }
    }
}
