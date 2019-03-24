package assin;

    public class sequence {
	static int count =0;
	static int i;
	static int seqcount(String str)
	
	{
		for( i=0;i<str.length();)	
		{
		char arr[]=str.toCharArray();
		char ch=arr[i];
		while(i<arr.length&&ch==arr[i])
		{
			count=1;
			
			i++;
		}
		
		
		System.out.println(ch+"no.of times:"+count);
		
		}
	return count;
}
	
	public static void main(String d[])
	{
		seqcount("nitin");
	}
}
	
