
public class remove_duplicate {
	public static void main(String s[])throws Exception
	{
		int []a= {1,2,5,8,8,9,0,0};
		remove(a);
	}
	static  void remove(int a[])
	
	{
		for(int i=0;i<a.length;i++)
		{
			int one=a[i];
			int sec=a[i+1];
			if(one!=sec)
			{
				System.out.println(sec);
			}
		}
	}

}
