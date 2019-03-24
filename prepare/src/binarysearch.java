import java.util.Scanner;

public class binarysearch {
	public static void main(String s[])
	{
		Scanner d=new Scanner(System.in);
		int a;
		System.out.println("enter");
		 a=d.nextInt();
		int[] array= new int[a];
		System.out.println("enter array");
		for(int i=0;i<array.length;i++)
		{
			array[i]=d.nextInt();
		}
	search(array,5);
		
	}
	static void search(int[]a,int k)
	{
		int first=0,last=a.length-1,mid;
		
		mid=(first+last)/2;
		while(first<=last) {
		if(k>a[mid])
		{
			first=mid+1;
		}
		else if(k==a[mid])
		{
			System.out.println(a[mid]);
		}
		else if(k<a[mid])
		{
			last= mid-1;
		}
		else
		{
			System.out.println("not found");
		}
		
	}}}
	


