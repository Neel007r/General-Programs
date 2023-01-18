package Practice;

import java.util.Scanner;

public class Armstrong_num {

	static boolean isArmstrong(int n)
	{
		int temp, digits=0,sum=0, last=0;
		temp=n;
		
		while(temp>0)
		{
			temp=temp/10;
			digits++;
		}
		temp=n;
		while(temp>0)  
		{
			last=temp%10;    //determines the last digit from the number 
			sum += (Math.pow(last, digits));
			temp=temp/10;   //remove the last digit
		}
		if(n==sum)
			return true;
		else
			return false;
		
	}

	public static void main(String[] args) {
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		num = sc.nextInt();
		if(isArmstrong(num)) {
			System.out.println("Armstrong");
		}
		else {
			System.out.println("Not Armstrong");
		}
		
	}

}
