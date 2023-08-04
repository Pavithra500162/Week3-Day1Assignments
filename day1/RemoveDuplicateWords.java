package week3.day1;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

import org.apache.commons.collections4.bag.SynchronizedSortedBag;

public class RemoveDuplicateWords {

	public static void main(String[] args) {
		String text = "We learn java basics as part of java sessions in java week1";
		String[] splittext=text.split(" ");
		for (int i=0;i<splittext.length;i++)
		{
			System.out.println(splittext[i]);
		}
		Set<String> orgin=new HashSet<String>();
		Set<String> dupe=new HashSet<String>();
		for(int j=0;j<splittext.length;j++) {
				if(!orgin.add(splittext[j]))
				{
					dupe.add(splittext[j]);
				}
					
		}
		System.out.print("\nAfter removing duplicate words:"+orgin+" ");
		System.out.print("\nDuplicate words:"+dupe+" ");
	}

}
