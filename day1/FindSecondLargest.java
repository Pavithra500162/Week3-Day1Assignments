package week3.day1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class FindSecondLargest {

	public static void main(String[] args) {
		int[] data = {3,2,11,4,6,7,2,3,3,6,7};
		Set<Integer> intnew=new TreeSet<Integer>();
		for(int i=0;i<data.length;i++)
		{
			intnew.add(data[i]);
		}
		List<Integer> newint=new ArrayList<Integer>(intnew);
		Collections.sort(newint);
		System.out.println("Second Largest Number: "+newint.get(newint.size()-2));

	}

}
