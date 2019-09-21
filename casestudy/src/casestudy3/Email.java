package casestudy3;

import java.util.Scanner;

public class Email {
	public static void main(String args[])
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
           System.out.println("Do you want to update email id?(yes/no)" );
           l=sc.nextLine();
           //System.out.println(l);
           while(l.equalsIgnoreCase("yes"))
          {
        	   
        	  System.out.println("update email");
        	   q=sc.nextLine();
        	   System.out.println(" email updated");
        	   break;
          }
        	   System.out.println(" Your deatials are as follows:");
        	   System.out.println(" Name is"+str);
        	   System.out.println(" Age is"+o);
        	   System.out.println(" Address is"+p);
        	   System.out.println(" Email is"+q);
        	   System.out.println(" Id type is"+r);
        	   System.out.println(" Proof id is"+t);
        	   //System.out.println(" proof id is"+ ++i);
        	   System.exit(0);
           }
           
	       
	

}

