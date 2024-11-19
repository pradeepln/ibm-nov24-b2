package com.ibm.training.io;

import java.io.File;
import java.time.LocalDateTime;
import java.util.Date;

public class FileDirListing {

	public static void main(String[] args) {
		String dirToList = (args.length > 0) ? args[0] : ".";
		
		File dir = new File(dirToList);
		
		if(dir.exists() && dir.isDirectory()) {
			File[] contents = dir.listFiles();
			for(File aFileOrDir : contents) {
				System.out.print(new Date(aFileOrDir.lastModified()));
				System.out.print("\t"+(aFileOrDir.isDirectory() ? "<DIR>" : "    "));
				System.out.print("\t"+(aFileOrDir.isFile() ? aFileOrDir.length() : "    "));
				System.out.println("\t"+aFileOrDir.getName());
			}
			
		}else {
			System.out.println(dirToList+" doest not exist or not a directory");
		}
	}

}
