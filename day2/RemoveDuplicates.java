package week3.day2;


import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {
	public static void main(String[] args) {
		String i = "Paypal India";
		char[] input = i.toCharArray();
		 Set<Character> charset = new LinkedHashSet<Character>();
		for(Character  dupcharset : input) 
			{
			if (dupcharset != ' ')
				charset.add(dupcharset);
			}
            System.out.println(charset);
	}}


