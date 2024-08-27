package javacollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Test11 {
    public static void main(String[] args) {
        ArrayList<String> names_list =  new ArrayList<String>();
        names_list.add("Zeus");
        names_list.add("John");
        names_list.add("Alex");
        names_list.add("Jimmy");
        names_list.add("Juilie");

//        Collections.sort(names_list);
        Collections.sort(names_list,Collections.reverseOrder());

        Iterator itrObj = names_list.iterator();
        while (itrObj.hasNext()){
            System.out.println(itrObj.next());
        }
    }
}
