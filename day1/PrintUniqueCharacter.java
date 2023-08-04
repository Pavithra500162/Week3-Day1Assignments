package week3.day1;

import java.util.LinkedHashSet;
import java.util.Set;

public class PrintUniqueCharacter {
public static void main(String[] args) 
	
	{
		String str="Pavithra";
		char[] ch = str.toCharArray();
		
		Set<Character> unique=new LinkedHashSet<Character>();
		Set<Character> duplicate=new LinkedHashSet<Character>();

		for(int i=0;i<=ch.length-1;i++) 
		{
		if(	(!unique.add(ch[i])))
		{
			duplicate.add(ch[i]);
		}

		}
		System.out.println("unique values: "+unique+" ");
		System.out.println("duplicate values: "+duplicate+" ");

	}
}
