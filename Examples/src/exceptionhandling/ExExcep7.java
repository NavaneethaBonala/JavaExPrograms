package exceptionhandling;

import java.lang.*;
//throw - keyword which is used to call the catch function by the user.

class ExExcep7
{
     public static void main(String argv[])
     {
             int a=0,b=0,c,d;

     try
     {
             if (argv.length < 2)
             {
       Exception o = new Exception("Pass 2 args ....");
                     throw(o);
                     }
             a = Integer.parseInt(argv[0]);
             b = Integer.parseInt(argv[1]);
             if (b == 0)
             {
Exception o = new Exception("Second arg must be non-zero value ....");
                     throw(o); }
             c = a/b;
             System.out.println(a + "/" + b + "=" + c);
             }
     catch(Exception e)
     {
             System.out.println(e);
             }

             d = a*b;
             System.out.println(a + "*" + b + "=" + d);
             }
     }
