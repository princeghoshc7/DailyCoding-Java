package DailyExercise;

import java.util.Scanner;

public class SwapNumber1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of a : ");
		int a=sc.nextInt();
		System.out.println("Enter the value of b : ");
		int b=sc.nextInt();
		
		System.out.println("Before swapping a & b : ");
		System.out.println("a = "+a+", b = "+b);
		
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("After swapping a & b : ");
		System.out.println("a = "+a+", b = "+b);
		
	}

}
