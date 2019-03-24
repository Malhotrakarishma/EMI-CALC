import java.util.*;
public class intersection {
	private static Scanner s1;
	public static void main(String s[])
	{
		System.out.println("enter 2 arrays");
	s1 = new Scanner(System.in);
	int a= s1.nextInt();
	int a1[]=new int[a];
	int a2[]=new int[a];
	int m=a1.length;
	int n=a2.length;
	System.out.println("ist array");
	for(int i=0;i<m;i++)
	{
		a1[i]=s1.nextInt();
		//System.out.print(a1[i]);
	}
	System.out.println("2nd array");
	for(int i=0;i<n;i++)
	{
		a2[i]=s1.nextInt();
		//System.out.print(a2[i]);
	}
	intersect(a1,a2,m,n);
	
	}
	static void intersect(int a1[],int a2[],int m,int n)
	{int i=0;
	   int j=0;
		
		while(i<m&&j<n)
      {
			if(a1[i]<a2[j])
			{
				i++;
			}
			else if(a2[j]<a1[i])
			{
				j++;}
			else
			{
				System.out.println("common"+a2[j++]+"");
				i++;}
      }
			}
			
		
	}


