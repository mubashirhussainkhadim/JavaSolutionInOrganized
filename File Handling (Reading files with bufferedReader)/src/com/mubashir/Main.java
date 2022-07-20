package com.mubashir;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args)  {
    	File file = new File("Mubashir");
        file.mkdir();
        file = new File("Mubashir/team.txt");
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(file ,true)) ){
        	bw.newLine();
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
        	System.out.println("Writting completed");
        	bw.close();

        } catch (IOException e) {
        	System.out.println("error occured , while creating the file");
		}
        try {
			BufferedReader br = new BufferedReader (new FileReader("Mubashir/team.txt"));
			String  line;
			System.out.println("**************");
			while((line = br.readLine()) != null){
				System.out.println(line);
			}
			br.close(); 
		} catch (FileNotFoundException e) {
			System.out.println("FileNotFoundException");
		} catch (IOException e) {
			System.out.println("IOException");
		}
    }
}
