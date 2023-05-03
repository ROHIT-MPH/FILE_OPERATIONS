package com.example;

import java.io.*;

public class DeleteDirectoryExample {
	public static void main(String[] args) {
		String directoryPath =  "example_directory";
		File delfile = new File(directoryPath);
		if(delfile.exists()){
			System.out.println("Directory exists");
		}
		else{
			System.out.println("Directory does not exist");
		}

		boolean result = delfile.delete();
		if(result){
			System.out.println("Directory deleted");
		}
		else{
			System.out.println("Directory could not be deleted");
		}
	}
}



