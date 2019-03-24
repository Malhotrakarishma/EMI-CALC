package assin;


import java.util.Scanner;

public class secondlarge{
	
	public static void main(String s)
	{
		int max,max2 ;

		Scanner s1=new Scanner(System.in);
		int m=s1.nextInt();
		System.out.println("how many size of array you want");
		int []arr=new int[m];
		//for(int i=0;i<m;i++)
		//{
			//arr[i]=s1.nextInt();
		//}
		
		 max = arr[0];
	     
	 	   
	        for(int i=0; i<m; i++)
	        {
	        	
	        	if(max<arr[i])
	        	{
	        		max=arr[i];
	        	}
	}
	        max2 = arr[0];
	        for (int i = 1; i < m; i++) {
	            if (arr[i] > max2 && arr[i] < max)
	                max2 = arr[i];
	        }
	       
	        System.out.println("first largest"+max);
	        System.out.println("second largest"+max2);
	        
    }
}
