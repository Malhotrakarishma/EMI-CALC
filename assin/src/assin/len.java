package assin;
public class len {
	  	static int length;
	  	static int i;
	  	static int lengthcount(String str)
	  	{try
	  	{
           char ch[]=str.toCharArray();
	  		for (i=0; ch[i]!='\0'; i++)
	  			
	  		{
	  			
	  		}
	  	return i;
	  	}
	  	catch(Exception e)
	  	{
	  		System.out.println(e);
	  	}
		return i;
	  	}
	  	
	  	public static void main(String h[])
	  	{
	  		int m=lengthcount("ria");
	  		System.out.println(m);
	  	}
}
