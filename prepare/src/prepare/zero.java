package prepare;


public class zero {
	public void setZeroes(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        boolean[][] flagArr = new boolean[rows][cols];
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                if(matrix[i][j]==0){
                    flagArr[i][j]=true;
                }
            }
        }
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                if(flagArr[i][j]==true){
                    /*for rows*/
                    for(int k=0; k<rows; k++){
                        matrix[k][j]=0;
                    }
                    /*for cols*/
                    for(int z=0; z<cols; z++){
                        matrix[i][z]=0;
                    }
                }
            }
        }
    }

}
