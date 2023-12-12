package inputoutputfilehandling;

import java.io.*;

public class Student implements Serializable
{
	private static final long serialVersionUID = 1L;
	int RollNo;
    String Name, Degree;
    float Perc;

    Student(int RollNo, String Name, String Degree, float Perc)
    {
            this.RollNo = RollNo;
            this.Name = Name;
            this.Degree = Degree;
            this.Perc = Perc;
            }

    public void Show()
    {
            System.out.println("RollNo : "  + RollNo);
            System.out.println("Name   : "  + Name);
            System.out.println("Degree : "  + Degree);
            System.out.println("Perc   : "  + Perc);
            }
    }