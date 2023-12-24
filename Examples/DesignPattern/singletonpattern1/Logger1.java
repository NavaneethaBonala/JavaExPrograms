/*
 * Lab 1:
Create a simple Singleton Pattern for a logging class. Implement a Logger class
that logs messages. Ensure that only one instance of the Logger class can be
created, and all log messages are written to a single log file. Write a program to
demonstrate the usage of the Logger class to log messages from multiple parts
of the application.
 */

package singletonpattern1;

public class Logger1 {
	public static Logger1 log = new Logger1();
	
	private Logger1()
	{
		System.out.println("Logger instance");
	}
	
	public static Logger1 createobject()
	{
		return log;
	}
	
	public void LoggerInmsg()
	{
		System.out.println("Login Registered");
	}
	
	public void LoggerOutmsg()
	{
		System.out.println("Logout Registered");
	}
}
