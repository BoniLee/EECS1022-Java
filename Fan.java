package Test3;

public class Fan {
	//final=constant
	public static final int SlOW=1;
	public static final int MEDIUM=2;
	public static final int FAST=3;

	public static final boolean ON=true;
	public static final boolean OFF=false;
	
	private int speed;
	private boolean status;
	private double radius;
	private String color;
	
	//单独写默认值
	public Fan() {
		this.speed=1;
		this.status=false;
		this.radius=5.0;
		this.color="blue";
		}
	//getCoverage(手写）
	public double getCoverage() {
		return speed*radius*5;
	}
	//isSuitable(手写）-argument==参数要放括号里
	public boolean isSuitbale(double area) {
		double slowCoverage = 1 * radius * 5;
        double fastCoverage = 2 * radius * 5;
        return slowCoverage>=2*area && area<=10*fastCoverage;
	}
	//construtor-argument+initial(自动生成）
	public Fan(int speed, boolean status, double radius, String color) {
		this.speed = speed;
		this.status = status;
		this.radius = radius;
		this.color = color;
	}
	//get and set
	public int getSpeed() {
		return speed;
	}
	
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	public boolean isStatus() {
		return status;
	}
	
	public void setStatus(boolean status) {
		this.status = status;
	}
	
	public double getRadius() {
		return radius;
	}
	
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	//
	@Override
	public String toString() {
		return "Fan [speed=" + speed + ", status=" + status + ", radius=" + radius + ", color=" + color + "]";
	}
	
	public static void main(String[] args) {
		// 创建默认风扇对象
        Fan defaultFan = new Fan();
        System.out.println(defaultFan); // 调用 Fan 的 toString 方法

        // 创建自定义风扇对象
        Fan customFan = new Fan(Fan.FAST, Fan.ON, 7.5, "red");
        System.out.println(customFan); // 调用 Fan 的 toString 方法
    }

	}
	

