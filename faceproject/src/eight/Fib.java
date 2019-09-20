package eight;

import java.util.Scanner;

public class Fib {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int t1=0,t2=1,sum=0;
		int num=sc.nextInt();
		System.out.print(t1+" ");
		System.out.print(t2+" ");
		
		for(int i=0;i<=num;i++)
		{
			
			sum=t1+t2;
			System.out.print(sum+" " );
			t1=t2;
			t2=sum;
			
		}
		
		}
		
		

}
