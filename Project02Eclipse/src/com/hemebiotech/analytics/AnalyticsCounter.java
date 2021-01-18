package com.hemebiotech.analytics;

import java.util.ArrayList;
import java.util.Map;

public class AnalyticsCounter {

	public static void main(String[] args) {

//Lecture du fichier

		ReadSymptomDataFromFile reader = new ReadSymptomDataFromFile();
		String filepath = "Project02Eclipse/symptoms.txt";
		ArrayList<String> symptoms = reader.getSymptoms(filepath);
		System.out.println(symptoms.get(0));


//Traitement du fichier

		SymptomsCount count = new SymptomsCount();
		Map<String, Integer>symptomsMap = count.count(symptoms);


//Ecriture du fichier résultat


		SymptomsWriter writer = new SymptomsWriter();
		writer.write(symptomsMap);


	}

}
