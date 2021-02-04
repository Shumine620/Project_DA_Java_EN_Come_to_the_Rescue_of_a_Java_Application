package com.hemebiotech.analytics;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;


public class SymptomsWriter implements ISymptomsWriter {
    /**
     * Create a new file to write the results of symptomsMap
     *
     * @param resultsMap     File to write the collection of sorted symptoms
     * @param resultFilePath Path location for the file resultsMap
     */
    @Override
    public void writeFile(TreeMap <String, Integer> resultsMap, String resultFilePath) {

        try {
            FileWriter writer = new FileWriter(resultFilePath);//Creation du fichier

            for (Map.Entry <String, Integer> entryKeyValue : resultsMap.entrySet()) {
                writer.write("Symptom : " + entryKeyValue.getKey() + ", Occurrence : "
                        + entryKeyValue.getValue() + " times" + "\n");
            }
            writer.close();

            System.out.println("Successfully wrote to the file.");
        } catch ( IOException e ) {
            System.out.println("An error occurred during writing.");
            e.printStackTrace();
        }
    }
}