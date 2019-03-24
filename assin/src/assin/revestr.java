package assin;

public class revestr {

	static void reverse(String str)
	{
		
		char[] try1 = str.toCharArray();
		
	for(int i=try1.length-1;i>=0; i--)
	{
 
	System.out.print(try1[i]);
	

	}
	
	
	/*String str2 = String.valueOf(try1);
	String str4 = Character.toString(try1[i]);
	System.out.println(str4);
	String m=new String(try1);
	System.out.println(m);*/
	
		}
	public static void main(String s[])
	{
		reverse("i am good girl   ");
		
}}




