package assin;

import java.util.Arrays;

public class anagram {
	static String str="Hitler Woman".replaceAll("\\s", "").toLowerCase();  
	static String str1="Mother in law". replaceAll("\\s", "").toLowerCase();  
	static char d[];
	static char d1[];
	static int ana()
	
	{
		for(int i=0;i<str.length();i++)
		{
			    d=str.toCharArray();
			
			
		}
		System.out.println(d);
		for(int i=0;i<str1.length();i++)
		{
			    d1=str1.toCharArray();
			
			
		}
		System.out.println(d1);
		
		 Arrays.sort(d);  
         Arrays.sort(d1);
         
		if(Arrays.equals(d, d1))
		{
			System.out.println("anagram");
		}
		else
			System.out.println("oops!"+"try one more time" );
		
		return 0 ;
	}
	public static void main(String s[])
	{
		anagram.ana();
	}
	
}
