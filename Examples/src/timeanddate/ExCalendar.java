package timeanddate;

import java.util.*;

class ExCalendar
{
        public static void main(String argv[])
        {

                Calendar c = Calendar.getInstance();

                System.out.println("Calendar : " + c);
                System.out.println("Day : " + c.get(Calendar.DATE));
                System.out.println("Month : " + c.get(Calendar.MONTH));
                System.out.println("Year : " + c.get(Calendar.YEAR));
                System.out.println("Hours : " + c.get(Calendar.HOUR));
                System.out.println("Minutes : " + c.get(Calendar.MINUTE));
                System.out.println("Seconds : " + c.get(Calendar.SECOND));
                System.out.println("Week of Year : " + c.get(Calendar.WEEK_OF_YEAR));
                }
        }
