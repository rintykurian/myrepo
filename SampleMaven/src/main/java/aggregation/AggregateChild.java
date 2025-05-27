package aggregation;

public class AggregateChild {
	String address;
	String city;
	AggregateEx ref;// aggregation
	public AggregateChild(String address, String city, AggregateEx ref) {
		this.address= address;
		this.city = city;
		this.ref= ref;
	}
	public void display() {
		System.out.println("Name:" +ref.name);
	    System.out.println("Age: " +ref.age);
		System.out.println("Address:" +address);
		System.out.println("City:" +city);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AggregateEx obj1 = new AggregateEx("Rinty", 30);
		AggregateChild obj = new AggregateChild("Ernakulam", "Kochi", obj1);
		obj.display();
		
		

	}

}
