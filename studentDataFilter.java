/******************************************************************************

Student Data Filter

*******************************************************************************/
import java.util.*;
public class Main
{
    
    public static class Student{
	    int rNo;
	    int marksA;
	    int marksB;
	    int marksC;
	    
	    Student(int rNo, int marksA, int marksB, int marksC){
	        this.rNo=rNo;
	        this.marksA=marksA;
	        this.marksB=marksB;
	        this.marksC=marksC;
	    }
	}	
	
	
	public static void main(String[] args) {
		ArrayList<Student> students = new ArrayList<>();
		students.add(new Student(1,56,78,91));
		students.add(new Student(2,64,89,96));
		students.add(new Student(3,98,45,78));
		students.add(new Student(4,76,69,62));
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the field to print:");
		String fieldToPrint = sc.nextLine().toUpperCase();
		System.out.println("Enter the condition:");
		String condition = sc.nextLine();
		
		char field = Character.toUpperCase(condition.charAt(0));
		char operator = condition.charAt(1);
		int value = Integer.parseInt(condition.substring(2));
		boolean condtionMet = false;
// 		System.out.println(students);
		for (Student student :students)
		{
		  //  System.out.println(student.marksA);
		    switch(field){
		        case 'A':
		            condtionMet = evaluvateCondition(field,operator,value,student.marksA);
		            break;
		        case 'B':
		            condtionMet = evaluvateCondition(field,operator,value,student.marksA);
		            break;
		        case 'C':
		            condtionMet = evaluvateCondition(field,operator,value,student.marksA);
		            break;
		    }
		    
		    if (condtionMet){
		         switch(fieldToPrint){
		             case "A":
		                System.out.println(student.marksA);
		                break;
		            case "B":
		                System.out.println(student.marksB);
		                break;
		            case "C":
		                System.out.println(student.marksC);
		                break;
		            default:
		                System.out.println(student.marksA+" "+student.marksB+" "+student.marksC);
		      
		         }
		    }
		}
		
	}
	
	public static boolean evaluvateCondition(char field, char operator, int value, int mark){
	    boolean conditionMet=false;
	    switch(operator){
	        case '>':
	            conditionMet = (mark>value);
	            break;
	       case '<':
	            conditionMet = (mark<value);
	            break;
	       case '=':
	            conditionMet = (mark==value);
	            break;
	    }
	    return conditionMet;
	}
	
	
}
