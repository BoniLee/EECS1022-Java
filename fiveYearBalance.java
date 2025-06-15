package Test1;

public class fiveYearBalance {
	public static String fiveYearBalance(double balance, double interest) {
		double interestrate=interest/100.0;
		double finalprince=balance*Math.pow((1+interestrate), 5);
		return String.format( "The balance was %.2f with interest %.2f, after five years balance is %.2f",balance, interest,finalprince);
		
	}

	public static void main(String[] args) {
		System.out.println(fiveYearBalance(6000,4.25));
		System.out.println(fiveYearBalance(3000,3.50));
		System.out.println(fiveYearBalance(4000,2.25));
		// TODO Auto-generated method stub

	}

}
