package assin;

public class alltrim
{ static int i;
	static int count=0;
static String alltrim(String s1)
{

	   for(int i=0;i<s1.length();i++)
		  {
		   
	      System.out.println(s1.charAt(i));
	      count++;
	      
			
	      if( s1.charAt(i)==' ') {
	         
	         count--;
	      }
	      
		  }
	   
	 
System.out.println(count);

return s1;
}
	
	


public static void main(String s[])
{
	alltrim(" india is best country   ");
}}
