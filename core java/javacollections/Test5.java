package javacollections;

import java.util.Iterator;
import java.util.Vector;

public class Test5 {
    public static void main(String[] args) {
        Vector<String> obj = new Vector<String>();
        obj.add("Alex");
        obj.add("Alen");
        obj.add("Aashish");
        obj.add("Vinod");

        Iterator<String> it = obj.iterator();
        while ( it.hasNext()){
            System.out.println(it.next());
        }
    }
}
