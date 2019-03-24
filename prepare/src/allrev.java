import java.util.Scanner;
public class allrev {
		static void reverse(String f)
		{
			String a[]=f.split(" ");
			
			String rev=" ";
			
			for(int i=a.length-1;i>=0;i--)
			{
				 rev+=a[i]+" ";

}
			System.out.println(rev);
		}
			public static void main(String a[])
			{
				Scanner s=new Scanner(System.in);
				String d=s.nextLine();
				reverse(d);
				
			}
			}	
