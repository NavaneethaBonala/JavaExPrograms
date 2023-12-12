package exceptionhandling;

public class NestedTry {


        public static void main(String argv[])
        {
                int a=0,b=0,c,d;

        try
        {
                a = Integer.parseInt(argv[0]);
                b = Integer.parseInt(argv[1]);

                try
                {
                        c = a/b;
                        System.out.println(a + "/" + b + "=" + c);
                        }
                catch(Exception e)
                {
                        System.out.println("Inner Catch : " + e);
                        }
                }
        catch(Exception e)
        {
                System.out.println("Outter Catch : " + e);
                }

                d = a*b;
                System.out.println(a + "*" + b + "=" + d);
                }
        }