package javacollections;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class Test10 {
    public static void main(String[] args) {
        LinkedHashSet obj = new LinkedHashSet<>();
        obj.add("Alex");
        obj.add("Alen");
        obj.add("Alen");
        obj.add("Vincent");
        obj.add("John");

        Iterator<String> it1 = obj.iterator();
        while ( it1.hasNext()){
            System.out.println(it1.next());
        }

    }
}
