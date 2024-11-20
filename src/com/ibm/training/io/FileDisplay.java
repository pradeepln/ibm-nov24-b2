package com.ibm.training.io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileDisplay {

	public static void main(String[] args) {
		if(args.length < 1) {
			System.out.println("You have to pass file name as cmdline arg.");
			System.exit(0);
		}

		String fileName = args[0];
		
		try {
			FileReader fin = new FileReader(fileName);
			BufferedReader br = new BufferedReader(fin);
			
			String aLine;
			while((aLine = br.readLine()) != null) {
				System.out.println(aLine);
			}
			
			br.close();
		}catch (FileNotFoundException e) {
			System.out.println(fileName+" does not exist!");
			return;
		}catch (IOException e) {
			System.out.println("IO error: "+e.getMessage());
			return;
		}
	}

}
