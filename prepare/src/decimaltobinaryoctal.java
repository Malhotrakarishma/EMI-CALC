import java.util.Scanner;

public class decimaltobinaryoctal {
	public static void main(String h[])
	{
		Scanner s=new Scanner(System.in);
		int x=s.nextInt();
		decimaltobinary(x);
		decimaloctal(x);
	}
	static void decimaltobinary(int num)
	{
		int rem=0;
		String add=" ";
		
		while(num>0)
		{
			rem=num%2;
			add=rem+add;
			num=num/2;
			
		}
		
		System.out.println("binary number is"+add);
		
	}
	static void decimaloctal(int num)
	{
		int rem=0;
		String add=" ";
		
		while(num>0)
		{
			rem=num%8;
			add=rem+add;
			num=num/8;
			
		}
		System.out.println("octal number is"+add);
		
	}
}
