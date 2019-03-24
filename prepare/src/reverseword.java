import java.util.Scanner;

public class reverseword {
	
	
	static void reverse(String f)
	{
		String a[]=f.split(" ");
		String r="";
		
		for(int i=a.length-1;i>=0;i--)
		{
			String word=a[i];
		
			String rev="";
			
		
		
		for(int i1=word.length()-1;i1>=0;i1--)
		
		{
			rev=rev+word.charAt(i1);
		}
		
		r=r + rev+" " ;
	}
		
		System.out.println(r);
		
	}

public static void main(String a[])
{
	Scanner s=new Scanner(System.in);
	String d=s.nextLine();
	reverse(d);
	
}
}

