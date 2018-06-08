package Assign4;

import java.util.Scanner;

public class question5 {
	
	public static int reverseNumber(int n) {
		int rev=0,rem;
		
		while(n>0)
		{
			rem=n%10;
			rev=rev*10+rem;
			n/=10;
		}
		return rev;
	}

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int reverse = reverseNumber(n);
		System.out.println(reverse);

	}

}
