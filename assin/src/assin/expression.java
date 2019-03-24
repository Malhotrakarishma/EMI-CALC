
package assin;

public class expression {
	public static void main(String a[])
	{
		String s1="1020"+"0";
		int i=0;
		while(i<s1.length())
		{
			char ch=s1.charAt(i);
			String ne=new String(new char[] {ch});
			int j=Integer.parseInt(ne);
			System.out.println(j);
			i++;
		}
	}

}
