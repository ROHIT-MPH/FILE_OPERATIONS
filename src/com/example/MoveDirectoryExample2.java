package com.example;
import java.io.File;


public class MoveDirectoryExample2 {
	
	    public static void main(String[] args) {

	        File source = new File("Program_directory");
	        File destination= new File("example_directory");

	        if (!source.exists()) {
	            System.out.println("Source file does not exist.");
	            return;
	        }

	        if (!destination.exists()) {
	            destination.mkdir();
	        }

	        File destinationFile = new File(destination, source.getName());
	        
	        if (destinationFile.exists()) {
	            System.out.println("File with same name already exists in the destination directory.");
	            return;
	        }
	        boolean success = source.renameTo(destinationFile);
	        if (!success) {
	            System.out.println("Failed to move the file.");
	        } else {
	            System.out.println("File moved successfully.");
	        }
	    }
	}
