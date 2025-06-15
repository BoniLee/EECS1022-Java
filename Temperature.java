package Test2;

public class Temperature {
	//private
	private double ftemp;
	
	//constructor（自动生成，自己改一点(去super())即可）
	public Temperature(double ftemp) {
		this.ftemp = ftemp;
	}


	//setFahrenheit(自动生成，自己改一点(名字）即可）
	public void Fahrenheit(double ftemp) {
		this.ftemp = ftemp;
	}
	//getFahrenheit(自动生成，自己改一点（名字）即可）
	public double getFahrenheit() {
		return ftemp;
	}
	
	//getCelsius (手动转换）
	public double getCelsius() {
		return (5.0 / 9.0) * (ftemp - 32);
	}
	//getKelvin(手动转换)
	public double getKelvin() {
		return  ((5.0 / 9.0) * (ftemp - 32)) + 273.15;
		
	}
	
	
	//getAll
	public double[] getAll(){
		double[] result= new double[3];
		result[0]=ftemp;
		result[1]=getCelsius();
		result[2]=getFahrenheit();
		return result;
	}



	public static void main(String[] args) {
		Temperature temp = new Temperature(32.0);
        double[] values = temp.getAll();
        for(double element:temp.getAll()) {
        	System.out.println(element);
        }
        System.out.println("Fahrenheit: " + values[0]);
        System.out.println("Celsius: " + values[1]);
        System.out.println("Kelvin: " + values[2]);
    }

	}
	
