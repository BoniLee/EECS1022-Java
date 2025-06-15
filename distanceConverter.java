package Test1;

public class distanceConverter {
	public static String distanceConverter(double cm) {
		double inch=cm/2.54;//input cm
		int feet=(int)inch/12;//calculate input inch =how many feet
		double reminderinch=inch-(feet*12);

		return String.format("%.2f cm is %d and %.2f in",cm, feet,reminderinch);
		
	}

	public static void main(String[] args) {
		System.out.println(distanceConverter(157.0));
		System.out.println(distanceConverter(57.15));
		System.out.println(distanceConverter(37.0));

	}

}
