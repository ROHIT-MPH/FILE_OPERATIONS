package com.example;

import java.io.File;

public class ParentExample {

	public static void main(String[] args) {
				
				File file = new File("C:\\Users\\MPH\\Desktop\\JAVA ECLIPSE\\FILES\\Program_directory");
				String parentDirectory = file.getParent();
				
				String Filename =file.getName();

				System.out.println(Filename +" is in folder "+ parentDirectory);
			}
	}
