package case6;

import java.util.Scanner;

public class Hotel1 {
	
		 public static void main(String args[])
		 {   
		Scanner sc=new Scanner(System.in);
		 
		int i=1;
		int a,s,c,w,l,total=0;
		String ac,cot,cable,wifi,laundry,ans,y;
		      int k;
		      do
		      {
		         System.out.println("Booking:");
		         
		         System.out.println("Please choose the services required.\nAC/non-AC(AC/nAC)");
		         ac=sc.nextLine();
		         if(ac.compareTo("ac")==0);
		         total=total+500;
		         System.out.println ("Cot(Single/Double)");
		         cot=sc.nextLine();
		         if(cot.compareTo("single")==0)
		         total=total+350;
		         else
		         total=total+500;
		         System.out.println(" With cable connection/without cable connection(C/nC)");
		         cable=sc.nextLine();
		         if(cable.compareTo("c")==0)
		         total=total+100;
		         System.out.println("Wi-Fi needed or not(W/nW)");
		         wifi=sc.nextLine();
		         if(wifi.compareTo("w")==0)
		         total=total+100;
		         System.out.println("Laundry service needed or not(L/nL)");
		         laundry=sc.nextLine();
		         System.out.println("Do you want to proceed? (y/n)");
		         y=sc.nextLine();
		         if(y.compareTo("yes")==0)
		         {
		         System.out.println("Thank you for booking Your room number is"+i++);
		        
		         System.out.println("Your total charge is : "+total);
		         System.out.println("The services chosen are");
		         if(laundry.compareTo("l")==0)
		         total=total+500;
		        
		              System.out.println(cot+" cot "+ac+" room");
		              if(cable.compareTo("c")==0)
		             System.out.println("Cable connection enabled");
		              else
		             System.out.println("Cable connection disabled");
		              if(wifi.compareTo("w")==0)
		             System.out.println("Wi-Fi enabled");
		              else
		             System.out.println("Wi-Fi disabled");
		              if(laundry.compareTo("l")==0)
		             System.out.println("with laundry service");
		              else
		             System.out.println("with out laundry service"); 
		         }
		     System.out.println("Do you want to proceed? (y/n)");
		     ans=sc.nextLine();
		         
		     
		     
		   }while(ans.compareTo("yes")==0);
		    }
		    
		}
