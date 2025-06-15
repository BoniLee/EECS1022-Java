package Test3;


public class Professor {
	private String name;
	private int year;
	
	

	public Professor(String name, int year) {
		this.name = name;
		this.year = year;
	}
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	//
	@Override
	public String toString() {
		return "Professor [name=" + name + ", year=" + year + "]";
	}
	

	public static void main(String[] args) {
		 Professor prof = new Professor("Dr. Smith", 2020);// from public Professor(String name, int year)
		// 使用 toString() 打印
	     System.out.println(prof);
	}


	

}
