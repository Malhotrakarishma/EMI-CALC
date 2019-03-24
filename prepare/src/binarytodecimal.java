
public class binarytodecimal

{public static int BinaryToDecimal(int binaryNumber){
 
    int decimal = 0;
    int p = 0;
    while(true){
      if(binaryNumber == 0){
        break;
      } else {
          int temp = binaryNumber%10;
          decimal += temp*Math.pow(2, p);
          binaryNumber = binaryNumber/10;
          p++;
       }
    }
    return decimal;
  }
 
  public static void main(String args[]){
    
    System.out.println("110 --> "+BinaryToDecimal(110));
    System.out.println("1101 --> "+BinaryToDecimal(1101));
    System.out.println("100 --> "+BinaryToDecimal(100));
    System.out.println("110111 --> "+BinaryToDecimal(110111));
  }
}

