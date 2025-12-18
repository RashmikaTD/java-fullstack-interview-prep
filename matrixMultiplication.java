/******************************************************************************

Matrix Multiplication

We have to check the compatability 

------->num1Col == num2row

Result Matrix dimension: num1Row X num2Col

we use 3 loops for Multiplication

i → result rows (num1Row)
j → result columns (num2Col)
k → common dimension (num1Col / num2Row)

result[i][j] += num1[i][k]*num2[k][j];

*******************************************************************************/

public class Main
{
	public static void main(String[] args) {
		int num1[][] = {
		                {1,2,3},
		                {4,5,6},
		                };
		int num2[][] = {
		                {7,8},
		                {9,10},
		                {11,12}
		                };
		
		int num1Row=num1.length;
		int num1Col=num1[0].length;
		int num2Row=num2.length;
		int num2Col=num2[0].length;
		int result[][] = new int[num1Row][num2Col];
		if(num1Col!=num2Row){
		    System.out.println("Matirx Multiplication Not possible");
		    return;
		}
		System.out.println("Matirx Multiplication Possible");
		for(int i=0;i<num1Row;i++){
		    
		    for(int j=0;j<num2Col;j++){
		        
		        for(int k=0;k<num1Col;k++){
		            
		            result[i][j] += num1[i][k]*num2[k][j];
		        }
		    }
		}
		
		for(int i=0;i<num1Row;i++){
		    for(int j=0;j<num2Col;j++){
		        System.out.print(result[i][j]+"   ");
		    }
		    System.out.println();
		}
	}
}
