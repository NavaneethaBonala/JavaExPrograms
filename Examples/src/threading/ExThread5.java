package threading;

class First extends Thread
{
        public void run()
        {
                for (int i=1;i<=5;i++)
                {
                        System.out.println("i = " + i);
                        // sleep(int milliseconds)
                        try
                        {
                                sleep(1000);
                                }
                        catch(Exception e)
                        {
                                System.out.println(e);                                
                                }
                        }
                System.out.println("End of First");
                }
        }

class Second extends Thread
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

class ExThread5
{
        @SuppressWarnings("removal")
		public static void main(String argv[])
        {
                First o1 = new First();
                Second o2 = new Second();

                
                o1.start();
                o2.start();

                for (int m=1;m<=5;m++)
                {
                        System.out.println("m = " + m);

                        if (m == 2)
                                o1.suspend();

                        if (m == 5)
                                o1.resume();
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
