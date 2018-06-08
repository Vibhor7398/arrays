package Assign4;

import java.util.Scanner;

public class question2 {
	public static void main(String a[])
	{
	
	Scanner s = new Scanner(System.in);

	int n = s.nextInt();
	
	for (int i = 0; i<n ; i++)
	{
		if(i%2==0)
		{
			System.out.println(i);
		}
	}

}
}