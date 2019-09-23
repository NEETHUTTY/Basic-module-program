package case7;

import java.util.Scanner;

public class Reid {
	public static void main(String args[])
    {
		
		{ 
			Scanner sc=new Scanner(System.in); 
	           int i=0;
	           String str,a,o,p,q,r,t,l,n;
	  
	           do
	           {
	           System.out.println("Reistration");
	               i++;
		       System.out.println("Enter your name:");
		        str= sc.nextLine();
		     //  System.out.println(str);
		       System.out.println("Enter your age:");
		        o= sc.nextLine();
		       //System.out.println(o);
		       System.out.println("Enter your address:");	       
		       p= sc.nextLine();
		       //System.out.println(p);
		       System.out.println("Enter your email:");
		       q= sc.nextLine();
		       //System.out.println(q);
		       System.out.println("Enter your id type:");
		       r= sc.nextLine();
		       //System.out.println(r);
		       System.out.println("Enter your proof id:");
		       t= sc.nextLine();
		       //System.out.println(t);
		       System.out.println(" Thank you for registering. Your id is"+i+"...");
        	   System.out.println("Do you want to continue registration?(yes/no)" );
        	 
		       a=sc.nextLine();
	           }
	           while(a.equalsIgnoreCase("yes"));
		}
    }
}