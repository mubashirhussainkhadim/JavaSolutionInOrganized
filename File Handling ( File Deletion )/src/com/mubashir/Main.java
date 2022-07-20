package com.mubashir;

import java.io.File;

public class Main {
    public static void main(String[] args) {
    	File file = new File("team.txt");
    	if(file.delete()) {
    		System.out.println("Deletion is succesful");
    	}else {
    		System.out.println("Error while deleting");
    	}
    }
}
