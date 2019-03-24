package assin;

import java.util.Scanner;

public class prime {
	int flag=0;
	void primeno()
	{
		Scanner n= new Scanner(System.in);
		System.out.println("enter the value");
		int m=n.nextInt();
		
		for(int i=2;i<m/2;i++) 
		{
			if(m%i==0)
			{
				flag++;
				break;
			}
		}
			
			if(flag==0)
			{
				System.out.println("number is prime");
			}
			else
	        {
	            System.out.print("This is not a Prime Number");
	        }
			
			
		}
		
	
	public static void main(String s[])
	{
	prime f=new prime();
	f.primeno();

}
}
