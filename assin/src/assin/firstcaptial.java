package assin;

import java.util.Scanner;

public class firstcaptial {
	public static void main(String...sm)
	{
 Scanner s1= new Scanner(System.in);
 System.out.println("Enter the sentence.");
 String s=s1.nextLine();
 String cap="";
  for(int i=0;i<s.length();i++)
	{
		char m=s.charAt(i);
		if(m==' ')
			{	
			 cap=cap+" ";
             char y=s.charAt(i+1);
             cap=cap+Character.toUpperCase(y);
             i++;
            }
           else
            {
                cap=cap+m;
            }
}
    System.out.println("The new String with capital letters is: "+"\n"+cap);
}
}
	

	


