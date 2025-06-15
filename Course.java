package Test3;

public class Course {
	private int code;
	private String name;
	private Professor instructor;

	public Course(int code, String name, Professor instructor) {
		this.code = code;
		this.name = name;
		this.instructor = instructor;
	}


	public int getCode() {
		return code;
	}


	public void setCode(int code) {
		this.code = code;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Professor getInstructor() {
		return instructor;
	}

	public void setInstructor(Professor instructor) {
		this.instructor = instructor;
	}
	
	//
	public boolean equals(Object obj) {
		if(obj instanceof Course) {
		Course other=(Course) obj;
		return this.code==other.code && this.name==other.name;
	}
		return false;
	}
	
	
	//
	@Override
	public String toString() {
		return "Course [code=" + code + ", name=" + name + "]";
	}
	
	public static void main(String[] args) {
		// 创建 Professor 对象
        Professor prof = new Professor("Dr. Smith", 2020);//from public Professor(String name, int year)
		// 创建 Course 对象
        Course course = new Course(101, "Java Programming", prof);//from public Course(int code, String name, Professor instructor)
        // 打印对象（会自动调用 toString 方法）
        System.out.println(prof);
        System.out.println(course);
	}

}
