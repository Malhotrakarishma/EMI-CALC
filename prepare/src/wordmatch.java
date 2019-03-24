import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class wordmatch {
	
	public static void main(String args[])throws Exception
	{
		System.out.println("enter the two strings");
		Scanner s1=new Scanner(System.in);
		String a=s1.nextLine();
		String  b=s1.nextLine();
		//String c=a+b;
		StringBuffer c1= new StringBuffer(a+b);
		String h= c1.toString();
		System.out.println(h);
		
		
		common_word(h);
	}
	
		
		
	static void common_word(String s)
	{
	String [] words=s.split(" ");
	Map<String,Integer> wordmap=new HashMap<String,Integer>();
	for(String m:words) {
		if(wordmap.get(m)!=null)
		{
			wordmap.put(m, wordmap.get(m)+1);
		}
		else
		{
			wordmap.put(m, 1);
		}
		}
	
	Set<String> m1=wordmap.keySet();
	for(String m:m1)
	{
		if(wordmap.get(m)>1)
		{
		System.out.println("string:"+m+"frequency:"+wordmap.get(m));
		
		}
	}}
	
	
	
		
	}

		
