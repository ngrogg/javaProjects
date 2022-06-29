/* Jumbo Javelin
 * By Nicholas Grogg
 * */

// Import statements 
import java.util.Scanner;

public class jumbojavelin{
	// Function to run program
	public static void runProgram(){
		// Declare variables 
		int iterations, rodLength, sum, lostLength;
		sum = 0;
		
		// Declare scanner variable to hold intput 
		Scanner sc=new Scanner(System.in);

		// Read in value for iterations 
		iterations = sc.nextInt();
		lostLength = iterations - 1; 

		// Read in rod lengths and calculate values
		for (int count = 0; count < iterations; count++){
			rodLength = sc.nextInt();
			sum      += rodLength;
		}
		
		// Output final value
		System.out.println(sum - lostLength);
	}

	// Main, only runs function above 
	public static void main(String args[]){
		// Run program function
		runProgram();
	}
}
