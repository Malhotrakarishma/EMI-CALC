package assin;
public class frequency {
	static int frequencycount(String str) {
		//char arr[]=str.toCharArray();
		for(char ch1='a';ch1<'z';ch1++)
		{
			       int count=0;
	            for(int j=0; j<str.length(); j++)
	               {
		               char ch = str.charAt(j);
		               
		                if(ch == ch1)
		                {
		                    count++;
		                }
	            }
	            if(count>0)
	            {
		       System.out.println("The character " + ch1 + " has occurred for " + count + " times");
		            } 
	      }
	        return 0;
	}
	public static void main(String d[])
	{
		frequencycount("how is orange heel");
	}

}
