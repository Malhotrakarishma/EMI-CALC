import java.util.Scanner;

public class primerange {
	
	static int prime(int n)
	{ int flag=1;
		for(int i=2;i<=n/2;i++)
		{
			if(n%i==0)
			
				flag=0;
			break;
			
		}
	
		return flag;
	}
	

public static void main(String arg[])
{
	System.out.println("enter the range of prime no");
	Scanner s=new Scanner(System.in);
	int r1=s.nextInt();
	int r2=s.nextInt();
	System.out.println("range is"+r1+"to"+r2);
	for(int i=r1+1; i<r2; ++i)
    {
        
       int flag = prime(i);

        if(flag == 1)
        {
        	System.out.println(i);
        }
			

}}
}
