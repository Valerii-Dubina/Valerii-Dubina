package ua.khpi.oop.dubina006;
import java.util.Scanner;

import ua.khpi.opp.dubina003.UtilityClass;
import ua.khpi.oop.mitin003.UtilityClas;

public class Console_program {
	public static Scanner in = new Scanner(System.in);
	public static Serializator serializator=new Serializator();
	 public static int dialog()
	    {
	   	 System.out.println("\n\n Выберите команду:"
				 +"\n*1-Вывести записанные данные"
				 +"\n*2 -Добавить данные"
				 +"\n*3 -Выполнить основное задание"
				 +"\n*4 - Сортировать"
				 +"\n*5 - Поиск"
				 +"\n*6 - Сравнение"
				 +"\n*7 - Сохранить данные"
				 +"\n*8 - Загрузить данные(load)"
				 +"\n*9 (del)-Удалить всё"
				 +"\n*10 (exit)-вийти"
				 +"\n*11 - Вывести данные( ЛР 3)"
				 +"\n*12 - Добавить данные( ЛР 3) "
				 +"\n*13 - Сортировка(ЛР 3)"
				 +"\n\n ваша команда: ");
	   	 
	   	 return in.nextInt();
	   	 
	    }

	    	public static void Menu() 
	    	{
	    		Сontainer s=new Сontainer();
	    		
	    		while(true)
	    		{
	                        
	    		int  k=dialog();
	    		try {
	    		switch(k)
	    		{
	    		case 1: System.out.print(s);
	    		break;
	    		case 2:
	    			System.out.print("Введіть ваш текст: ");
	    			String text=new String();
	    			text=in.nextLine();
	    			s.add(in.nextLine());
	    		break;
	    		case 3:s=ua.khpi.oop.dubina006.UtilityClass.In(s);
	    		break;
	    		case 4:  s.Sort(s);
 
	    		break;
	    		case 5 :  s.posuk(s);
	     		break;
	    		case 6 :s.d_comparison(s);
	    		break;
	    		case 7 : 
	            System.out.print("\n\nЗбереження даних:"+ serializator.serialization(s));
	    		break;
	    		case 8 : s=serializator.deserializtion();
	    		break;
	    		case 9 :s.clear();
	    		break;
	    		case 10 :return ;
	    		case 11:ua.khpi.oop.mitin003.UtilityClas.Vveden_Dann(s.toString());
	    		break;
	    		case 12:
	    			String text2=ua.khpi.oop.mitin003.UtilityClas.AddText();
	    			 	    			s.add(text2);
	    		 break;
	    		case 13:ua.khpi.oop.mitin003.UtilityClas.SortLexicographically(s.m_data);
	    	
	    		break;
	    		
	    		   		
	    		}}catch(Exception e)	  {	
    			System.out.print("\n\n\nЩось пішло не так. Але тепер все добре!!\n\n");}
	    	}
	    }

	}
