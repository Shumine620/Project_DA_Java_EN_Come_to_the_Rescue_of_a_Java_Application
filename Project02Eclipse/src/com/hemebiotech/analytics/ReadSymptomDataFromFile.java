package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;


public class ReadSymptomDataFromFile implements ISymptomReader {

    /**
     * Read the text from the file "symptoms.txt"
     * Create an ArrayList of the collected information
     *
     * @param filepath a full or partial path to file with symptom strings in it, one per line
     * @return List of symptoms from filepath
     * @throws IOException e exception file cannot be read or if missing
     */
    @Override

    public ArrayList <String> getSymptoms(String filepath) {
        ArrayList <String> symptomsList = new ArrayList <String>();

        BufferedReader bufferedreader = null;
        FileReader filereader = null;

        try {

            filereader = new FileReader(filepath);
            bufferedreader = new BufferedReader(filereader);
            String symptomLine;
            while ((symptomLine = bufferedreader.readLine())!=null) {
                System.out.println(symptomLine);

                symptomsList.add(symptomLine);
            }

        } catch ( IOException e ) {
            e.printStackTrace();
        } finally {
            try {
                if (bufferedreader!=null)
                    bufferedreader.close();
                if (filereader!=null)
                    filereader.close();
            } catch ( IOException e ) {
                e.printStackTrace();
            }
        }
        return symptomsList;
    }
}
