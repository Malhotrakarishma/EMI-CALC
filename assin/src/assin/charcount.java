package assin;

public class charcount {
	static int charcount1(String str)
	{
		char c=0;int count=0;
	for(int i=0;i<str.length();i++)
	{
if(str.charAt(i)!=' ')
{
		// System.out.println(str.charAt(i));
		
	     count++;
	}
	}
	System.out.println("no. of character in a given string="+count);
	
		return 0;}
	public static void main(String s[])
	{
		charcount1("i am good girl");
}
}
