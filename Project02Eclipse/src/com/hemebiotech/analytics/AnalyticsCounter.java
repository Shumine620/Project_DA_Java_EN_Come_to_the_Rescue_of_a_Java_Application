
package com.hemebiotech.analytics;

import java.util.ArrayList;
import java.util.TreeMap;

public class AnalyticsCounter {
	/**
	 *Simple brute force implementation
	 * Main allowing to launch the complete program : read, sort, count and write all the symptoms from a file
	 * @param args symptoms
	 */
	public static void main(String[] args) {

		/**Reading of the file */

		ReadSymptomDataFromFile reader = new ReadSymptomDataFromFile();
		String filepath = "Project02Eclipse/symptoms.txt";
		ArrayList<String> symptoms = reader.getSymptoms(filepath);
		System.out.println(symptoms.get(0));

/** Counting the symptoms and sorting them*/

		SymptomsCount count = new SymptomsCount();
		TreeMap<String, Integer> symptomsMap = count.count(symptoms);

/** Writing the result on a dedicated file*/
		String resultFilePath = "results-out";
		SymptomsWriter writer = new SymptomsWriter();
		writer.writeFile(symptomsMap, resultFilePath);
	}
}
