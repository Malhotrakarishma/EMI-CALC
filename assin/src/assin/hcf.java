package assin;

import java.util.Scanner;

public class hcf {
	
	static int x;
	static int y;
	void value()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter the two number");
		  x=s.nextInt();
		  y=s.nextInt();
	}
		  int hcf1()
		  {
			  value();
		while(x!=y)
		{
			if(x>y)
			{
				x=x-y;
			}
			else
			{
				y=y-x;
			}
		}
		
		return x;
		
	
		 
	}
	
	 void reduce1()
	{
		 int gcd= hcf1();
		 System.out.println("before reduction"+x);
		 System.out.println("before reduction"+y);
		x=x/gcd;
		y=y/gcd;
		System.out.println("numerator  is"+x);
		System.out.println("denominator is"+y);
	}	
		
	
	

	public static void main(String d[])
	{
		
 hcf v=new hcf();
 v.hcf1();
 v.reduce1();
}
	}
