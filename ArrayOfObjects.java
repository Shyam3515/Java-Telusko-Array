package array;

class Student{
	String name;
	int rollNo;
	int marks;
}
public class ArrayOfObjects {

	public static void main(String[] args) {
		
		Student s1 = new Student();
		s1.name = "Shyam";
		s1.rollNo = 101;
		s1.marks = 96;
		
		Student s2 = new Student();
		s2.name = "Kavya";
		s2.rollNo = 102;
		s2.marks = 94;
		
		Student s3 = new Student();
		s3.name = "Thanvi";
		s3.rollNo = 103;
		s3.marks = 92;
		
		//Array Of Objects
		//Here creating an Array, which can hold student references
		Student students[] = new Student[3];
		students[0] = s1;
		students[1] = s2;
		students[2] = s3;
		
//		for(int i=0;i<students.length;i++) {
//			System.out.println(students[i].name + " : "+ students[i].marks);
//		}
		//here type student, bcz from students array we are getting student references
		for(Student stud : students) {
			System.out.println(stud.name +" : "+stud.marks);
		}
	}

}
