package Easy;

import java.util.Scanner;

public class MesozoicEdenAssistant {

	Scanner sc = new Scanner(System.in);

	String[] dinoNames = new String[10];
	int[] dinoAges = new int[10];
	int[] dinoWeights = new int[10];
	int dinoCount=0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 MesozoicEdenAssistant main=new  MesozoicEdenAssistant();
		 main.start();

	}

	public void start() {

		while (true) {
			displayMenu();
			int choise = sc.nextInt();
			handleMenuChoice(choise);
		}
	}

	public void displayMenu() {

		System.out.println("Welcome to Mesozoic Eden Assistant!");
		System.out.println("1. Add Dinosaur");
		System.out.println("2. Check Park Hours");
		System.out.println("3. Greet Guest");
		System.out.println("4. Check Visitors Count");
		System.out.println("5. Manage Staff");
		System.out.println("6. Exit");
		System.out.print("Enter your choice: ");
	}

	public void handleMenuChoice(int choice) {

		switch (choice) {
		case 1:
			addDinosaur();
			break;
		case 2:
			checkParkHour();
			break;
		case 3:
			greetGuest();
			break;
		case 4:
			checkVisitorsCount();
			break;
		case 5:
			manageStaff();
			break;
		case 6:
			System.out.println("Exiting....");
			System.exit(0);

		default:
			System.out.println("Please Enter valid choice..!!");
		}

	}

	public void manageStaff() {
		// TODO Auto-generated method stub
		
	}

	public void checkVisitorsCount() {
		// TODO Auto-generated method stub
		
	}

	public void greetGuest() {
		// TODO Auto-generated method stub
		
	}

	public void checkParkHour() {
		// Assuming the park is open from 8am to 6pm.
		int currentHour=java.time.LocalTime.now().getHour();
		if(currentHour>=8 && currentHour <18) {
			System.out.println("The park is currently open.");
		}else {
			System.out.println("The park is currently closed.");
		}
		
		
	}

	public void addDinosaur() {

		if (dinoCount >= 1) {
			System.out.println("The park is at full capacity. No more dinosaurs can be added.");
			return;
		}
		
		sc.nextLine();
		System.out.println("Enter dinosaur name: ");
		dinoNames[dinoCount]=sc.nextLine();
		System.out.println("Enter dinosaur age: ");
		dinoAges[dinoCount]=sc.nextInt();
		System.out.println("Enter dinosaur weight: ");
		dinoWeights[dinoCount]=sc.nextInt();
		dinoCount++;
		
		 System.out.println(dinoNames[dinoCount - 1] + " has been added to the park!");
	}

}
