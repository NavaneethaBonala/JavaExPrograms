package timeanddate;

import java.util.*;

class ExDate
{
        public static void main(String argv[])
        {
                Date d = new Date();

                System.out.println("Date : " + d);
                System.out.println("Day : " + d.getDay());
                System.out.println("Month : " + d.getMonth());
                System.out.println("Year : " + d.getYear());
                System.out.println("Hours : " + d.getHours());
                System.out.println("Minutes : " + d.getMinutes());
                System.out.println("Seconds : " + d.getSeconds());
                }
        }
