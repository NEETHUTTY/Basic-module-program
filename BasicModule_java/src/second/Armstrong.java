package second;

import java.util.Scanner;

public class Armstrong {
	public static void main(String args[])
	{

		Scanner sc=new Scanner (System.in);
		int n= sc.nextInt();
		int c=0,r,arm=1,a=0;
		int t=n;
		while(t!=0)
		{
			t=t/10;
			c++;
		}
		 t=n;
		while(t!=0)
		{
			r=t%10;
			a=a+(int)Math.pow(r,c);
			t=t/10;
			
		}
		if(a==n)
		{
			System.out.println("is armstrong:");
		}
		else
			System.out.println("is not  armstrong:");
			
	}

}
