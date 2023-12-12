package timeanddate;

import java.util.*;

class ExStringTokenizer3
{
        public static void main(String argv[])
        {
// Entry - Key & Value
                String s = "RollNo=100;StudName=Raja;Degree=MCA";

                StringTokenizer st = new StringTokenizer(s,"=;");

                while (st.hasMoreTokens())
                        System.out.println(st.nextToken() + "=" + st.nextToken());
                }
        }
