import java.util.*;
public class singleoccurence2 {
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		String word=s.nextLine();
		checkoccurence(word);
		
	}
	static void checkoccurence(String word)
	{		word=word+" ";  
		String newstr=" ";
		for(int i=0;i<word.length()-1;i++)
		{
			char ch=word.charAt(i);
			char ch1=word.charAt(i+1);
			if(ch!=ch1)
				
			{
				newstr=newstr+ch;
			
		}
		}
		System.out.println(newstr);
			
		

}
}