package week3.day1;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class MissingNumber {

	public static void main(String[] args) {
		int[] data= {1,2,3,4,5,6,7,8,5,10};
		Set<Integer> nodupe=new HashSet<Integer>();
		for(int i=0;i<data.length;i++)
		{
			nodupe.add(data[i]);
		}
		System.out.println(nodupe);
		for(int i=0;i<nodupe.size();i++)
		{
			if(!nodupe.contains(i+1))
					{
						System.out.println(i+1);
					}
		}

	}

}
