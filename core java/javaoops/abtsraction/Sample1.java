package javaoops.abtsraction;

abstract class Employee{
	int emp_id=101;
	String emp_name="Alex";
	String emp_email="alex@gmail.com";
	
	void getEmpDetails() {
		System.out.println(emp_id + " " + emp_name + " " + emp_email);
	}
	
	abstract void getSalaryDetails();	
}

class HR extends Employee{

	double sal = 46000;
	double bonus = 4000;
	
	@Override
	void getSalaryDetails() {
		// TODO Auto-generated method stub
		sal = sal + bonus;
		System.out.println("Emp Total salary is : " + sal );
	}	
}
public class Sample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HR obj = new HR();
		obj.getEmpDetails();
		obj.getSalaryDetails();
	}
}
