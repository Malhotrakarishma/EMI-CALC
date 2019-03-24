package assin;

    public class vowelcount
{ 
	static int count;
	static int vowel(String str)
	{

		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
					if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
					{
						count++;
					}
		}
	
		return count;
	}
	public static void main(String h[])
	{
		int m=vowel("india");
		System.out.println(m);
	}

}
