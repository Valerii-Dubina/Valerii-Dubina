package ua.khpi.oop.dubina006;
import java.util.Scanner;

import ua.khpi.opp.dubina003.UtilityClass;
import ua.khpi.oop.mitin003.UtilityClas;

public class Console_program {
	public static Scanner in = new Scanner(System.in);
	public static Serializator serializator=new Serializator();
	 public static int dialog()
	    {
	   	 System.out.println("\n\n �������� �������:"
				 +"\n*1-������� ���������� ������"
				 +"\n*2 -�������� ������"
				 +"\n*3 -��������� �������� �������"
				 +"\n*4 - �����������"
				 +"\n*5 - �����"
				 +"\n*6 - ���������"
				 +"\n*7 - ��������� ������"
				 +"\n*8 - ��������� ������(load)"
				 +"\n*9 (del)-������� ��"
				 +"\n*10 (exit)-�����"
				 +"\n*11 - ������� ������( �� 3)"
				 +"\n*12 - �������� ������( �� 3) "
				 +"\n*13 - ����������(�� 3)"
				 +"\n\n ���� �������: ");
	   	 
	   	 return in.nextInt();
	   	 
	    }

	    	public static void Menu() 
	    	{
	    		�ontainer s=new �ontainer();
	    		
	    		while(true)
	    		{
	                        
	    		int  k=dialog();
	    		try {
	    		switch(k)
	    		{
	    		case 1: System.out.print(s);
	    		break;
	    		case 2:
	    			System.out.print("������ ��� �����: ");
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
	            System.out.print("\n\n���������� �����:"+ serializator.serialization(s));
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
    			System.out.print("\n\n\n���� ���� �� ���. ��� ����� ��� �����!!\n\n");}
	    	}
	    }

	}
