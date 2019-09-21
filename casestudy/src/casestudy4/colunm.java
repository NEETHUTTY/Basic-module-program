package casestudy4;

import java.util.Scanner;

public class colunm {
	public static String[] array=new String[20];
	public static String[] email=new String[20];
	public static void main(String args[])
	{ 
		Scanner sc=new Scanner(System.in); 
           int i=0,n;
           String str,a,o,p,q,r,t,l;
  
           do
           {
           System.out.println("Registration");
               i++;
	       System.out.println("Enter your name:");
	        //str= sc.nextLine();
	       array[i] = sc.nextLine();
	      // System.out.println(str);
	       System.out.println("Enter your age:");
	        o= sc.nextLine();
	       //System.out.println(o);
	       System.out.println("Enter your address:");	       
	       p= sc.nextLine();
	       //System.out.println(p);
	       System.out.println("Enter your email:");
	       //q= sc.nextLine();
	       email[i]=sc.nextLine();
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
           }while(a.equalsIgnoreCase("yes"));
           customer(i);
	}
           public static void customer(int n)
           {
        	   System.out.println("coustomer list");
        	   System.out.println("the registered customers");
        	   System.out.println("customer id    name   email");
        	   for(int j=1;j<=n;j++)
        	   {
        		   System.out.println(j+"\t\t"+array[j]+"\t\t"+email[j]);   
        	   }
           }
          
           }


