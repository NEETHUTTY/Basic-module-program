package forteen;

import java.util.Scanner;

public class ncr {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		long f=1,s=1,v=1,result=0;
		
		long n=sc.nextInt();
		int r=sc.nextInt();
		long d=(n-r);
		//System.out.println(d);
		for(int i=1;i<=n;i++)
		{
			f=f*i;
		}
		for(int j=1;j<=r;j++)
		{
			s=s*j;
		}
		for(int k=1;k<=d;k++)
		{
			v=v*k;
		}
		result=f/(s*v);
		System.out.println(result);
		//System.out.println(s);
		//System.out.println(v);
}
}