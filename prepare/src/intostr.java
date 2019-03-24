
public class intostr {
	public static void main(String h[]) throws Exception
	{
		stringsum("10+10+10+10");
	}
	static void stringsum(String s)
	{ 
		 int sum=0;
		String []d=s.split("\\+");
		int[] g = new int[d.length];
		for (int i = 0; i < d.length; i++) {
			 
	         String numberAsString = d[i];
	          g[i] = Integer.parseInt(numberAsString);
	         
	          sum+=g[i];
	}
		System.out.println(sum);

}
}
