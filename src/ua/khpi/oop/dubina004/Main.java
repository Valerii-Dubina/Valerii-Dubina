package ua.khpi.oop.dubina004;
import java.util.Scanner;


import ua.khpi.oop.dubina004.UtilityClass;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.ArrayList;
public class Main 
{
	public static void main(final String[] args) 		
     {
	
					 while(true)
					 {
				    	 System.out.print("1.������� ������\n2.���������� ��������� ������\n3.����������\n4.���������\n"
				    	 		+ "5.����������� ������ ������ ���������\n6.��������� ������ ���������\n");
				    	 Scanner in=new Scanner(System.in);
				    	   int p=in.nextInt();
						 switch(p)
						 {
							 case 1:
							 {
						    	   UtilityClass.Output();
						    	   UtilityClass.In();
						    	   break;
							 }
							 case 2:
							 {
									UtilityClass.Vveden_Dann();
									break;
							 }
							 case 3:
							 {
								 UtilityClass.Math();;
								 break;
							 }
							 case 4:
							 {
								 UtilityClass.End();
								 UtilityClass.Result();
								 break;
							 }
							 case 5:
							 {
								 System.out.print("������� ���� -h ���� -d. -h-�������� ������(��������� ������ � �������� � � �������)."
								 		+ "-d-�������� ������ � �������� ������ ����������� ���������\n");
								 Scanner r= new Scanner(System.in);
								 String F;
								 F=r.nextLine();
								String D="-h";
								String E="-d";
								if(F.equals(D))
								{
									System.out.print("������ �������� ������� ������ ��� 119-�, ������ �������.������������� ������� "
											+ "�8:������ �����. � ����� ������ �� ���� ���, � ���� ���� � ����� (������ �������) "
											+ "������ (���������: \"abc\"-\"cba\", \"def\"-\"fed\"). ��������� ������� � ������ �������.\n");
								}
								if(F.equals(E))
								{
									Debug.Output();
									Debug.In();
									Debug.End();
									Debug.Result();
								}
								
								break;
							 }
							 case 6:
							 {
								 System.exit(0);
							 }
						 }
					 }
     }
}
