package com.ibm.training.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopier {

	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		
		if(args.length < 2) {
			System.out.println("You have to pass src file and dest file as cmdline args.");
			System.exit(0);
		}
		
		String srcFileName = args[0];
		String destFileName = args[1];
		
		try {
			FileInputStream fin = new FileInputStream(srcFileName);
			FileOutputStream fout = new FileOutputStream(destFileName);
			BufferedInputStream bin = new BufferedInputStream(fin);
			BufferedOutputStream bout = new BufferedOutputStream(fout);
			
			int aByte;
			
			while((aByte = bin.read()) != -1) {
				bout.write(aByte);
			}
			
			fin.close();
			fout.close();
			
		}catch (FileNotFoundException e) {
			System.out.println(srcFileName+" does not exist!");
			return;
		}catch (IOException e) {
			System.out.println("IO error: "+e.getMessage());
			return;
		}
		
		long stopTime = System.currentTimeMillis();
		System.out.println("Copied in "+(stopTime - startTime)+" ms.");
	}

}
