import java.util.Arrays;
import java.util.Scanner;

public class mediian {
	public static void main(String s[])
	{
		Scanner d=new Scanner(System.in);
		int a=d.nextInt();
		int[]array= new int[a];
		for(int i=0;i<array.length;i++)
		{
			array[i]=d.nextInt();
		}
		
		median(array);
		
	}
	static void median(int[]b)
	{
		Arrays.sort(b);
		int len=b.length;int med;int len2;
		
		if(len%2!=0)
		{
			len=(len+1)/2;
			med=b[len-1];
			System.out.println(med);
		}
		else
		{
			len=len/2;
			
			len2=(len/2)+1;
			med=(b[len-1]+b[len2-1])/2;

			System.out.println(med);
	}


		
	
	
	}

}