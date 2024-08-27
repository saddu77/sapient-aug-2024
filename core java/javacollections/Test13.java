package javacollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Employee{
    int emp_id;
    String emp_name;

    public Employee(int emp_id, String emp_name) {
        this.emp_id = emp_id;
        this.emp_name = emp_name;
    }
}

class NameComparator implements Comparator<Employee>{
    @Override
    public int compare(Employee o1, Employee o2) {
        return  o1.emp_name.compareTo(o2.emp_name);
    }
}
public class Test13 {
    public static void main(String[] args) {
        ArrayList<Employee> obj = new ArrayList<>();
        obj.add(new Employee(101,"Komal"));
        obj.add(new Employee(102,"Alex"));

        Collections.sort(obj,new NameComparator());

        for (Employee e: obj){
            System.out.println(e.emp_id + " " + e.emp_name);
        }


    }
}
