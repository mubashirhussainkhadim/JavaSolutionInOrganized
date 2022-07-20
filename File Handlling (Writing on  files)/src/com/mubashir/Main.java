package com.mubashir;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args)  {
    	File file = new File("Mubashir");
        file.mkdir();
        file = new File("Mubashir/team.txt");
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(file ,true)) ){
        	bw.write("Mubashir");
        	bw.newLine();
        	bw.write("Daniyal");
        	bw.newLine();
        	bw.write("Minahil");
        	bw.newLine();
        	bw.write("Fatima");
        	bw.newLine();
        	bw.write("kamran");
        	bw.newLine();
        	bw.write("Khuram");
        	bw.newLine();
        	bw.write("REHAM");
        	bw.newLine();
        	System.out.print("Writting completed");

        } catch (IOException e) {
        	System.out.println("error occured , while creating the file");
		}
    }
}
