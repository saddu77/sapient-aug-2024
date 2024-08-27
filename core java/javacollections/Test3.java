package javacollections;

import java.util.ArrayList;

public class Test3 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Alex");
        list.add("John");
//        list.add(40);

        String s1 = (String) list.get(0);
        String s2 = (String) list.get(1);
//       String s3 = (String)list.get(2);
    }
}
