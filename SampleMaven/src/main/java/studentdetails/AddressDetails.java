package studentdetails;

public class AddressDetails {
	String address;
	StudentDetails ref;
	public AddressDetails(String address, StudentDetails ref) {
		this.ref= ref;
		this.address= address;
	}
	public void display() {
		System.out.println("Student Name : " + ref.studentName);
		System.out.println("Roll No : " +ref.rollNumber);
		System.out.println("Address : " + address);	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentDetails obj = new StudentDetails("Riya", 15);
		AddressDetails obj1 = new AddressDetails("66, D.D bazar,\n"
				+ "Gopala Prabhu Rd,\n"
				+ "Ernakulam,\n"
				+ "Kerala 682035", obj);
		obj1.display();

	}

}
