import java.util.Scanner;

public class Allzero {
	public static void main(String s[])
	{
		Scanner d=new Scanner(System.in);
		 
		int a=d.nextInt();
		 System.out.print("6jhgdhsa");
		int[][]array= new int[a][a];
		 System.out.print("dbhb");
		for(int i=0;i<array.length;i++)
		{
			for(int j=0;i<array.length;j++)
			array[i][j]=d.nextInt();
		}
		 setZeroes(array);
	}
	static void setZeroes(int[][] matrix) {
        
		int j;
        for(int i=0; i<matrix.length; i++){
            for(j=0; j<matrix.length; j++){
                matrix[i][j]=0;
                System.out.print(matrix[i][j]);
                }
           
            
        


        

}}
}