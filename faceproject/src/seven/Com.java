package seven;
import java.util.Scanner;
public class Com {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int f=1;
		if(num==1)
		{
			
			System.out.println(num);
		}
		else
			for(int i=1;i<num;i++)
			{
			f=f*i;
			}
		
	
	System.out.println(f);
}
}