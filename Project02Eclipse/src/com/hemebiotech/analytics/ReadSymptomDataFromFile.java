package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Simple brute force implementation
 *
 */
public class ReadSymptomDataFromFile implements ISymptomReader {

	private static final String Symptoms = "symptoms.txt";
	/**
	 *
	 * @param filepath a full or partial path to file with symptom strings in it, one per line
	 */
	@Override
	public ArrayList<String> getSymptoms(String filepath){
		ArrayList<String> symptomsList = new ArrayList<String>();

		BufferedReader bufferedreader = null;
		FileReader filereader = null;
		try {
			filereader = new FileReader(filepath);//Charge le fichier à lire
			bufferedreader = new BufferedReader(filereader);//Lis le fichier depuis l'input reçu
			String symptomLine;
			while ((symptomLine = bufferedreader.readLine( ))!=null) {
				System.out.println(symptomLine);
				//Continue de parcourir et lire le fichier tant qu'il n'est pas vide puis affiche les lignes
				symptomsList.add(symptomLine);
					}

			} catch ( IOException e ) {//I/O = Input/Output
			e.printStackTrace( );//Montre où se trouve l'erreur
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

