package ua.khpi.oop.dubina001;

public class Main 
{
	public static void main(String[] args)
    {
        
        //task01
        
        final int A = 0x378; //зачетная книжка 888 в 16-системе
        final long B = 380972073771L; //в 10-системе
        final int C = 0b1000111; //в 2-системе
        final int D = 07273; //в 8-системе
        final int E = (26 % (8 - 1)) + 1; // равно 3
        final char F = 'C';// 3 буква в английском алфавите
        
        
        //task02
        int par = 0;
        int nepar = 0;
        
        int a = 0x378;
        System.out.println(a);

        while(a > 0)
        {
          if(a % 2 == 0)
          {
            par++;
            a/= 10;
          }
          else if(a % 2 != 0)
          {
            nepar++;
            a/= 10;
          }
        }
        System.out.printf("Количество парных: %d\n",par);

       System.out.printf("Количество не парных : %d\n",nepar);
        par=0;
        nepar=0;
        long b = 380501477411l;
        System.out.println(b);

        while(b > 0)
        {
          if(b % 2 == 0)
          {
            par++;
            b/= 10;
          }
          else if(b % 2 != 0)
          {
            nepar++;
            b/= 10;
          }
        }
        System.out.printf("Количество парных: %d\n",par);
        System.out.printf("Количество не парных: %d\n",nepar);
        par=0;
        nepar=0;
        int c = 11;
        System.out.println(c);

        while(c > 0)
        {
          if(c % 2 == 0)
          {
            par++;
            c/= 10;
          }
          else if(c % 2 != 0)
          {
            nepar++;
            c/= 10;
          }
        }
        System.out.printf("Количество парных: %d\n",par);
        System.out.printf("Количество не парных: %d\n",nepar);
        par=0;
        nepar=0;
        int d = 7411;
        System.out.println(d);

        while(d > 0)
        {
          if(d % 2 == 0)
          {
            par++;
            d/= 10;
          }
          else if(d % 2 != 0)
          {
            nepar++;
            d/= 10;
          }
        }
        System.out.printf("Количество парных: %d\n",par);
        System.out.printf("Количество не парных: %d\n",nepar);
        par=0;
        nepar=0;
        int e = 3;
        System.out.println(e);

        while(e > 0)
        {
          if(e % 2 == 0)
          {
            par++;
            e/= 10;
          }
          else if(e % 2 != 0)
          {
            nepar++;
            e/= 10;
          }
        }
        System.out.printf("Количество парных: %d\n",par);
        System.out.printf("Количество не парных: %d\n",nepar);
        //task03
        
        int ones = 0;
        int ex = 0b1;
        
        int a2 = 0b1101111000;
        System.out.println(Integer.toString(a2,2));       

        while(a2 > 0)
        {
          if((a2 & ex) != 0)
          {
            ones++;
            a2 = a2 >> 1;
          }
          else
          {
            a2 = a2 >> 1;
          }
        }
        System.out.printf("Количество единиц: %d\n", ones);
        ones=0;
        long b2 = 0b101100010110011101101001000001100101011l;
        System.out.println(Long.toString(b2,2));       

        while(b2 > 0)
        {
          if((b2 & ex) != 0)
          {
            ones++;
            b2 = b2 >> 1;
          }
          else
          {
            b2 = b2 >> 1;
          }
        }
        System.out.printf("Количество единиц: %d\n", ones);
        ones=0;
        int c2 = 0b1000111; 
        System.out.println(Integer.toString(c2,2));       

        while(c2 > 0)
        {
          if((c2 & ex) != 0)
          {
            ones++;
            c2 = c2 >> 1;
          }
          else
          {
            c2 = c2 >> 1;
          }
        }
        System.out.printf("Количество единиц: %d\n", ones);
        ones=0;

        int d2 = 0b111010111011; 
        System.out.println(Integer.toString(d2,2));       

        while(d2 > 0)
        {
          if((d2 & ex) != 0)
          {
            ones++;
            d2 = d2 >> 1;
          }
          else
          {
            d2 = d2 >> 1;
          }
        }
        System.out.printf("Количество единиц: %d\n", ones);
        ones=0;
        int e2 = 0b11; 
        System.out.println(Integer.toString(e2,2));       

        while(e2 > 0)
        {
          if((e2 & ex) != 0)
          {
            ones++;
            e2 = e2 >> 1;
          }
          else
          {
            e2 = e2 >> 1;
          }
        }
        System.out.printf("Количество единиц: %d\n", ones);
        
    

      }

  }


