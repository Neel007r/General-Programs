package Practice;

import java.util.Scanner;

public class Automorphic_range {
	static boolean isAutomorphic(int num) {
		int square = num * num;
		int count=0;
		int temp = num;
		
		while(temp>0) {
			
			count++;
			temp=temp/10;
		}
		
		int lastDigit = (int)(square%(Math.pow(10, count)));
		return num == lastDigit;
	}

	public static void main(String[] args) {
		int start,end;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the starting value: ");
		start = in.nextInt();
		System.out.println("Enter the ending value: ");
		end = in.nextInt();
		System.out.println("Automorphic numbers between "+start+" and "+end+" are: ");
		
		for(int i=start;i<=end;i++) {
			if(isAutomorphic(i))
				System.out.print(i+" ");
		}	
		

	}

}
