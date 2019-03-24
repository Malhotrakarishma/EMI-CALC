import java.util.*;
public class dividewithoutoperator {
	public static void main(String a[])

	{
		Scanner n=new Scanner(System.in);
		int num=n.nextInt();
		int a1=divide(num);
		System.out.println(a1);
	}
	static int divide(int num)
	{int quo=0;
	
		int divisior=5;
		while(num>=divisior)
		{
			num=num-divisior;
			quo++;
		}
		System.out.println(num);
		return quo ;
	}
}
