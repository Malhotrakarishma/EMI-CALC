package assin;

public class newsecondmax {
	public static void main(String s1[])
	{
		int []a1= {1,9,2,9,8,7,6};
		int s=secondmax(a1);
		System.out.println(s);
	}
	static int secondmax(int a[])
	{ int max1=a[0];
      int max2=a[0];
		
		for(int i=1;i<a.length;i++)
		{
			
		
		if(a[i]<max1)
		{
			max2=max1;
			max1=a[i];
		}
		
		}
		return max2;
		
	}

	
}