/**
 * 
 */
package com.sellabs.sampleProg;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author Manjit
 *
 */
public class FileCreationWithTimeStamp {

	// Create a new file
	public static void CreateFileWithTimeStamp(String filename) {
		for (int i = 0; i < 5; i++) {
			// create a new file with Time Stamp
			File file = new File(
					"./" + filename + "_" + GetCurrentTimeStamp().replace(":", "_").replace(".", "_") + ".txt");

			try {
				if (!file.exists()) {
					file.createNewFile();
					System.out.println("File is created!... file name is " + file.getName());
				} else {
					System.out.println("File already exists");
				}
			} catch (IOException e) {
				e.printStackTrace();
			}

		}
	}

	// Get current system time
	public static String GetCurrentTimeStamp() {
		SimpleDateFormat sdfDate = new SimpleDateFormat("yyyy-MM-dd_HH:mm:ss.SSS");// dd/MM/yyyy
		Date now = new Date();
		String strDate = sdfDate.format(now);
		return strDate;
	}

	public static void main(String[] args) {
		CreateFileWithTimeStamp("sample");
	}

}
