
 public class sanitycheck {

	void display()
	{
		System.out.println("hello");
	}
	void over1()
	{
		System.out.println("sanity1");
	}
}
 class b extends sanitycheck
{
	void display1()
	{
		System.out.println("child function");
	}
	void over1()
	{
		System.out.println("sanity2");
	}

	public static void main( String a[])
	{
		b b1=new b();
		b1.over1();
		sanitycheck s=new b();
	s.over1();
	s.display();


		}
	
}

