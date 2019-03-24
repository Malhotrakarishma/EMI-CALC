package assin;

public class nonrepeat {
	
	static int count=0;
	static char count1(String s)
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
		        }
		    }
		 return 0;
	

				
				
				
	        
			
		
	      }
			
	
	
	public static void main(String d[])
	{
	
		nonrepeat.count1("aabbaccde");
	}
	

}
