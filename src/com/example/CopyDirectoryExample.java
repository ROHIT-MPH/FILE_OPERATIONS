package com.example;

import java.io.File;
import java.io.IOException;

public class CopyDirectoryExample {

    public static void main(String[] args) {
        File srcDir = new File("Program_directory");
        File destDir = new File("example_directory");
        try {
            copyDirectory(srcDir, destDir);
            System.out.println("Directory copied successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void copyDirectory(File source, File destination) throws IOException {
        if (!destination.exists()) {
            destination.mkdir();
        }

        File[] files = source.listFiles();
        for (File file : files) {
            if (file.isDirectory()) {
                copyDirectory(file, new File(destination, file.getName()));
            } else {
                File destFile = new File(destination, file.getName());
                copyFile(file, destFile);
            }
        }
    }

    public static void copyFile(File source, File destination) throws IOException {
        java.io.InputStream in = new java.io.FileInputStream(source);
        java.io.OutputStream out = new java.io.FileOutputStream(destination);
        byte[] Y = new byte[1024];
        int length;
        while ((length = in.read(Y)) > 0) {
            out.write(Y, 0, length);
        }
        in.close();
        out.close();
    }
}