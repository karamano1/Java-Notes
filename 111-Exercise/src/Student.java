
public class Student {
	public String name;
	public int age;
	public char gender;
	public int year;
	public String course;
	public static String university ="Cybertek";
	
	
	
	
	
	
	
	public Student(String name, int age, char gender, int year, String course) {
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.year = year;
		this.course = course;
	
	}
	public void attendLecture() {
		System.out.println(name+" attend lecture at" + university);
	}
	public void SubmitAssignment() {
		System.out.println(name+" Submit Assignment at "+ university);
	}
	public void attendLab() {
		System.out.println(name+" attend Lab at " + university);
	}
}
