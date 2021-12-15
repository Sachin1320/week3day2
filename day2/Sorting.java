package week3.day2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Sorting {

	public static  void main(String[] args) {
		
		List<String> input=new ArrayList<String>();
		
		input.add("TCS");
		input.add("wipro");
		input.add("cts");
		input.add("aspire");
		Collections.sort(input);
		Collections.reverse(input);
		System.out.println(input);
	}

}