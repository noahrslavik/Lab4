package labfour;

import java.util.Scanner;

public class labfour {
	
	public static void main(String [] args) {
	
		boolean isTrue;
		Scanner kbd = new Scanner (System.in);
		
		
		do {
			System.out.println("Enter an integer");
				
				int userInput = kbd.nextInt();
				System.out.println("Number    Squared    Cubed");
				System.out.println("======    =======    =====");
				
				
				for(int i = 1; i <= userInput; i++) 
					System.out.printf("%-10s%-11s%-11s\n", i, (i*i), (i*i*i));
				
				System.out.println("Would you like to continue(y/n)");
				String response = kbd.next();
				isTrue = response.equalsIgnoreCase("y");
				
	}
	while(isTrue);
		System.out.println("Goodbye for now.");
				
	}
}
