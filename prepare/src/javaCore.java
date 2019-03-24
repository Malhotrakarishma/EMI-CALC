import java.util.Scanner;

public class javaCore 
{
  static String arr1[] = {"", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};   
  static String arr2[] = {"", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"}; 
   
    static String numToWords(int n, String s) 
    { 
        String str = ""; 
        if (n > 19) 
		{
		  str += arr2[n / 10] + arr1[n % 10]; 
        }
     		else
		   { 
               str += arr1[n]; 
           }  
          if (n != 0) 
		  { 
            str += s; 
          } 
  
        return str; 
    }  
    static String words(long n) 
	{  
        String out = "";   
        out += numToWords((int) ((n / 100000) % 100), "lakh "); 
        out += numToWords((int) ((n / 1000) % 100), "thousand ");  
        out += numToWords((int) ((n / 100) % 10), "hundred "); 
        if (n > 100 && n % 100 > 0)
  		   { 
             out += "and "; 
           } 
   
        out += numToWords((int) (n % 100), ""); 
  
        return out; 
    } 
    public static void main(String[] args)
	{
      System.out.print("Enter the number");
      Scanner sc = new Scanner(System.in); 
      long n = sc.nextLong();
        int length = String.valueOf(n).length();
        if(length > 7)
		{
            System.out.print("Input value is out of range, it will handles upto 7 digit no.\n");
        }
		else
		{
            System.out.printf(words(n)); 
        }
    }
    
}