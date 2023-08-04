package week3.day1;

import java.util.LinkedHashSet;
import java.util.Set;

public class PrintDuplicateNumber {
	public static void main(String[] args) 
	{
		int[] data = {4,3,6,8,29,1,2,4,7,8};
		Set<Integer> unique=new LinkedHashSet<Integer>();
		Set<Integer> duplicate=new LinkedHashSet<Integer>();

		for(int i=0;i<=data.length-1;i++) 
		{
		if(	(!unique.add(data[i])))
		{
			duplicate.add(data[i]);
		}

		}
		System.out.println("Unique values: "+unique+" ");
		System.out.println("Duplicate values: "+duplicate+" ");
	}
}
