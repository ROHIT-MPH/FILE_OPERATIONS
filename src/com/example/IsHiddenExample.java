package com.example;

import java.io.*;
  
public class IsHiddenExample {
    public static void main(String args[])
    {
  
        File file = new File("C:\\Users\\MPH\\Desktop\\JAVA ECLIPSE\\FILES\\example_directory\\HELLO.txt");
  

        if (file.isHidden())
            System.out.println("File Hidden");
        else
            System.out.println("File Not Hidden");
    }
}
