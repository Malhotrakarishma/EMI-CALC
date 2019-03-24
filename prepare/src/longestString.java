import java.util.LinkedHashMap;
import java.util.Scanner;

public class longestString {
	public static void main(String s[])
	{
		System.out.println("enter the string");
		Scanner s1=new Scanner(System.in);
		String s2=s1.nextLine();
		largest(s2);
				
	}
	static void largest(String h)
	{
		char []ne=h.toCharArray();
		String largest=null;
		int largest_len=0;
		LinkedHashMap<Character,Integer> n=new LinkedHashMap<Character,Integer>	();		
		for(int i=0;i<ne.length;i++)
		{
			char ch=ne[i];
			if(!n.containsKey(ch))
			{
				n.put(ch, i);
			}
			else
            {    
                i = n.get(ch);
                 
                n.clear();
            }
			//Updating longestSubstring and longestSubstringLength
            
            if(n.size() > largest_len)
            {
            	 largest_len = n.size();
                 
            	 largest=n.keySet().toString();
            }
		}
		System.out.println("Input String : "+h);
        
        System.out.println("The longest substring : "+largest);
         
        System.out.println("The longest Substring Length : "+largest_len);
	}

}
