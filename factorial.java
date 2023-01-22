package Practice;

import java.util.Scanner;

public class factorial {
	public static void main(String[] args) {
		
		long n,i, fact=1;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Factorial of number: ");
		n=input.nextInt();
		
		for(i=1;i<=n;i++) {
			fact = fact*i;
		}
	
		System.out.println("Factorial of "+n+" is: "+fact);
	}

}