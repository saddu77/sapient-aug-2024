package javaoops.polymorphism;
//Function Overloading 
class Vehicle{
	void running() {
		System.out.println("Bike is running at speed 60 kms/hr");
	}
	
	void running(int speed) {
		System.out.println("Bike is running at speed " +
							speed + "kms/hr");
	}
}

public class Sample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle obj = new Vehicle();
		obj.running(80);
		obj.running();
	}

}
