
public class studentMain {

	public static void main(String[] args) {
		/*Student s1= new Student();
		Student s2= new Student();
		Student s3= new Student();
		s1.age=17;
		s1.course="java";
		s1.gender='M';
		s1.name = "Mike";
		s1.year=2016;
		System.out.println(s1.name+":"+s1.age+":"+s1.course+":"+s1.gender+":"+s1.year);
		s1.attendLecture();
		s1.attendLab();
		s1.SubmitAssignment();
		s2.age=17;
		s2.course="java";
		s2.gender='M';
		s2.name = "Mike";
		s2.year=2016;
		System.out.println(s2.name+":"+s2.age+":"+s2.course+":"+s2.gender+":"+s2.year);
		s3.age=17;
		s3.course="java";
		s3.gender='M';
		s3.name = "Mike";
		s3.year=2016;
		System.out.println(s3.name+":"+s3.age+":"+s3.course+":"+s3.gender+":"+s3.year);
		
	} it is the long way thats why i need to fallow shorter version
*/
		Student s1= new Student("Mike",17,'M',2016,"Java");
		System.out.println(s1.name+":"+s1.age+":"+s1.course+":"+s1.gender+":"+s1.year+":"+s1.university);
		s1.attendLab();
		s1.attendLecture();
		s1.SubmitAssignment();
		Student s2= new Student("Smith",22,'F',2018,"JavaC");
		System.out.println(s2.name+":"+s2.age+":"+s2.course+":"+s2.gender+":"+s2.year+":"+s2.university);
		s2.attendLab();
		s2.attendLecture();
		s2.SubmitAssignment();
		
	}
}
