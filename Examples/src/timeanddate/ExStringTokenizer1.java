package timeanddate;

import java.util.*;

class ExStringTokenizer1
{
        public static void main(String argv[])
        {
                String s = "Ram/Sam,Sekar,Mohan,Raju";

// StringTokenizer(String obj, String delimitor)
                StringTokenizer st = new StringTokenizer(s,"/,");

// String nextToken()
// boolean hasMoreTokens()
                while (st.hasMoreTokens())
                        System.out.println(st.nextToken());
                }
        }
