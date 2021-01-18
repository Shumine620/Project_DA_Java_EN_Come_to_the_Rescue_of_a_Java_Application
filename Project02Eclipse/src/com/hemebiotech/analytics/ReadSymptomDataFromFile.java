package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Simple brute force implementation
 */
public class ReadSymptomDataFromFile implements ISymptomReader {

	private static final String Symptoms = "symptoms.txt";
	/**
	 *
	 * @param filepath a full or partial path to file with symptom strings in it, one per line
	 * @return List of symptoms from filepath
	 * @throws IOException if file cannot be read or if missing
	 */
	@Override
	public ArrayList<String> getSymptoms(String filepath){
		ArrayList<String> symptomsList = new ArrayList<String>();

		BufferedReader bufferedreader = null;
		FileReader filereader = null;

		try {
			filereader = new FileReader(filepath);
			bufferedreader = new BufferedReader(filereader);
			String symptomLine;
			while ((symptomLine = bufferedreader.readLine( ))!=null) {
				System.out.println(symptomLine);

				symptomsList.add(symptomLine);
					}

			} catch ( IOException e ) {
			e.printStackTrace( );
		} finally {
			try {
				if (bufferedreader!=null)
					bufferedreader.close( );
				if (filereader!=null)
					filereader.close( );
			} catch ( IOException e ) {
				e.printStackTrace( );
			}
					}
		return symptomsList;
	}
}

