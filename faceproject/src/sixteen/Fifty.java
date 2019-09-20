package sixteen;

import java.util.Scanner;

public class Fifty {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int a[]=new int[num];
		int c=0;
		for(int i=0;i<num;i++)
		{
		a[i]=sc.nextInt();
		}
		for(int i=0;i<num;i++)
		{
		if(num!=0)
			{
		if(a[i]>50)
		{
			c++;
		}	

}
		
		
	
	}
		System.out.println(c);
}
}