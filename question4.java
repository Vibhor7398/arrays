package Assign4;

import java.util.Scanner;

public class question4 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int arm=0,rem=0,temp=0,temp2,digits=0,d,pwr=1;
		temp = n;
		temp2 = n;
		while(temp2>0)
		{
			digits++;
			temp2/=10;
		}
		d = digits;
		while(temp>0)
		{
			digits = d;
			rem=temp%10;
			pwr=1;
			while(digits>0)
			{
				pwr*=rem;
				digits--;
			}
		//	System.out.println(pwr);
			arm+=pwr;
			
			temp/=10;
		}
		if(n==arm)
		{
			System.out.println("Yes " + n + " is an armstrong number.");
		}
		else
		{
			System.out.println("No " + n +  " is not armstrong number.");
		}
			
		

	}

}
