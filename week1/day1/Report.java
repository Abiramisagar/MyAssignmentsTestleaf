package week1.day1;

public class Report {

	public static void main(String[] args) {
		
		Student s1 = new Student();
		s1.studentName = "Ashok";
		s1.rollNo = 1;
		s1.collegeName = "GCT Tech";
		s1.markScored = 98;
		s1.cgpa = 8.9;
		
		System.out.println("Student Name = "+s1.studentName);
		System.out.println("Roll No = "+s1.rollNo);
		System.out.println("College Name = "+s1.collegeName);
		System.out.println("Mark Scored = "+s1.markScored);
		System.out.println("CGPA = "+s1.cgpa);
		
	}
	

}
