package ua.khpi.oop.dubina002;
import java.util.Random;
public class Main 
{
	public static void main(String[] args)
	  {

	    int min=10000000;
	    int max=99999999;
	    int diff=max-min;
	   
	    Random random = new Random();
	    System.out.print("Сгенирированное число   |\t");
	     System.out.print("Сумма парных чисел      \t|");
	     System.out.print("Сумма  не парных чисел |\n");
	     System.out.print("------------------------|---------------------------------------|-----------------------|\n");



	    for(int q=0;q<11;q++)
	    {
	    	
	    	 int par=0;
		     int par_sum=0;
		     int nepar_sum=0;
	    int a = random.nextInt(diff + 1);
	    a += min;
	     System.out.print(a);
	     for(int i=0;i<8;i++)
	     {
	       par=a%10;
	       a=a/10;
	       if(par%2==0)
	       {
	         par_sum+=par;
	       }
	       else
	       {
	         nepar_sum+=par;
	       }
	     }
	     System.out.print("\t\t|\t");

	     System.out.print(par_sum);


	     System.out.print("\t\t\t\t|");
	     System.out.print(nepar_sum);
	     System.out.print("\t\t\t|\n");
	     System.out.print("\n------------------------|---------------------------------------|-----------------------|\n");


	     
	  }
}
}

