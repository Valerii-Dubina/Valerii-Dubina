package ua.khpi.oop.dubina006;
import java.util.ArrayList;
import java.util.Scanner;
public class UtilityClass
{
	static ArrayList<String> text = new ArrayList<String>();
	static int num;
	static String SS[]; 
	static int k;
	int a=1;
		public static Ñontainer In (Ñontainer s)
		{
			
			
			 String S=new String(s.toString());
	            SS= S.split("\\s");
		
		
		
		    for(int i=0;i<SS.length;i++) 
	           {
	               for(int j =i+1;j<SS.length;j++) 
	               {
	                   if(solve(SS[i], SS[j])) 
	                   {
	                       num++;
	 
	                   }
	               }
	           }
	  
	     if(num==0) {
	               System.out.println("Òàêèõ ñëîâ íå íàéäåíî");
	           }
		 

	  
		    for(int i=0;i<SS.length;i++) 
	           {
	               for(int j =i+1;j<SS.length;j++) 
	               {
	                   if(solve(SS[i], SS[j])) 
	                   {
	                      System.out.println(SS[i] + " " +SS[j]);
	                       num++;
	 
	                   }
	               }
	           }
	  
	     if(num==0) {
	               System.out.println("Òàêèõ ñëîâ íå íàéäåíî");
	           		}
	  
		return s;
		 

	       }
		  static boolean solve(String S,String S1) 
	       {
	           StringBuilder SS = new StringBuilder(S);
	           SS=SS.reverse();
	           return S1.equals(SS.toString());
	       }

		
}
