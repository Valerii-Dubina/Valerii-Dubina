package ua.khpi.oop.dubina004;

import java.util.ArrayList;

import java.util.Scanner;

public class Debug
{
	static ArrayList<String> text = new ArrayList<String>();
	static String S;
	static int num;
	static String SS[]; 
	static int k;
	int a=1;

		public static void   In()
		{
			 Scanner s = new Scanner(System.in);
	            S=s.nextLine();
	            SS= S.split("\\s");
		}
		public static void Vveden_Dann()
		{
			System.out.print(S);
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
			System.out.print("Количестов слов в строке   ");
			System.out.print(SS.length);
			System.out.print("\n");
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
		    System.out.print("Количество пар оборотов   ");
		    System.out.print(num);
			System.out.print("\n");

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

		public static void Output()
		{
          System.out.print("Введите на текс латиницей\n");
    
		}
		public static void End()
		{
	          System.out.print("Ваш результат\n");

		}
}
