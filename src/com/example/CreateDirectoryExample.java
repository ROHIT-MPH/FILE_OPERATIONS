package com.example;

import java.io.*;

public class CreateDirectoryExample {
    public static void main(String[] args) {
        String directoryPath = "example_directory";

        // Create File object with the directory path
        File directory = new File(directoryPath);

        // Create directory using mkdir()
        boolean result = directory.mkdir();

        if (result) {
            System.out.println("Directory created successfully.");
        } else {
            System.out.println("Directory already exists");
        }
    }
}

//THIS CODE IS CREATED AND THIS IS AGAIN DELETED USING THE DeleteDirectoryExample