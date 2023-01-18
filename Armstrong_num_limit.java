package Practice;

import java.util.Scanner;

public class Armstrong_num_limit {

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
		System.out.println("Enter the limit: ");
		num = sc.nextInt();
		System.out.println("Armstrong number up to "+num+" are: ");
		sc.close();
		
		for(int i=0;i<=num;i++)
			if(isArmstrong(i)) {
				System.out.print(i+" ");
		}
		
		
	}

}

