package five;
import java.util.Scanner;
public class Av {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int s=0,av;
		int num=sc.nextInt();
		int a[]=new int[num];
		for(int i=0;i<num;i++)
		{
		a[i]=sc.nextInt();
		}
		for(int i=0;i<num;i++)
		{
		 s=s+a[i];
		}
		av=s/num;
		System.out.println(av);
		
		
	}

		
}
