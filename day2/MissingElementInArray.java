package week3.day2;

import java.util.ArrayList;

import java.util.List;

public class MissingElementInArray {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,7,6,8};
		List<Integer> val=new ArrayList<Integer>();
		for(int var:arr)
		{
			val.add(var);
		}
		
		System.out.println(val);
		
		
		for(int i=1;i<val.size();i++)
		{
			if(val.get(i-1)!=i)
				{System.out.println(i);
			break;
				}
		}

	}

}

