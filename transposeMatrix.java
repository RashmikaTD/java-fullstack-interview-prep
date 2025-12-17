/******************************************************************************
Transpose the matrix:

Input:

1 2 3
4 5 6
7 8 9

Output:

1 4 7
2 5 8
3 6 9

Call transposeMatrix(matrix)
  │
  ▼
Inside transposeMatrix:
  ├─ rows = matrix.length
  ├─ cols = matrix[0].length
  ├─ Initialize transposed = new int[cols][rows]
  │
  ▼
  Loop i = 0 to rows-1
      ├─ Loop j = 0 to cols-1
      │     └─ transposed[j][i] = matrix[i][j]
  ▼
Return transposed
  │
  ▼
Back in main:
  ├─ rows = transposed.length
  ├─ cols = transposed[0].length
  │
  ▼
  Loop i = 0 to rows-1
      ├─ Loop j = 0 to cols-1
      │     └─ Print transposed[i][j] + " "
      └─ Print new line
  ▼
End

*******************************************************************************/
import java.util.*;

public class Main
{
    
	public static void main(String[] args) {
// 		int[][] matrix = new int[3][3]; // 3 rows, 3 columns
		int[][] matrix = {
                            {1, 2, 3, 4},
                            {14, 15, 16, 5},
                            {13, 20, 17, 6},
                            {12, 19, 18, 7},
                            {11, 10, 9, 8}
                        };

// int[][] matrix = {
//     {5, 7, 8},
//     {6, 9, 3},
//     {4, 2, 1}
// };
        int[][] transposed = transposeMatrix(matrix);
        int rows=transposed.length;
	    int cols=transposed[0].length;
        for(int i=0;i<rows;i++){
	        for(int j =0; j<cols; j++){
	            System.out.print(transposed[i][j]+" ");
	        }
	        System.out.println();
	    }
	}
	
	public static int[][] transposeMatrix(int[][] matrix){
	    int rows=matrix.length;
	    int cols=matrix[0].length;
	    int[][] transposed = new int[cols][rows];
	    for(int i=0;i<rows;i++){
	        for(int j =0; j<cols; j++){
	            transposed[j][i] = matrix[i][j];
	        }
	        
	    }
	    return transposed;
	  }
}
