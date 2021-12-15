package week3.org.college;


	public class Student extends Department  {
		
		public void studentName()
		{
			System.out.println("Sachin");
		}
		public void studentDept()
		{
			System.out.println("CSE");
		}
		public void studentId()
		{
			System.out.println("421217104035");
		}

		public static void main(String[] args) {
			
	       Student stu = new Student ();
	       stu.collegeCode();
	       stu.collegeName();
	       stu.collegeRank();
	       stu.deptName();
	       stu.studentDept();
	       stu.studentId();
	       stu.studentName();
		}

	}

