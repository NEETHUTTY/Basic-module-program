package six;
import java.util.Scanner;
public class Mark {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int c=0;
		int num=sc.nextInt();
		int a[]=new int[num];
		for(int i=0;i<num;i++)
		{
		a[i]=sc.nextInt();
		}
		for(int i=0;i<num;i++)
		{
		if(a[i]<50)
		{
			c++;
		}
		
		}
	
	System.out.println(c);
	}
}
