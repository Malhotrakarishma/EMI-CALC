import java.util.Scanner;

public class maxoccurenceword {
	
	static void common_word(String s)
	{
		
String a[]=s.split("");

for(int i=0;i<a.length;i++)
{   int count=0;
	for(int j=i+1;j<a.length;j++)
	{
		if(a[i].equals(a[j]))
				{
			     
			count++;}
	}
System.out.println(count);
}

	}
public static void main(String args[])throws Exception
{
	System.out.println("enter the two strings");
	Scanner s1=new Scanner(System.in);
	String a=s1.nextLine();
	common_word(a);
}
}
