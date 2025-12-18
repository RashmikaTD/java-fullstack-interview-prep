/******************************************************************************
Calculator using (+) alone;

num + (-num)
use for loop multiply
use while (num1>num2) for divide


*******************************************************************************/
import java.util.*;
public class Main
{
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the numbers: ");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		
		addition(num1,num2);
		subract(num1,num2);
		multiply(num1,num2);
		divide(num1,num2);
		
	}
	
	public static void addition(int num1, int num2){
	    System.out.println("Sum:"+(num1+num2));
	}
	public static void subract(int num1, int num2){
	    System.out.println("Difference:"+(num1+(-num2)));
	}
	public static void multiply(int num1, int num2){
	    int mul = 0;
	    int loop=(num2<0)?(-num2):num2;
	    for(int i=0; i<loop;i++){
	        mul+=num1;
	    }
	    if(num2<0){
	        mul = -mul;
	    }
	    System.out.println("Product:"+mul);
	}
	public static void divide(int num1, int num2){
	    int count=0;
	    if(num2==0){
	        System.out.println("Can not divide by 0");
	        return;
	    }
	    int temp = (num1<0)?(-num1):num1;
	    while(temp>num2){
	        temp = temp+(-num2);
	        count++;
	    }
	    
	    if((num1>0 && num2<0) ||(num1<0 && num2>0))
	    {
	        count= -count;
	    }
	    System.out.println("Quotient:"+count);
	}
}
