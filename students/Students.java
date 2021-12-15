package week3.students;

public class Students {
	
		public void getStudentInfo(int id)
		{
		System.out.println(id);	
		}
		public void getStudentInfo(int id , String name)
		{
			System.out.println(id   +   name);	
		}
		public void getStudentInfo(String email , long phonenumber)
		{
			System.out.println(email +   phonenumber);	
		}


		public static void main(String[] args) {
			// TODO Auto-generated method stub

			Students st = new Students();
			st.getStudentInfo(50);
			st.getStudentInfo(50, " Sachin");
			st.getStudentInfo("Sachin@gmail.com ", 9989898999l);
		}

	}



