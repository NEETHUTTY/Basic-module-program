package Four;

import java.util.Scanner;

public class Stud {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int temp;
		int values[]=new int [num];
		for(int i=0;i<num;i++)
		{
			 values[i]=sc.nextInt();
		}
		System.out.println(num);
		for(int i=0;i<num;i++)
		{
			for(int j=i+1;j<num;j++)
			{
			if(values[i]<values[j])
			{
				temp=values[i];
				values[i]=values[j];
				values[j]=temp;	
			}
		}
		
	}
		for(int i=0;i<num;i++)
		{
			System.out.println(values[i]);	
		}

}
}



