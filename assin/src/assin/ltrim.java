package assin;
public class ltrim {
	static int i=0;
	
	static String ltrim(String s1)
	{
         
         {
        	 for(i=0;i<s1.length();i++)
             {
                 char ch=s1.charAt(i);
                 if(ch!=' ')
                 break;
             }
             for(int j=i;j<s1.length();j++)
             System.out.print(s1.charAt(j));
         }
         
          
          return s1;

}
	public static void main (String d[])
	{
		 System.out.println("Original String is : ");
		 
	        System.out.println("   india  "  );
	        
	        ltrim("     india");
	}}
