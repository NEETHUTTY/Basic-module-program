package third;

import java.util.Scanner;

public class Arran {
public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		float temp;
		float values[]=new float[num];
		for(int i=0;i<num;i++)
		{
			 values[i]=sc.nextFloat();
		}
		System.out.println(num);
		for(int i=0;i<num;i++)
		{
			for(int j=i+1;j<num;j++)
			{
			if(values[i]>values[j])
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
