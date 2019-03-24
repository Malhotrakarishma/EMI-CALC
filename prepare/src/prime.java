import java.util.*;
public class prime {
	
	static void checkprime(int a)
	{   int flag = 0;
		int [] b=new int [a];
		if(a<=1)
		{
			flag=0;
		}
		for(int i=2;i<a;i++)
		{
			if(a%i==0)
			{
				flag=0;
			}
			if(flag!=0)
			{
				for(int j=0;j<b.length;j++)
				{
					b[j]=i;
					System.out.println(b[j]);
				}
				
			}
		}
	}
	
	public static void main(String ars[])

	{
		Scanner s=new Scanner(System.in);
			int a=s.nextInt();	
			checkprime(a);
			
			
	}
}
