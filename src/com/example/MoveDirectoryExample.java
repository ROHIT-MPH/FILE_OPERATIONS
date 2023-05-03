package com.example;


import java.io.*;

public class MoveDirectoryExample
{
	public static void main(String[] args)
	{
		File file = new File("C:\\Users\\MPH\\Desktop\\JAVA ECLIPSE\\FILES\\Program_directory\\Files.txt");
		

		if(file.renameTo
		(new File("C:\\Users\\MPH\\Desktop\\JAVA ECLIPSE\\FILES\\Hello.txt")))
		{

			file.delete();
			System.out.println("File moved successfully");
		}
		else
		{
			System.out.println("Failed to move the file");
		}

		
	}
}
