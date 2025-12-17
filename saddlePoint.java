/******************************************************************************
Saddle point in a matrix


Call saddlePoint(matrix)
  │
  ▼
Inside saddlePoint:
  ├─ Get number of rows → row = matrix.length
  ├─ Get number of columns → cols = matrix[0].length
  ├─ Initialize isSaddlePoint = false
  │
  ▼
FOR each row i from 0 to row-1
  │
  ├─ Find minimum in current row:
  │     ├─ minValue = matrix[i][0]
  │     ├─ minValueColumn = 0
  │     ├─ FOR each column j in row i
  │     │     ├─ IF matrix[i][j] < minValue
  │     │     │     ├─ minValue = matrix[i][j]
  │     │     │     └─ minValueColumn = j
  │
  ├─ Find maximum in minValue's column:
  │     ├─ maxValue = matrix[0][minValueColumn]
  │     ├─ FOR each row k from 0 to row-1
  │     │     ├─ IF matrix[k][minValueColumn] > maxValue
  │     │     │     └─ maxValue = matrix[k][minValueColumn]
  │
  ├─ Check if minValue == maxValue
  │     ├─ IF yes → Print "Saddle Point: minValue" and return
  │
  ▼
END FOR
  │
  ▼
IF no saddle point found (isSaddlePoint == false)
  │
  └─ Print "No Saddle Point"
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
        
        saddlePoint(matrix);
        
	}
	
	public static void saddlePoint(int[][] matrix){
	    int row=matrix.length;
	    int cols=matrix[0].length;
	    boolean isSaddlePoint=false;
	    for(int i =0; i<row; i++){
	        
	        int minValue = matrix[i][0];
	        int minValueColunm = 0;
	        
	        for(int j=0;j<cols;j++){
	            if(matrix[i][j]<minValue){
	                minValue=matrix[i][j];
	                minValueColunm = j;
	            }
	        }
	        
	        int maxValue = matrix[0][minValueColunm];
	       // int maxValueColunm = 0;
	        for(int k=0;k<row;k++){
	            if(matrix[k][minValueColunm]>maxValue){
	                maxValue=matrix[k][minValueColunm];
	            }
	        }
	        
	        if(minValue==maxValue){
	            System.out.print("Saddle Point:"+minValue);
	            return;
	        }
	        
	    }
	    
	    if(!isSaddlePoint){
	        System.out.println("No Saddle Point");
	    }
	    
	}
	
	
	
	
}
