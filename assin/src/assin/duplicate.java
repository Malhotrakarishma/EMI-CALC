package assin;

public class duplicate {
static void dup(String n)
{  
	char arr[]=n.toCharArray();
	int count =0;
	
	for(int i =0;i<arr.length;i++)
	{
		  for(int j=i+1;j<arr.length;j++)
		   {
		if(arr[i]==arr[j])
		{
			
			System.out.println("duplicate elements are:"+arr[j] ); 
			count++;
			break;
		}
		
			}}
	}
	
public static void main(String c1[])
{
	dup("karishma");
}
}
