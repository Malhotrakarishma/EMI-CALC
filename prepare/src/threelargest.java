import java.util.Scanner;

public class threelargest {
	
	public static void main(String s[])
	{	
		Scanner d=new Scanner(System.in);
		int a=d.nextInt();
		int[]array= new int[a];
		for(int i=0;i<array.length;i++)
		{
			array[i]=d.nextInt();
		
			
		}
		largest(array);
	}
		static void largest(int []array)
		{
		
		int max;
		int max2;
		int max3;
		max=array[0];
		for(int i=0;i<array.length;i++)
		{
			
			if(max<array[i])
			{
				max=array[i];
			}
			
		}
			//array[1]=max2;
			//array[2]=max3;
		max2=array[0];
		for(int i=0;i<array.length;i++)
		{
			if(array[i] < max && array[i]>max2)
			{
				 max2= array[i];
			}
			
			
		}
		max3=array[0];
		for(int i=0;i<array.length;i++)
		{
			if(array[i] < max && array[i]<max2&& array[i]>max3)
			{
				 max3= array[i];
			}
			
			
		}
		
		System.out.println(max);
	
		System.out.println("second largest"+max2);
		System.out.println("third largest"+max3);
		
}
}

