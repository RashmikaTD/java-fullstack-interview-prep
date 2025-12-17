/******************************************************************************
colunmWiseSum

Input:  
1   2   3   4
14  15 16  5
13  20 17  6
12  19 18  7
11  10  9   8


 Output: 15 18 12
 
 
Call colunmWiseSum(matrix)
  │
  ▼
Inside colunmWiseSum:
  ├─ Get number of rows → row = matrix.length
  ├─ Get number of columns → cols = matrix[0].length
  │
  ▼
FOR each column j from 0 to cols-1
  │
  ├─ Initialize sum = 0
  │
  ├─ FOR each row i from 0 to row-1
  │     └─ Add matrix[i][j] to sum
  │
  ├─ Print sum of current column
  │
  ▼
END FOR

*******************************************************************************/
import java.util.*;

public class Main
{
    
	public static void main(String[] args) {
// 		int[][] matrix = new int[3][3]; // 3 rows, 3 columns
// 		int[][] matrix = {
//                             {1, 2, 3, 4},
//                             {14, 15, 16, 5},
//                             {13, 20, 17, 6},
//                             {12, 19, 18, 7},
//                             {11, 10, 9, 8}
//                         };

int[][] matrix = {
    {5, 7, 8},
    {6, 9, 3},
    {4, 2, 1}
};
        
        colunmWiseSum(matrix);
        
	}
	
	public static void colunmWiseSum(int[][] matrix){
	    int row=matrix.length;
	    int cols=matrix[0].length;
	    for(int j=0;j<cols;j++){
	        int sum = 0;
	        for(int i =0; i<row; i++){
	                sum += matrix[i][j];
	        }
	        System.out.print(sum+" ");
	    }
	  }
}
