package Hard;

import java.util.Scanner;

public class EX_DP {
	
	
	public static void performAction(int option) {
		
		switch(option) {
			
		case 1:
			Greeting();
			break;
		case 2:
			Col();
			break;
			
			default:
				System.out.println("Invalid Option");
			
		}
	}
	

	public static void Greeting() {

		String Gre = "Calling Method " + " Welcome to Java " + " Method Called Sucessfully!!";
		System.out.println(Gre);
	}

	public static void Col() {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your choice: ");
		int choice=sc.nextInt();
		
		switch(choice) {
		
		case 1:
			System.out.println("Red");
			break;
		case 2:
			System.out.println("Blue");
			break;
		case 3:
			System.out.println("Pink");
			break;
			default:
				System.out.println("color not available");
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String Greeting = "Hello Java";
		System.out.println(Greeting);
		
		Scanner ns=new Scanner(System.in);
		System.out.println("Please enter your input: ");
		int option=ns.nextInt();
		performAction(option);

	}

}
