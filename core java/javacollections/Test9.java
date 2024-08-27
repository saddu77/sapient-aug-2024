package javacollections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Test9 {
    public static void main(String[] args) {
        Set<String> obj = new HashSet<>();
        obj.add("Alex");
        obj.add("John");
        obj.add("John");

        Iterator<String> it1 = obj.iterator();
        while ( it1.hasNext()){
            System.out.println(it1.next());
        }



    }
}
