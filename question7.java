package Assign4;

import java.util.Scanner;

public class question7 {
	
	public static void main(String args[])
	{
		int flag=0,n,a[] = {1,4,6,7,8,9,10};
		Scanner s = new Scanner(System.in);
		n = s.nextInt();
		
		for(int i=0; i<a.length; i++)
		{
			if(a[i]==n)
			{
				System.out.print("Yes, " + n + " is present.");
				flag=1;
				break;
			}
		}
		if(flag==0)
		{
			System.out.print("No, " + n + " is not present");
		}
	}

}
