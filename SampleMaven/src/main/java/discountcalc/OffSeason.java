package discountcalc;

public class OffSeason extends OnSeason {
	public double discount(double price) {
		super.discount(4000);
		double disc = 0.15*price;
		System.out.println("Offseason Discount Amount: " +disc );
		return disc;
		
	}

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		OffSeason obj= new OffSeason();
		obj.discount(5000);
		

	}

}
