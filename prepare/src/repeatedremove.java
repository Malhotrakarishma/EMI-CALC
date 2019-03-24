import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class repeatedremove {
	public static void main(String a[])
	{
		System.out.println("how many size of array you want");
		Scanner s=new Scanner(System.in);
		int m=s.nextInt();
		
		int []arr=new int[m];
		for(int i=0;i<m;i++)
		{
			arr[i]=s.nextInt();
		}
		repeated(arr);
			
	}
	static void repeated(int []a)
	{
		HashMap<Integer,Integer> s1=new HashMap<Integer,Integer>();
		for(int i=0;i<a.length;i++)
		{
			if(s1.containsKey(a))
			{
				s1.put(i,s1.get(a)+1);
			}
			else
			{
				s1.put(i, 1);
			}
		}
		Set<Integer> m1=s1.keySet();
		for(int m:m1)
		{
			if(s1.get(m)<=1)
			{
			System.out.println("string:"+m);
			
			}
		
	}

}
}