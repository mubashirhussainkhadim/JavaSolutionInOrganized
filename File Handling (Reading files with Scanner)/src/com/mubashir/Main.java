package com.mubashir;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
           public static void main(String[] args) {
        	   try {
				Scanner sc = new Scanner(new File("team.txt"));
				String line;
				while(sc.hasNext()) {
					line = sc.nextLine();
					System.out.println(line);
				}
			} catch (FileNotFoundException e) {
				System.out.println("FileNotFoundException");
			}
           }
}
