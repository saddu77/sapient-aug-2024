package javacollections;

import java.util.Iterator;
import java.util.Stack;

public class Test6 {
    public static void main(String[] args) {
        Stack<String> obj = new Stack<>();
        obj.push("Alex");
        obj.push("Alen");
        obj.push("Bob");
        obj.push("Kevin");

        Iterator<String> it = obj.iterator();
        while ( it.hasNext()){
            System.out.println(it.next());
        }
        obj.pop();
        System.out.println("====================");
        Iterator<String> it1 = obj.iterator();
        while ( it1.hasNext()){
            System.out.println(it1.next());
        }

    }
}
