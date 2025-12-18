/******************************************************************************
Rectangle Matrix

Provided with 2d matirx 

Need to create a Rectangle matrix from the input indexes 
and sum of the element the rectangular matrix

Can be done by seting the bounderies of the FOR loop with the indexes provided.


*******************************************************************************/
import java.util.*;
public class Main
{
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int matrix[][] = {
		    {1,2,3,4,6},
		    {5,3,8,1,2},
		    {4,6,7,5,5},
		    {2,4,8,9,4},
		};
		System.out.println("Enter the starting row and colunm: ");
		int r1=sc.nextInt();
		int c1=sc.nextInt();
		System.out.println("Enter the ending row and colunm: ");
		int r2=sc.nextInt();
		int c2=sc.nextInt();
		
		int row = matrix.length;
		int col = matrix[0].length;
		
		if(r1>=row || r2>=row || c1>=col ||c2>=col){
		    System.out.print("Invalid index");
		    return;
		    
		}
		getRectangularMatrix(matrix,r1,c1,r2,c2);
		
	}
	
	public static void getRectangularMatrix(int[][] matrix, int r1, int c1, int r2, int c2){
	    int sum=0;
	    for(int i=r1;i<=r2;i++){
	        for(int j=c1;j<=c2;j++){
	            System.out.print(matrix[i][j]+" ");
	            sum+=matrix[i][j];
	        }
	        System.out.println();
	    }
	    System.out.println("Sum:"+sum);
	}
	
}
