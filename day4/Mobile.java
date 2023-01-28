package week1.day4;

public class Mobile {
	public void mobileSpec() {
		String mobileBrandName= "Oneplus 7T";
		System.out.println("The Mobile brand name is "+mobileBrandName );
		char mobileLogo = '+';
		System.out.println("The Mobile Logo is"+ mobileLogo);
		short noOfPieces = 20;
		System.out.println("The total number of pieces"+ noOfPieces);
		int modelNumber = 202;
		System.out.println("The model number is"+ modelNumber);
		long mobileImeiNumber = 9874236987498743l;
		System.out.println("The mobile Imei number is"+ mobileImeiNumber);
		float mobilePrice = 37999.9f;
		System.out.println("The Mobile price is"+ mobilePrice);
		boolean isDamaged= false;
		System.out.println("The mobile is damaged"+ isDamaged);
		
	}
	public static void main(String[] args) {
		Mobile b= new Mobile();
		b.mobileSpec();
	}

}
