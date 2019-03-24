package assin;

public class palimdrome
{
	static int i;
	static String rev="";
	
	static boolean palimdrome(String s)
	{
			int a=s.length();
			System.out.println("given string is:"+s);
		
		for( i=a-1;i>=0; i--)
		{
	     rev=rev+s.charAt(i);
		
		}
		System.out.print("reverse of given string:" +rev);
		if(s.equals(rev))
		{
			return true;
		}
		else
		{
			return false;
					
		}
	}
	public static void main(String ...s1)
	{
boolean b=palimdrome("karishma");
System.out.println("");
if(b==true) {
	System.out.println("String is palimdrome");
}
	else {
		System.out.println("String is not palimdrome");
	}
}


}
