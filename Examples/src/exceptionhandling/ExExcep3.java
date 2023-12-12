package exceptionhandling;

import java.lang.*;

//multiple try catch block

class ExExcep3
{
      public static void main(String argv[])
      {
              int a=0,b=0,c,d;

      try // to check input errors
      {
              a = Integer.parseInt(argv[0]);
              b = Integer.parseInt(argv[1]);
              }
      catch(Exception e)
      {
              System.out.println("First Catch : " + e);
              }

      try
      {

              c = a/b;
              System.out.println(a + "/" + b + "=" + c);
              }
      catch(Exception e)
      {
              System.out.println("Second Catch : " + e);
              }

              d = a*b;
              System.out.println(a + "*" + b + "=" + d);
              }
      }

