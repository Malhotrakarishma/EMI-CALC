
public class commonwordbwtwo {
	public static void main(String s2[])
	{
String s="hello mam joly";
String s1="good joly mam";

String[]one=s.split(" ");
String[]two=s1.split(" ");
for(int i=0;i<one.length;i++)		//Outer loop for Comparison		
{   int wrc=0;
	for(int j=0;j<two.length;j++)	//Inner loop for Comparison
	{
		
	if(one[i].equals(two[j]))	//Checking for both strings are equal
		{
			 	
			System.out.println(two[j]);//Replace repeated words by zero
		}
	}

}
	}
}
	
	



