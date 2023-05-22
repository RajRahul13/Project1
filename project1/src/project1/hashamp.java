package project1;

import java.util.*;

public class hashamp {
	public static void main(String args[]) 
	   { 
	       Map< Integer,String> hm =  
	                        new HashMap< Integer,String>(); 
	       hm.put(1001, new String("Manish")); 
	       hm.put(1002, new String("Rahul")); 
	       hm.put(1003, new String("neeraj")); 
	       hm.put(1004, new String("Khaja")); 
	  
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter ID");
				int empid = sc.nextInt();
				int a=0;
			// Returns Set view      
	       Set< Map.Entry< Integer,String> > st = hm.entrySet();
				
	       for (Map.Entry< Integer,String> me:st) 
	       { 
				if (empid == me.getKey())
				{
					System.out.print(me.getKey()+":"); 
					System.out.println(me.getValue());
					a=a+1;				
				}
						
	       } 
		   if (a==0)
		   {
			   System.out.println("invalid empid");
			   System.out.println("Enter ID");
				int empid1 = sc.nextInt();
				empid1 = empid;
		   }
	   }

}
