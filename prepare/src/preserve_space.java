import java.util.Scanner;

public class preserve_space {
	static void preserving ()
	{
		Scanner s1=new Scanner(System.in);
		 String s=s1.nextLine();
		 char a[]=s.toCharArray();
		 for(int i=a.length-1;i>0;i--)
		 {
			 //System.out.println(a[i]);
			 String h=a.toString();
			 if(i<h.length())
			 {
				String m[]= s.split("", i);
				 System.out.println(m[i]);
			 }
			 else
			 {
				 break;
			 }
		 }
		
		
	}
	public static void main(String s[])
	{
		preserving();
	}

}
