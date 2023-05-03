package com.example;

import java.io.*;

public class ProgramDirectoryExample {
    public static void main(String[] args) {
        String directoryPath = "Program_directory";

        // Create File object with the directory path
        File directory = new File(directoryPath);

        // Create directory using mkdir()
        boolean result = directory.mkdir();

        if (result) {
            System.out.println("Porgram-Directory created successfully.");
        } else {
            System.out.println("Directory already exists.");
        }
    }
}

