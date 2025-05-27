package aggregation;

public class AggregateChild1 {
	float a1;
	float b1;
	float d;
	AggregateParentEx ref;
	public AggregateChild1(float a1, float b1, AggregateParentEx ref) {
		this.ref = ref;
		this.a1= a1;
		this.b1 =b1;
		d= a1+b1;
		
	}
	public void display() {
		System.out.println("Sum of integer numbers: "+ ref.c);
		System.out.println("Sum of float numbers: " +d);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AggregateParentEx obj2 = new AggregateParentEx(12,10);
		AggregateChild1 obj = new AggregateChild1(23.5f, 45.3f, obj2);
		obj.display();
		

	}

}
