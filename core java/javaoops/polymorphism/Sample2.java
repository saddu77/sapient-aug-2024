package javaoops.polymorphism;
//Function OverRiding
class Bike{
	int speed;
	
	void speed() {
		System.out.println("Bike Speed is 60 km/hr");
	}
}

class Honda extends Bike{
	int speed;
	
	void speed() {
		System.out.println("Honda Bike Speed is 80 km/hr");
	}
}
public class Sample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bike obj = new Honda();
		obj.speed();
	}

}
