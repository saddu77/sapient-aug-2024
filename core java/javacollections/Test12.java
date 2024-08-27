package javacollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;

class Manager implements Comparable<Manager>{
    int mgr_id;
    String mgr_name;
    public Manager(int mgr_id, String mgr_name) {
        this.mgr_id = mgr_id;
        this.mgr_name = mgr_name;
    }
    @Override
    public int compareTo(Manager m) {
        if(mgr_id == m.mgr_id){
            return 0;
        } else return -1;
    }
}

public class Test12 {
    public static void main(String[] args) {
        ArrayList<Manager> obj = new ArrayList<Manager>();
        obj.add(new Manager(101,"Vincent"));
        obj.add(new Manager(102,"Alex"));
        obj.add(new Manager(103,"Puneet"));
        Collections.sort(obj);

       for(Manager mgr : obj){//
           System.out.println(mgr.mgr_id + " " + mgr.mgr_name);
       }
    }
}
