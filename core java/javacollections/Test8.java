package javacollections;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

public class Test8 {
    public static void main(String[] args) {
        Deque<String> obj = new ArrayDeque<>();
        obj.add("Alex");
        obj.add("Alen");
        obj.add("John");

        Iterator<String> it1 = obj.iterator();
        while ( it1.hasNext()){
            System.out.println(it1.next());
        }

    }
}
