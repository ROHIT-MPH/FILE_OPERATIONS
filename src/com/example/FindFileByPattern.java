package com.example;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class FindFileByPattern {
    public static void main(String[] args) {
        File Search = new File("Program_directory");
        List<File> matchData = new ArrayList<>();
        String type = "F";

        findFiles(Search, type, matchData);

        if (matchData.isEmpty()) {
            System.out.println("No matching files found.");
        } else {
            System.out.println("Matching files:");
            for (File file : matchData) {
                System.out.println(file.getName());
            }
        }
    }

    private static void findFiles(File Search, String type, List<File> matchData) {
        File[] files = Search.listFiles();
        if (files != null) {
            for (File file : files) {
                if (file.isDirectory()) {
                    findFiles(file, type, matchData);
                } else if (file.getName().startsWith(type)) {
                    matchData.add(file);
                }
            }
        }
    }
}