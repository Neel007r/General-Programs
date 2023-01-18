package Practice;

import java.util.Scanner;

public class Automorphic_num {
	static boolean isAutomorphic(int num) {
		int square = num * num;
		
		while(num>0) {
			if(num%10 != square%10)
				return false;
			num = num/10;
			square = square/10;
		}
		return true;
	}

	public static void main(String[] args) {
		int number;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		number = sc.nextInt();
		
		System.out.println(isAutomorphic(number) ? "Automorphic" : "Not Automorphic");
	}

}
