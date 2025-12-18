/******************************************************************************
calculateCricketScore

    we will get score in string. 
    wide and no ball are calculated as extras 
    if the run is odd the strike changes- we can track this using a bool variable

IP: "1.2.436W1.N.2.1"

output: P1: 8
    P2:12
    extra: 2


*******************************************************************************/
import java.util.*;
public class Main
{
    
    public static void main(String[] args) {
		String scores = "1.2.436W1.N.2.1";
		calculateCricketScore(scores);
		
	}
	
	public static void calculateCricketScore(String str){
	    int player1Score= 0;
	    int player2Score= 0;
	    int extra= 0;
	    boolean player1Strike = true;
	    char score[] = str.toCharArray();
	    for(int i=0;i<score.length;i++){
	        char s = score[i];
	        switch(s){
	            case 'W':
                case 'N':
	                extra++;
	                break;
	            case '.':
	                break;
	            default :
	                if(s>='0' && s<='9'){
	                    int n = s-'0';
	                    if(player1Strike)
	                        player1Score+=n;
	                    else 
	                        player2Score+=n;
	                        
	                   if((n%2)!=0)
	                        player1Strike=!player1Strike;
	                }
	        }
	    }
	    System.out.println("Player 1 Score:"+player1Score);
	    System.out.println("Player 2 Score:"+player2Score);
	    System.out.println("Extra:"+extra);
	}
	
}
