package Mathematics;

import java.util.Scanner;

public class SumOfNaturalNumber {
	
	public static int calculateSum(int num) {
		
		return (num*(num+1)/2);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter the positive interger number : " );
		int n=sc.nextInt();
		
		if(n<0) {
			System.out.println("Invalide Integer ! ");
		}
		else {
			
			int sum=calculateSum(n);
			System.out.println("Sum of first " + n + " natural number is : " + sum);
		}
		

	}

}
