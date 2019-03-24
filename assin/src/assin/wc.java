package assin;

public class wc {
	 static int word=1;
		  
		 static int wordcount(String str)
		 {
			 
		 
		  for(int i=0;i<str.length();++i)
		  {
		   if(str.charAt(i)==' ')
		   {
		    word++;
		  
		 }
		  }
		  System.out.println("Number of words="+word);
		  System.out.println("Number of spaces="+(word-1));
		  return 0;
		 }
		 
public static void main (String []e)
{
	wordcount("india is best country");
		}
	
}