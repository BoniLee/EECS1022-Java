package Test1;

public class temperatureConverter {
	public static String temperatureConverter(double fahrenheit) {
		
		double celsius=(5.0/9.0)*(fahrenheit-32.0);//double:加小数点
		celsius=Math.round(celsius*100.0)/100.0;//四舍五入，在这里可要可不要
		return String.format("Fahrenheit (%.2f) is equivalent to (%.2f) in Celsius",fahrenheit, celsius);
	}

	public static void main(String[] args) {
		System.out.println(temperatureConverter(100.0));
		System.out.println(temperatureConverter(10.0));
		System.out.println(temperatureConverter(49.0));
		// TODO Auto-generated method stub

	}

}
