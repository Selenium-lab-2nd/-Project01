/**
 * 
 */
package com.sellabs.sampleProg;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author Manjit
 *
 */
public class CreateFileWithTimeStamp {

	// Create a new file
	public static void CreateFolderWithTimeStamp(String filename) {
		for (int i = 0; i < 5; i++) {
			// create a new file with Time Stamp
			File file = new File("./" + filename + "_" + GetCurrentTimeStamp().replace(":", "_").replace(".", "_") + i);

			if (!file.exists()) {
				if (file.mkdir()) {
					System.out.println("Directory is created!.. Directory Name is :" + file.getName());
				}

			} else {
				System.out.println("Failed to create directory!");
			}
		}
	}

	// Get current system time
	public static String GetCurrentTimeStamp() {
		SimpleDateFormat sdfDate = new SimpleDateFormat("yyyy-MM-dd_HH:mm:ss");// dd/MM/yyyy
		Date now = new Date();
		String strDate = sdfDate.format(now);
		return strDate;
	}

	public static void main(String[] args) {
		CreateFolderWithTimeStamp("sample");
	}

}
