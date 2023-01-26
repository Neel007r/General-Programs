package Practice;

public class leap_year {
	public static void main(String[] args) {
		int year = 1924;
		if(((year%4==0) && (year%100 != 0)) || (year%400 ==0)) {   //very tricky condition, got wrong in udemy exercise
		System.out.println("Leap year");
		}
		else {
			System.out.println("Common year");
		}
	}

}
