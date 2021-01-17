package com.hemebiotech.analytics;

import java.util.ArrayList;
import java.util.Map;

public class AnalyticsCounter {
	private static int headacheCount = 0;
	private static int rashCount = 0;		// initialize to 0
	private static int pupilCount = 0;		// initialize to 0
	private static String filepath = "Project02Eclipse/symptoms.txt";
	private static String symptomsMap;



	public static void main(String args[]) throws Exception {
		//Lecture du fichier

		ReadSymptomDataFromFile reader = new ReadSymptomDataFromFile();
		ArrayList<String> symptoms = reader.getSymptoms(filepath);
		System.out.println(symptoms.get(0));


//Traitement du fichier

		SymptomsCount count = new SymptomsCount();
		Map<String, Integer>symptomsMap;
		//ArrayList <String> symptomsList = count.getSymptomsList();
		symptomsMap = count.count(symptomsList);
		System.out.println(symptomsMap);
		System.out.println(count);
		System.out.println(symptomsList);


		//Ecriture du fichier résultat

		/** first get input
		 BufferedReader reader = new BufferedReader (new FileReader("symptoms.txt"));
		 String line = reader.readLine();

		 int i = 0;
		 int headCount = 0;	// counts headaches
		 while (line != null) {
		 i++;
		 System.out.println("symptom from file: " + line);
		 if (line.equals("headache")) {
		 headCount++;
		 System.out.println("number of headaches: " + headCount);
		 }
		 else if (line.equals("rush")) {
		 rashCount++;
		 }
		 else if (line.contains("pupils")) {
		 pupilCount++;
		 }

		 line = reader.readLine();	// get another symptom
		 }

		 // next generate output
		 FileWriter writer = new FileWriter ("result.out");
		 writer.write("headache: " + headacheCount + "\n");
		 writer.write("rash: " + rashCount + "\n");
		 writer.write("dialated pupils: " + pupilCount + "\n");
		 writer.close();*/
	}

}
