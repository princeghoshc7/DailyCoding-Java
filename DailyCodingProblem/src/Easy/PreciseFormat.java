package Easy;

import java.util.Scanner;

public class PreciseFormat {
	
	public static void printInFormat(float a, float b) {
		
		if(b!=0) {
			
			float result=a/b;
			System.out.format("%.7f ", result); // This method used to print values till 7 count after decimal
			System.out.format("%.3f%n", result); // same method use to print values till count 3 
		}
		else {
			System.out.println("Divison not possible if denominator value 0 ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Please Enter Float value of a: ");
		float a=sc.nextFloat();
		System.out.print("Please Enter Float value of b: ");
		float b=sc.nextFloat();
		
		printInFormat(a,b);
	}

}
