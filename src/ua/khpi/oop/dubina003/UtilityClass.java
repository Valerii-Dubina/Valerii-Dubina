package ua.khpi.oop.dubina003;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class UtilityClass 
{
	static ArrayList<String> text = new ArrayList<String>();
	static String S;
	static int num;
	static String SS[]; 
	static int k;
	int a=1;
	public static Scanner in = new Scanner(System.in);

		public static void   In()
		{
			 Scanner s = new Scanner(System.in);
	            S=s.nextLine();
	            SS= S.split("\\s");
		}
		public static void Vveden_Dann(String string)
		{
			System.out.print(string);
			System.out.print("\n");
		}
		public static void Math()
		{
		    for(int i=0;i<SS.length;i++) 
	           {
	               for(int j =i+1;j<SS.length;j++) 
	               {
	                   if(solve(SS[i], SS[j])) 
	                   {
	                      // System.out.println(SS[i] + " " +SS[j]);
	                       num++;
	 
	                   }
	               }
	           }
	  
	     if(num==0) {
	               //System.out.println("Таких слов не найдено");
	           }
		 

	       }
		public static void Result()
		{
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
	               System.out.println("Таких слов не найдено");
	           		}
		 

	       }
		  static boolean solve(String S,String S1) 
	       {
	           StringBuilder SS = new StringBuilder(S);
	           SS=SS.reverse();
	           return S1.equals(SS.toString());
	       }
		  public static String AddText()
		    {
				System.out.print("Введіть ваш текст: ");
				 String s=new String();
				return s = in.nextLine();///ввод даний
		    }
		public static void Output()
		{
          System.out.print("Введите на текс латиницей\n");
    
		}
		   public static void SortLexicographically(String[] vector)
		    {
		    	  Arrays.sort(vector);
		    }
		public static void End()
		{
	          System.out.print("Ваш результат\n");

		}
}
