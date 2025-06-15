package Test3;


public class RoomDimension {
	private double length;
	private double width;
	
	//getArea
	public double getArea() {
		return length*width;
	}
	//constructor-argument+initial
	public RoomDimension(double length, double width) {
		this.length = length;
		this.width = width;
	}
	//equals
	public boolean equals(Object obj) {
		if(obj instanceof RoomDimension) {//判断对象 obj 是否是 RoomDimension 类型或其子类的实例
			RoomDimension other=(RoomDimension)obj;
			return this.length==other.length && this.width==other.width;
		}
		return false;
	}
	//isFanSuitable
	public boolean isFanSuitable(Fan obj) {
		return obj.isSuitbale(getArea());
		
	}
	//
	@Override
	public String toString() {
		return "RoomDimension [length=" + length + ", width=" + width + "]";
	}
	
	
	public static void main(String[] args) {
		 // Create a RoomDimension object with specific length and width
        RoomDimension room = new RoomDimension(10.5, 15.3);
        
        // Print out the RoomDimension object using the toString method
        System.out.println(room);  // This will call the toString() method and print "length: 10.5, width: 15.3"

        // Get the area of the room
        double area = room.getArea();
        System.out.println("Area of the room: " + area);  // Print the area of the room
    }
	}
	


