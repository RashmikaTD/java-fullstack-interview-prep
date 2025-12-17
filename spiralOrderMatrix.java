/******************************************************************************
Sprial Order Matrix:

printing the elements of a 2D matrix in a circular (spiral) manner

1  2  3
4  5  6
7  8  9

Output: Spiral order output is: 1 2 3 6 9 8 7 4 5

Print the 
Call spiralOrderMatrix(matrix)
  │
  ▼
Inside spiralOrderMatrix:
  ├─ Initialize boundaries
  │     ├─ rowStart = 0
  │     ├─ rowEnd   = matrix.length
  │     ├─ colStart = 0
  │     └─ colEnd   = matrix[0].length
  │
  ├─ Initialize row = 0, col = 0
  │
  ▼
WHILE (rowStart < rowEnd AND colStart < colEnd)
  │
  ├─ Step 1: Left → Right (Top Row)
  │     ├─ Set row = rowStart
  │     ├─ Loop col from colStart to colEnd-1
  │     │     └─ Print matrix[row][col]
  │
  ├─ Step 2: Top → Bottom (Right Column)
  │     ├─ Set col = colEnd - 1
  │     ├─ Loop row from rowStart+1 to rowEnd-1
  │     │     └─ Print matrix[row][col]
  │
  ├─ Step 3: Right → Left (Bottom Row)
  │     ├─ Set row = rowEnd - 1
  │     ├─ Loop col from colEnd-2 down to colStart
  │     │     └─ Print matrix[row][col]
  │
  ├─ Step 4: Bottom → Top (Left Column)
  │     ├─ Set col = colStart
  │     ├─ Loop row from rowEnd-2 down to rowStart+1
  │     │     └─ Print matrix[row][col]
  │
  ├─ Shrink boundaries
  │     ├─ rowStart++
  │     ├─ rowEnd--
  │     ├─ colStart++
  │     └─ colEnd--
  │
  └─ Repeat WHILE loop
  │
  ▼
Exit loop




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
        // int rowLength=3;
        // int colLength=3;

        // int [][] matrix = {
        //     {5}
        // };
        // int rowLength=1;
        // int colLength=1;               
        spiralOrderMatrix(matrix);
        
	}
	
	public static void spiralOrderMatrix(int[][] matrix){
	    int rowStart = 0;
	    int rowEnd = matrix.length;
	    int colStart = 0;
	    int colEnd = matrix[0].length;
	    
	   int row = 0;
	   int col = 0;
	    while(rowStart<rowEnd && colStart<colEnd){
	        
	        //Left -> Right
	       // System.out.println("Left -> Right");
	        for(col = colStart; col<colEnd;col++){
	           // System.out.print("Row:"+row+", Col:"+ col);
	           // System.out.println();
	            System.out.print(matrix[row][col]+" ");
	           // System.out.println();
	        }
	        //top -> bottom
        // 	System.out.println();
        // 	System.out.println("top -> bottom");
	        col--;
	        for(row = rowStart+1; row<rowEnd;row++){
	           // System.out.print("Row:"+row+", Col:"+ col);
	           // System.out.println();
	             System.out.print(matrix[row][col]+" ");
	           // System.out.println();
	        }
	        //right -> left
	       // System.out.println();
	       // System.out.println("right -> left");
	        row--;
	        for(col = colEnd-2; col>=colStart;col--){
	           // System.out.print("Row:"+row+", Col:"+ col);
	           // System.out.println();
	            System.out.print(matrix[row][col]+" ");
	           // System.out.println();
	        }
	        //bottom -> top
	       // System.out.println();
	       // System.out.println("bottom -> top");
	        col++;
	        
	        for(row = rowEnd-2; row>=rowStart+1;row--){
	           // System.out.print("Row:"+row+", Col:"+ col);
	           // System.out.println();
	            System.out.print(matrix[row][col]+" ");
	           // System.out.println();
	        }
	        colStart++;
	        rowStart++;
	        colEnd--;
	        rowEnd--;
	        row = rowStart;
	       // System.out.println();
	       // System.out.println("colStart:"+colStart);
	       // System.out.println("colEnd:"+colEnd);
	       // System.out.println("rowStart:"+rowStart);
	       // System.out.println("rowEnd:"+rowEnd);
	       // System.out.println();
	    }
	}
	
	
}
