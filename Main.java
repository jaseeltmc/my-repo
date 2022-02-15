import java.awt.SecondaryLoop;
import java.util.Scanner;

public class Main {

	Scanner sc = new Scanner(System.in);
	
	public void checkPalindrome() {
		
	}
	public void printPattern() {
		
	}
	
	public void checkPrimeNumber() {

	}
	
	public void printFibonacciSeries(int first,int second ) {
		
	 first = 0;
	 
	 second = 0;
		
		
	}
	
	public static void main(String[] args) {
		
		Main obj = new Main();
		
		int choice = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		do {
			System.out.println("Enter your choice from below list.\n" 
		+ "1.Find palindrome of number.\n "
		+  "2. Print patern fora given Number.\n" 
		+ "3.Check whether the no Is a prime.\n" 
		+ "4. print fibonacci series.\n" + "Enter 0 to Exit.\n");
			
			System.out.println();
			
			switch (choice) {
			case 0:
				choice = 0;
				
				
				break;
				
			case 1 : {
				
				obj.checkPalindrome();
			}

				break;
			case 2 : {
				
				obj.printPattern();
				
			}
			break;
			
			case 3:{
				
				obj.checkPrimeNumber();
				
			}
			
			break;
			
			case 4: {
				
				obj.printFibonacciSeries( choice,choice);
				
			}
			break;
			default:
				
				System.out.println("invalid choice.Enter a valid no.\n");
			}
		}while (choice !=0);
		
		System.out.println("Exited Successfully!!!");
		
		sc.close();
		
		
	}
}


