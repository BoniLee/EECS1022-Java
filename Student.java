package Test3;
import java.util.*;

public class Student {
	private String name;
	private int year;
	private String yorkID;
	private ArrayList<Course> courses;
	private static int studentcount=1;

	public Student(String name, int year) {//参数输入
		this.name = name;
		this.year = year;
		this.yorkID = "York-"+String.format("%d", studentcount++);
		this.courses = new ArrayList<>();
	}
	
	//four fields
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


	public String getYorkID() {
		return yorkID;
	}

	public void setYorkID(String yorkID) {
		this.yorkID = yorkID;
	}

	
	public ArrayList<Course> getCourses() {
		return courses;
	}


	public void setCourses(ArrayList<Course> courses) {
		this.courses = courses;
	}
	//enrollCourse
	public void enrollCourse(Course c) {
		if(!courses.contains(c)) {
		    courses.add(c);
		}
	}
	//dropCourse
	public boolean dropCourse(Course c) {
		return courses.remove(c);
	}
	//dropCourse-i
	public Course dropCourse(int i) {
		if(i>=0 && i<courses.size()) {
			return courses.remove(i);
		}
		return null;
	}
	//getCourse-i
	public Course getCourse(int i) {
		if(i>0 && i<courses.size()) {
			return courses.get(i);
		}
		return null;
	}
	//getCourseTitle
	public String getCourseTitle(int i) {
		if(i>0 && i<courses.size()) {
			return courses.get(i).getName();
		}
		return null;
	}
	//getInstructorName
	public String getInstructorName(int i) {
		if(i>0 && i<courses.size()) {
			return courses.get(i).getInstructor().getName();
		}
		return null;
	}
	//totalCourse
	public int totalCourse() {
		return courses.size();
	}
	//hasTaken
	public boolean hasTaken(Course c) {
		return courses.contains(c);
	}
	//
	@Override
	public String toString() {
		return "Student [name=" + name + ", year=" + year + ", yorkID=" + yorkID + ", courses=" + courses + "]";
	}
	

	public static void main(String[] args) {
		// 创建教授对象
        Professor prof = new Professor("Dr. Smith", 2020);
        
        // 创建课程对象
        Course course1 = new Course(101, "Java Programming", prof);
        Course course2 = new Course(102, "Data Structures", prof);
        
        // 创建学生对象
        Student student = new Student("John Doe", 2);
        
        // 注册课程
        student.enrollCourse(course1);
        student.enrollCourse(course2);
        
        // 打印学生信息
        System.out.println(student.toString());
    }

	}

//ArrayList
//.add .get .remove .size .contains()
