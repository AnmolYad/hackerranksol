package hackerranksol;

import java.util.*;

public class LeapYear
{   
	    
	public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
    System.out.println("Enter the year: ");
    int n = sc.nextInt();
	if(n%4==0&&n%100!=0){
		    System.out.println("yes it is leap year");
		}
    else if(n%400==0){
		  System.out.println("yes it is leap year");
		 }
    else{
		 System.out.println("No it is not a leap year");
		     }
		   
		}


}
