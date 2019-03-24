import java.util.Scanner;

public class consecutive0nd1 {
	public static void main(String h[]) throws Exception
	{
		Scanner s=new Scanner(System.in);
		int x=s.nextInt();
		int r=count_consecutive_ones(x);
		int r1=count_consecutive_zeros(x);
		System. out.println(r);
		System. out.println(r1);
	}	
	static int count_consecutive_ones(int in) {
		  int count = 0;
		 
		  while (in!=0) {
		    in = (in & (in << 1));
		    count ++;
		  }
		  return count;
		}
	static int count_consecutive_zeros(int in)
	{
		return ~in;
	}
		


	


	}