package javacollections;

import java.util.ArrayList;
import java.util.Iterator;

public class Test1 {
    public static void main(String[] args) {
//        BaseType <Type> obj = new BaseType<Type>();
        ArrayList<String> names_list =  new ArrayList<String>();
        names_list.add("Alex");
        names_list.add("John");
        names_list.add("Jimmy");
        names_list.add("Julie");


        System.out.println(names_list.get(0));
        System.out.println("===============================");

        for (int i = 0 ; i < names_list.size();i++){
            System.out.println(names_list.get(i));
        }
        System.out.println("===============================");

        Iterator itrObj = names_list.iterator();
        while (itrObj.hasNext()){
            System.out.println(itrObj.next());
        }
    }
}
