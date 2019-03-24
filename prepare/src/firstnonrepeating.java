import java.util.Scanner;

public class firstnonrepeating {
	
	static void nonrepeat(String s)
	{
			
			char s1[]=s.toCharArray();
			
			
			 for(int i = 0; i < s1.length; i++ )
			    {
			        int repeated = 0;
			        for(int  j = 0; j < s1.length; j++ )
			        {
			            if( i != j && s1[i] == s1[j] ) {
			                repeated = 1;
			                break;
			            }
			        }         
			        
			        if( repeated == 0 ) {  // Found the first non-repeated character
			            System.out.println( "first non repeated character" +" "+s1[i]);
			            break;
			        
			    }
			    }
			 
		


			 
}


public static void main(String a[])
{
	Scanner s=new Scanner(System.in);
	String d=s.nextLine();
	nonrepeat(d);
	
}
}	
