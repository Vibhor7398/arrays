package Assign4;
import java.util.Scanner;
public class question3 {

	public static void main(String[] args) {
		
	Scanner s = new Scanner(System.in);
	int n = s.nextInt();
	
	for(int i = 2; i<=n ; i++)
	{
		int flag = 0;
		for(int j=2; j<=i/2 ; j++)
		{
			if(i%j==0)
			{
				flag = 1;
				break;
			}
		}
		if(flag==0)
		{
			System.out.println(i);
		}
		
	}

	}

}
