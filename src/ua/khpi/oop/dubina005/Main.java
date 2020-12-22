package ua.khpi.oop.dubina005;
import java.util.Scanner;

import ua.khpi.oop.dubina005.UtilityClass;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.ArrayList;

public class Main 
{
	public static Scanner in = new Scanner(System.in);
	 public static void main(final String[] argv) 
     {
		 	System.out.print("Введите ваши слова\n");
 			Container s = new Container();
			String s2=new String(in.nextLine());
			s.add(s2);
            Iterator<String> iterator=s.iterator();
			System.out.print("Ваш результат\n");
			UtilityClass.In(s);
            System.out.print("\n Вивод через iтератор(while):");
            while (iterator.hasNext())
           {
       	    System.out.print(iterator.next().toString());
       	    
           }

     }

}
