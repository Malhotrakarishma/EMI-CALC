
public class sandwitch {
	public static void main(String j[])
	{
		String m=getsandwitch("xxxbreadbreadjambreadyyy");
		System.out.println(m);
	}
	static String getsandwitch(String input)
	{ int first =-1;
	  int last=-1;
	  for(int i=0;i<input.length()-5;i++)
	  {
		  if(input.substring(i, i+5).equals("bread"))
		  {
		  first =i;
		  break;
	  }
	  }
	  for(int i=input.length()-5;i>=0;i--)
	  {if(input.substring(i,i+5).equals("bread"))
	  {
		  last =i;
		  break;
	  } }
	  if(first!=-1&&last!=-1&&first!=last)
	  
		  return input.substring(first+5,last);
		  return " ";
	  
		
		
	}}


