package prepare;

import java.util.Scanner;

public class TwoStringMatch {
	
	public static void main(String s[])
	{
		@SuppressWarnings("resource")
		Scanner s1 = new Scanner(System.in);
		String []arr1=new String[1];
	
		 System.out.println("enter the String1 :");
		for(int i=0;i<arr1.length;i++)
		{
           
            arr1[i]=s1.next();
            System.out.println(arr1);
        }
       
        for(String print:arr1){
            System.out.println(print);}
        
        
        
}}