package week3.org.Bankinfo;

public class AxisBank extends BankInfo{
	
	public void deposit()
	{
		System.out.println("THe deposit percent is 20%");
	}

	public static void main(String[] args) {
		
		AxisBank ab =new AxisBank();
		ab.deposit();
				

	}

}

