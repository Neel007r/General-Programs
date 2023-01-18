package Practice;

import java.util.Scanner;

public class centre_triangle_pattern {


	public static void main(String[] args) {
		
		int i,j,row;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of rows of pyramid: ");
		row = sc.nextInt();
		
		
		for(i=0;i<row;i++) {
			for(j=(row-i);j>1;j--) {   //due to >=0 it takes 0 to 12 values means 13 total values
				System.out.print(" ");    //print only, not println
			}
			for(j=0;j<=i;j++) {
				System.out.print("* ");    //print only, not println
			}
		System.out.println();
		}
	}

}

