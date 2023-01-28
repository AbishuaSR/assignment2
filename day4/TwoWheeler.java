package week1.day4;

public class TwoWheeler {
	public  void twoWheeler() {
		int noOfWheels=2;
		System.out.println("The total number of wheels is "+ noOfWheels);
		short noOfMirrors=2;
		System.out.println("The total number of mirrors is"+ noOfMirrors);
		long chassisNumber=872166842398l;
		System.out.println("The chassis Number is"+   chassisNumber);
		boolean isPunctured=false;
		System.out.println("The wheel was punctured"+ isPunctured );
		String bikeName= "Kawasaki Z900";
		System.out.println("The Bike name is"+ bikeName);
		double runningKm= 79823.5d;
		System.out.println("The total running km"+ runningKm);
	}
	public static void main(String[] args) {
		TwoWheeler a = new TwoWheeler();
		a.twoWheeler();
	}
	

}
