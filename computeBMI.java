package Test1;

public class computeBMI {
	public static double computeBMI(int pounds, int feet, int inches) {
		double kg=(double) pounds*0.453592;
		double m= (double) feet*0.3048+inches*0.0254;
		double BMI= Math.round(kg/Math.pow(m, 2)*100.0)/100.0;
		return BMI;
	}

	public static void main(String[] args) {
		System.out.println(computeBMI(75,15,45));
		System.out.println(computeBMI(80,13,45));
		System.out.println(computeBMI(135,7,45));

	}

}
