package exceptionhandling;

import java.lang.*;

class ExExcep2
{
        public static void main(String argv[])
        {
                int a=0,b=0,c,d;
        try
        {
                a = Integer.parseInt(argv[0]);
                b = Integer.parseInt(argv[1]);

                c = a/b;
                System.out.println(a + "/" + b + "=" + c);
                }
        catch(Exception e)
        {
                System.out.println("Catch : " + e);
                e.printStackTrace();
                }

                d = a*b;
                System.out.println(a + "*" + b + "=" + d);
                }
        }

