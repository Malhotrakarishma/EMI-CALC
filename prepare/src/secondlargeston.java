import java.util.Scanner;
public class secondlargeston {
	public static void main (String a[])
	{
		Scanner s =new Scanner(System.in);
		System.out.println("enter the size of array\n");
		int d=s.nextInt();
		int []arr=new int[d];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=s.nextInt();
		}
		secondlargest(arr);		
	}
	static int secondlargest(int[] array)

	{
		int first,second;
		first=second=Integer.MIN_VALUE;
		/* If current element is smaller than 
        first then update both first and second */
		for(int i=0;i<array.length;i++)
		{
			if(array[i]>first)
			{
				
				second=first;
				first=array[i];
			}
			/* If arr[i] is in between first and 
            second then update second  */
			else if (array[i] > second && array[i] != first)
                second = array[i];
		}
         
        if (second == Integer.MIN_VALUE)
        {
             System.out.print("There is no second largest"+
                                 " element\n");
        }
        else
             {
        	System.out.print("The second largest element"+
                                      " is "+ second);
    
        }

		return 0;
		
	}

}

