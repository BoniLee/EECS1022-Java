package Test1;

public class ageInYearsDetailed {
	public static String ageInYearsDetailed(int days) {
		int year= days/365;
		int month=(days-year*365)/30;
		int remainingday=days-(year*365)-(month*30);
		return String.format("Age in days (%d), age in years is (%d), months (%d), with remaining days (%d)", days,year,month,remainingday);
	}
		

	public static void main(String[] args) {
		System.out.println(ageInYearsDetailed(7000));
		

	}

}
