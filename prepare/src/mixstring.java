
public class mixstring {
static String a="rajat";
static String b="singla";


static String mix()
{
	String str = "";
    int len = 0;

    if (a.length() >= b.length())
    {
        len = a.length();
    } else
        len = b.length();

    for (int i = 0; i < len; i++)
    {

        if (i < a.length())
        {
            str += a.charAt(i);
        }

        if (i < b.length())
        {
            str += b.charAt(i);
        }

    }
    return str;
}
	
public static void main(String a[])
{
	String res=mix();
	System.out.println(res);
}
}
