package casestudy2;

import java.util.Scanner;

public class Case1 {
	public static void main(String args[])
	{ 
		String ans;
		do
		{
		 System.out.println(" MENU ");
		 System.out.println("1.Booking ");
		 System.out.println("2.Check Status ");
		 System.out.println("3.exit ");
		 System.out.println("enter your choice ");
		    Scanner sc = new Scanner(System.in);
		    int amount=0;
		    int n= sc.nextInt(); 
		   
		        switch(n)
		        {
		  	 case 1:
		  		System.out.println("Booking");
		  	  System.out.println("Please choose the services required. ");
			    System.out.println("1.ac ");
			    System.out.println("2.non ac ");
			  int s= sc.nextInt();
			  switch(s)
			  {
			  case 1:
			  	   System.out.println("ac");
			  	   //amount=amount+750;
			  	// System.out.println("amount is:"+amount);
			  	 break;
			  	 case 2:
			  	   System.out.println("non ac ");
			  	 //amount=amount+0;
			  	 //System.out.println("amount is:"+amount);
			  
			  }
			  System.out.println("1.single cot");
			  System.out.println("2.double cot ");
			  int r= sc.nextInt();
			  switch(r)
			  {
			  case 1:
			  	   System.out.println("single cot");
			  	   amount=amount+0;
			  	 //System.out.println("amount is:"+amount);
			  	 break;
			  	 case 2:
			  	   System.out.println("double cot");
			  	 amount=amount+750;
			  	// System.out.println("amount is:"+amount);
			  
			  }
			  System.out.println("1.with cable connection");
			  System.out.println("2.without cable connection ");
			  int p= sc.nextInt();
			  switch(p)
			  {
			  case 1:
			  	   System.out.println("with cable connection");
			  	   //amount=amount+750;
			  	// System.out.println("amount is:"+amount);
			  	 break;
			  	 case 2:
			  	   System.out.println("without cable connection");
			  	 //amount=amount+0;
			  	 //System.out.println("amount is:"+amount); 
			  
			  }
			  System.out.println("1.wifi needed");
			  System.out.println("2.wifi not needed");
			  int o= sc.nextInt();
			  switch(o)
			  {
			  case 1:
			  	   System.out.println("wifi needed");
			  	   //amount=amount+750;
			  	 //System.out.println("amount is:"+amount);
			  	 break;
			  	 case 2:
			  	   System.out.println("wifi not needed");
			  	 //amount=amount+0;
			  	// System.out.println("amount is:"+amount); 
			  
			  }
			  System.out.println("1.laundry");
			  System.out.println("2.no laundry");
			  int q= sc.nextInt();
			  switch(q)
			  {
			  case 1:
			  	   System.out.println("laundry");
			  	   //amount=amount+750;
			  	 //System.out.println("amount is:"+amount);
			  	 break;
			  	 case 2:
			  	   System.out.println("no laundry");
			  	// amount=amount+0;
			  	 //System.out.println("amount is:"+amount); 
			  
			  }
			  System.out.println("total amount is:"+amount); 
		        
		     
       System.out.println("Do you want to continue? (yes/no)");
    ans=sc.nextLine();
		
		        }  
    
} 
while(ans.equalsIgnoreCase("yes"));

}
}
		        
       
		
		  	   
		      
		  