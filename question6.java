package Assign4;

public class question6 {

	public static void main(String[] args) {
		int temp,a[] = {1,1,1,1,0,0,1,0};
		
		for(int j=0; j<a.length; j++)
		{
			for(int k=0; k<a.length-1; k++)
			{
				if(a[k]>a[k+1])
				{
					temp = a[k];
					a[k]=a[k+1];
					a[k+1]=temp;
				}
			}
		}
		
		for(int i=0; i<a.length ; i++)
			System.out.print(a[i]);

	}

}
