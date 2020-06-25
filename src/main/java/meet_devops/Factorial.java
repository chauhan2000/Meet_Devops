package meet_devops;
import java.util.Scanner;
public class Factorial {
 
	public static void main(String[] args) {
		
		int number;
		System.out.print("Enter the number: ");
		Scanner scan = new Scanner(System.in);
	 	number = scan.nextInt();
	 	scan.close();
		
		int factorial = number;
		
		for(int i =(number - 1); i > 1; i--)
		{
			factorial = factorial * i;
		}
	
		System.out.println("Factorial of a number is " + factorial);
	}
}
