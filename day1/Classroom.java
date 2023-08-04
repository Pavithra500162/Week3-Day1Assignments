package week3.day1;

import java.util.LinkedHashSet;
import java.util.Set;

public class Classroom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String companyName = "google";
		char[] compname=companyName.toCharArray();
		Set<Character> cname=new LinkedHashSet<Character>();
		Set<Character> copy=new LinkedHashSet<Character>();
		for(int i=0;i<compname.length;i++)
		{	
			if(!cname.add(compname[i]))
				copy.add(compname[i]);
		}
		System.out.println("Duplicate characters:"+copy);
		System.out.print("After removing duplicate characters:");
		for(Character c:cname)
		{
			System.out.print(c);
		}
	}

}
