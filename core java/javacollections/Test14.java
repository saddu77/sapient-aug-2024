package javacollections;

import java.util.ArrayList;

class Emp{
    int emp_id;
    String emp_name;
    String emp_country;
    public Emp(int emp_id, String emp_name, String emp_country) {
        this.emp_id = emp_id;
        this.emp_name = emp_name;
        this.emp_country = emp_country;
    }
    void display(){
        System.out.println(emp_id + " " + emp_name + " " + emp_country);
    }
}
public class Test14 {
    public static void main(String[] args) {
        ArrayList<Emp> empList = new ArrayList<Emp>();
        Emp obj1 = new Emp(101,"Alex","India");
        Emp obj2 = new Emp(102,"John","UK");
        Emp obj3 = new Emp(103,"Jimmy","USA");
        empList.add(obj1);
        empList.add(obj2);
        empList.add(obj3);

        for(Emp e: empList){
            e.display();
            System.out.println();
        }
    }
}
