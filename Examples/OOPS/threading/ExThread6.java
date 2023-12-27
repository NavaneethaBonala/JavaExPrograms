package threading;

class First2 extends Thread
{
        public void run() 
        {
                for (int i=1;i<=5;i++)
                {
                        System.out.println("i = " + i);
                        try
                        {
                                sleep(1000);      }
                        catch(Exception e)
                        {
                               System.out.println(e);                                
                                }
                        }
                System.out.println("End of First");
                }
        }

class Second2 extends Thread
{
        public void run() 
        {
                for (int j=1;j<=5;j++)
                {
                        System.out.println("j = " + j);
                        try
                        {
                                sleep(1000);
                                }
                        catch(Exception e)
                        {
                                System.out.println(e);                                
                                }
                        }
                System.out.println("End of Second");
                }
        }

class Third extends Thread
{
        public void run() 
        {
                for (int k=1;k<=5;k++)
                {
                        System.out.println("k = " + k);
                        try
                        {
                                sleep(1000);
                                }
                        catch(Exception e)
                        {
                                System.out.println(e);                                
                                }
                        }
                System.out.println("End of Third");
                }
        }

class ExThread6 
{
        public static void main(String argv[]) 
        {
                First o1 = new First();
                Second o2 = new Second();
                Third o3 = new Third();

                o1.setPriority(Thread.MIN_PRIORITY);
                o2.setPriority(Thread.NORM_PRIORITY);
                o3.setPriority(Thread.MAX_PRIORITY);
                o3.start();
                o2.start();
                o1.start();                

                for (int m=1;m<=5;m++)
                {
                        System.out.println("m = " + m);

                        try
                        {
                                Thread.sleep(1000);
                                }
                        catch(Exception e)
                        {
                                System.out.println(e);                                
                                }

                        }

                System.out.println("End of Main");
                }
        }

