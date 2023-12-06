package timeanddate;

import java.util.*;

class ExStringTokenizer2
{
        public static void main(String argv[])
        {
                String s = "This is a sample text";

                StringTokenizer st = new StringTokenizer(s," ");

                while (st.hasMoreTokens())
                        System.out.println(st.nextToken());
                }
        }

