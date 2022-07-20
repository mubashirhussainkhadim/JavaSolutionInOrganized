package com.mubashir;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
    	File directory = new File("/Users/mubashirkhadim/Documents/mubashir.com/author/Mubashir");
    	directory.mkdirs();
    	System.out.println("Diectory Created");
    	File file = new File("/Users/mubashirkhadim/Documents/mubashir.com/author/Mubashir/mubashirhussain.txt");
    	file.createNewFile();
    	System.out.println("File Created");

    }
}
