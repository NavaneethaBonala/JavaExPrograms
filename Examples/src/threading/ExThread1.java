package threading;

class First1 extends Thread
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

class Second1 extends Thread
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

class ExThread1
{
        public static void main(String argv[]) 
        {
                First1 o1 = new First1();
                Second1 o2 = new Second1();

                o1.start();
                o2.start();

                System.out.println("End of Main");
                }
        }


