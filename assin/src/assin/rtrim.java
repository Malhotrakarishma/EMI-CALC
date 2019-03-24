package assin;

public class rtrim {

static int i=0;
	
	static String rtrim(String s1)
	{
         
		int a=s1.length();
		System.out.println("given string is:"+s1);
	
	for( i=a-1;i>=0; i--)
	{
                 char ch=s1.charAt(i);
                 if(ch!=' ')
                 break;
             }
             for(int j=0;j<i+1;j++)
             {
             System.out.print(s1.charAt(j));
         }
         
          
          return s1;

}
	public static void main (String d[])
	{
		
		 rtrim("karishma  malhotra      ");
}
}