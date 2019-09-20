package ten;

import java.util.Scanner;

public class Bid11 {
		public static void main(String args[])
		{
			Scanner sc=new Scanner(System.in);
			int num=sc.nextInt();
			int a[]=new int[num];
			int max=0;
			for(int i=0;i<num;i++)
			{
			a[i]=sc.nextInt();
			}
			for(int i=0;i<num;i++)
			{
			if(a[i]>max)
			{
				max=a[i];
			}
			
			}
			
			System.out.println( max);
}
}
