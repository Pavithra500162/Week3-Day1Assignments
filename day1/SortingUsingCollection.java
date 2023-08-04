package week3.day1;

import java.util.Arrays;

public class SortingUsingCollection {

	public static void main(String[] args) {
		String[] company = {"Google","Microsoft","TestLeaf","Maverick"};
		int arrlen=company.length;
		System.out.println(arrlen);
		Arrays.sort(company);
		for(int i=company.length-1;i>=0;i--)
		{
			System.out.println(company[i]);
		}
	}

}
