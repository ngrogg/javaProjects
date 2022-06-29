/* 3n+1 Problem
 * By Nicholas Grogg
 * */

// Import statements 
import java.util.Scanner;  

public class threeNPlusOne{  
	// Function to run program to keep all code out of main
	public static void runProgram(){
		// Value for 'n' in series
		int nVal;

		// Variable for count, set initial value of 0
		int count = 0;   

		// Declare scanner variable to hold input
		Scanner sc=new Scanner(System.in);  

		// Read input from user
		System.out.print("Enter the starting point for the sequence: ");  
		nVal=sc.nextInt();  

		// Check that input variable is positive
		while (nVal <= 0){  
			System.out.println("The starting point must be positive. Please re-enter the number: ");  
			nVal=sc.nextInt();  
		}  

		// When nVal > 0  
		while (nVal != 1){  
			if (nVal % 2 == 0)  
			nVal = nVal / 2;  
			
			// Executes when nVal is an odd number  
			else  
			nVal = 3 * nVal + 1;  
			System.out.print(nVal + "\t");  
			
			// Increment count by 1  
			count = count + 1;  
		}  

		// Output how many counts there are in sequence 
		System.out.println();  
		System.out.println("There are "+count+" terms in the sequence.");  

	}

	// Main, only runs program
	public static void main(String args[]){  
		// Run function above 
		runProgram();
	} 
} 
