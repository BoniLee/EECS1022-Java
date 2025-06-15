package Test2;

public class Car {
	
	// private fields
	private int yearModel;
	private String make;
	private int speed;
	
	
	// constructor 构造函数（自动生成，自己改一点即可）
	public Car(int yearModel, String make) {
		this.yearModel = yearModel;
		this.make = make;
		this.speed=0;
	}

	
	//getYearModel（自动生成）
	public int getYearModel() {
		return yearModel;
	}
    //setYearModel（自动生成）
	public void setYearModel(int yearModel) {
		this.yearModel = yearModel;
	}

    //getMake（自动生成）
	public String getMake() {
		return make;
	}

	//setMake（自动生成）
	public void setMake(String make) {
		this.make = make;
	}

	//getSpeed（自动生成）
	public int getSpeed() {
		return speed;
	}

    //setSpeed（自动生成）
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	//accelerate 加速 （this.)
	public void accelerate() {
		this.speed+=5;
	}
	//break刹车(this.)
	public void brake() {
		this.speed-=5;
	}
	
	//getDescription
	public String[] getDescription() {
		String[] description = new String[3];//设置一个长度为3空数组
		description[0] = "This is a " + yearModel + " model vehicle.";
        description[1] = "It is made by " + make + ".";
        description[2] = "It is cruising at " + speed + " kmph.";
        return description;
	}



	public static void main(String[] args) {
		Car myCar = new Car(2025, "Toyota"); //建设myCar(设置新参数)
        myCar.accelerate();
        myCar.accelerate();
        myCar.accelerate();
        myCar.brake();
        
        for (String element : myCar.getDescription()) {//-->传导到description
            System.out.println(element);
        }
    }     
}

