package com.mubashir;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
    	File file = new File("/Users/mubashirkhadim/Documents/Mubashir.com/Mubashirhussain.txt");
    	file.createNewFile();
    	System.out.println("File Created");
    }
}
